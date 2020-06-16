import java.io.*;
import org.antlr.runtime.*;

public class ScanMain {
    public static void main(String args[]) throws Exception {
        //ExprLexer lexer = new ExprLexerer(new ANTLRFileStream(args[0]));
	ProjLangLexer lexer = new ProjLangLexer(new ANTLRInputStream(System.in));
	Token tok = lexer.nextToken();
	while (tok.getType() != Token.EOF) {
	    System.out.println("Lexeme = " + tok.getText() + " Token = " + tok.getType());
	    tok = lexer.nextToken();
	}
    }
}
