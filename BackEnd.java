import org.antlr.v4.runtime.tree.*;

class BackEnd {
    private ParseTree tree;
    private MyUI myUI;

    BackEnd(ParseTree t, MyUI ui) {
        tree = t;
        myUI = ui;
    }
    void run() {
        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener eval = new MyListener();
        eval.setUI(myUI);
        walker.walk(eval, tree);
    }
}
