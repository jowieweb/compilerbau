
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main extends JavaLexerBaseVisitor {
	public static void main(String[] args) {
		try {
			Lexer lexer = new JavaLexerLexer(CharStreams.fromFileName("test/Kreis.java"));
			//Token t = lexer.nextToken();

			/*while (t.getType() != Token.EOF) {
				System.out.println(t);
				t = lexer.nextToken();
			}*/

			CommonTokenStream tokens = new CommonTokenStream(lexer);
			JavaLexerParser parser = new JavaLexerParser(tokens);
			ParseTree parseTree = parser.r();

			LukeTreeWalker walker = new LukeTreeWalker();

			System.out.println(walker.visit(parseTree));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
