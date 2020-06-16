import java.io.*;
import org.antlr.runtime.*;

public class ParseMain {
    public static void main(String args[]) throws Exception {
	//ExprLexer lexer = new ExprLexer(new ANTLRFileStream(args[0]));
	ProjLangLexer lexer = new ProjLangLexer(new ANTLRInputStream(System.in));
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	ProjLangParser parser = new ProjLangParser(tokens);
	parser.input();
	}
}

