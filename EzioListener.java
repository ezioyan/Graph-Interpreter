// Generated from /Users/ezio/IdeaProjects/MyInterpreter/src/Ezio.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EzioParser}.
 */
public interface EzioListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EzioParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EzioParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzioParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EzioParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzioParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EzioParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzioParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EzioParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzioParser#originStatement}.
	 * @param ctx the parse tree
	 */
	void enterOriginStatement(EzioParser.OriginStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzioParser#originStatement}.
	 * @param ctx the parse tree
	 */
	void exitOriginStatement(EzioParser.OriginStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzioParser#scaleStatement}.
	 * @param ctx the parse tree
	 */
	void enterScaleStatement(EzioParser.ScaleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzioParser#scaleStatement}.
	 * @param ctx the parse tree
	 */
	void exitScaleStatement(EzioParser.ScaleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzioParser#rotStatement}.
	 * @param ctx the parse tree
	 */
	void enterRotStatement(EzioParser.RotStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzioParser#rotStatement}.
	 * @param ctx the parse tree
	 */
	void exitRotStatement(EzioParser.RotStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzioParser#colorStatement}.
	 * @param ctx the parse tree
	 */
	void enterColorStatement(EzioParser.ColorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzioParser#colorStatement}.
	 * @param ctx the parse tree
	 */
	void exitColorStatement(EzioParser.ColorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzioParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(EzioParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzioParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(EzioParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(EzioParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(EzioParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(EzioParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(EzioParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarT}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarT(EzioParser.VarTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarT}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarT(EzioParser.VarTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Const}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConst(EzioParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConst(EzioParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusMinusExpr}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpr(EzioParser.PlusMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusMinusExpr}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpr(EzioParser.PlusMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedExpr}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpr(EzioParser.NestedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedExpr}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpr(EzioParser.NestedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(EzioParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(EzioParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(EzioParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link EzioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(EzioParser.FuncExprContext ctx);
}