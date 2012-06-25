import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        AntlrLexer lex = new AntlrLexer(new ANTLRFileStream("A:\\University\\Project\\x-sugar\\OWLIntersection\\OWLIntersection.xsg", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        AntlrParser g = new AntlrParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}