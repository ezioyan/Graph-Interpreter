import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MyListener extends EzioBaseListener {
    private MyUI myUI = null;
    private double valueOfT =0;
    private double originX =0;
    private double originY =0;
    private double scaleX =1;
    private double scaleY =1;
    private double rotate =0;
    private uiPixelAttrib  pixelAttrib = new uiPixelAttrib();
    private ParseTreeProperty<Double> values = new ParseTreeProperty();

    MyListener() {}

    void setUI(MyUI ui) {
        myUI = ui;
    }

    private void setValue(ParseTree node, double value) {
        values.put(node, value);
    }

    private double getValue(ParseTree node) {
        return values.get(node);
    }

    @Override public void exitOriginStatement(EzioParser.OriginStatementContext ctx) {
        originX = getValue( ctx.expr(0) );
        originY = getValue( ctx.expr(1) );
    }

    @Override public void exitScaleStatement(EzioParser.ScaleStatementContext ctx) {
        scaleX = getValue( ctx.expr(0) );
        scaleY = getValue( ctx.expr(1) );
    }

    @Override public void exitRotStatement(EzioParser.RotStatementContext ctx) {
        rotate = getValue( ctx.expr() );
    }

    @Override public void exitColorStatement(EzioParser.ColorStatementContext ctx) {
        TerminalNode node = ctx.RED();
        if(node != null) {
            pixelAttrib = new uiPixelAttrib(255,0,0);
            return;
        }
        node = ctx.YELLOW();
        if(node != null) {
            pixelAttrib = new uiPixelAttrib(255, 255, 0);
            return;
        }

        node = ctx.GREEN();
        if(node != null) {
            pixelAttrib = new uiPixelAttrib(0, 255, 0);
            return;
        }
        node = ctx.BLUE();
        if(node != null) {
            pixelAttrib = new uiPixelAttrib(0, 0, 255);
            return;
        }

        node = ctx.BLACK();
        if(node != null) {
            pixelAttrib = new uiPixelAttrib(0, 0, 0);
            return;
        }

        double r = getValue( ctx.expr(0) );
        double g = getValue( ctx.expr(1) );
        double b = getValue( ctx.expr(2) );

        pixelAttrib = new uiPixelAttrib(((int) r), ((int) g), ((int) b));
    }

    @Override public void exitForStatement(EzioParser.ForStatementContext ctx) {
        if(pixelAttrib == null)
            pixelAttrib = new uiPixelAttrib();
        double Tbegin = getValue( ctx.expr(0));
        double Tend   = getValue( ctx.expr(1));
        double Tstep  = getValue( ctx.expr(2));

        ParseTreeWalker walker = new ParseTreeWalker();
        for(valueOfT = Tbegin; valueOfT <Tend; valueOfT += Tstep) {
            walker.walk(this , ctx.expr(3));
            double x = getValue( ctx.expr(3) );
            walker.walk(this , ctx.expr(4));
            double y = getValue( ctx.expr(4) );
            x *= scaleX; y *= scaleY;
            double tmp;
            tmp = x*Math.cos(rotate) + y*Math.sin(rotate);
            y = y*Math.cos(rotate)-x*Math.sin(rotate);
            x = tmp;
            x += originX;
            y += originY;
            myUI.drawPixel(((int) x), ((int) y), pixelAttrib);
        }
    }

    @Override public void exitPowerExpr(EzioParser.PowerExprContext ctx) {
        double left = getValue( ctx.expr(0) );
        double right = getValue( ctx.expr(1) );
        double value = Math.pow(left, right);
        setValue(ctx, value);
    }

    @Override public void exitMulDivExpr(EzioParser.MulDivExprContext ctx) {
        double left = getValue( ctx.expr(0) );
        double right = getValue( ctx.expr(1) );
        double value;
        if( ctx.MUL() != null ) value = left * right;
        else value = left / right;
        setValue(ctx, value);
    }

    @Override public void exitVarT(EzioParser.VarTContext ctx) {
        setValue(ctx, valueOfT);
    }

    @Override public void exitConst(EzioParser.ConstContext ctx) {
        Token tk = ctx.CONST_ID().getSymbol();
        String vName = tk.getText().toLowerCase();
        double value;

        if(vName.equals("pi")) value = Math.PI;
        else if(vName.equals("e")) value = Math.E;
        else {
            try {
                value = Double.valueOf(vName);
            } catch(Exception e) {
                myUI.showMessage("error " + tk.getLine() + ":"
                        + tk.getCharPositionInLine()
                        + "'" + vName  +"'" );
                value = 0;
            }
        }
        setValue(ctx, value);
    }

    @Override public void exitPlusMinusExpr(EzioParser.PlusMinusExprContext ctx) {
        double left = getValue( ctx.expr(0) );
        double right = getValue( ctx.expr(1) );
        double value;
        if( ctx.PLUS() != null ) value = left + right;
        else value = left - right;
        setValue(ctx, value);
    }

    @Override public void exitNestedExpr(EzioParser.NestedExprContext ctx) {
        setValue(ctx, getValue(ctx.expr()));
    }

    @Override public void exitUnaryExpr(EzioParser.UnaryExprContext ctx) {
        double value = getValue( ctx.expr() );
        if( ctx.PLUS() == null ) value = -1 * value;
        setValue(ctx, value);
    }

    @Override public void exitFuncExpr(EzioParser.FuncExprContext ctx) {
        Token id = ctx.ID().getSymbol();
        String funcName = id.getText().toLowerCase();
        double value = 0;
        double param = getValue(ctx.expr());
        switch (funcName) {
            case "sin":
                value = Math.sin(param);
                break;
            case "cos":
                value = Math.cos(param);
                break;
            case "tan":
                value = Math.tan(param);
                break;
            case "ln":
                value = Math.log(param);
                break;
            case "exp":
                value = Math.exp(param);
                break;
            case "sqrt":
                value = Math.sqrt(param);
                break;
            default:
                myUI.showMessage("error " + id.getLine() + ":"
                        + id.getCharPositionInLine()
                        + "wrong func name '" + funcName + "'");
                break;
        }
        setValue(ctx, value);
    }

    @Override public void exitEveryRule(ParserRuleContext ctx) {}
}
