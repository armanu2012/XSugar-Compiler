import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        Antlr1Lexer lex = new Antlr1Lexer(new ANTLRFileStream("A:\\University\\Project\\x-sugar\\OWLIntersection\\OWLIntersection.xsg", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        Antlr1Parser g = new Antlr1Parser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}