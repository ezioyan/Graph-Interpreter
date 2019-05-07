import java.io.FileInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

class FrontEnd {
    private ParseTree tree = null;
    private String theFilePath;

    FrontEnd(String filePath) {
        theFilePath = filePath;
    }
    ParseTree getTree() {
        return tree;
    }
    int doParse() throws Exception {
        java.io.InputStream is = System.in;
        if ( theFilePath != null )
            is = new FileInputStream(theFilePath);
        ANTLRInputStream input =new ANTLRInputStream(is);
        EzioLexer lexer = new EzioLexer(input);
        CommonTokenStream tokens =new CommonTokenStream(lexer);
        EzioParser parser =new EzioParser(tokens);
        tree = parser . program ();
        return parser.getNumberOfSyntaxErrors();
    }
}
