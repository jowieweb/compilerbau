
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;

public class Main extends JavaLexerBaseVisitor {
	LukeTreeListener luke = new LukeTreeListener();

	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		StringBuilder sb = new StringBuilder();


		for (File f : new File("test/").listFiles()) {
			if (!f.isDirectory()) {
				parse(f.getPath());
			}
		}
		sb.append(getHeader());
		sb.append(luke.getClasses());
		sb.append(getFooter());

		System.out.println(sb.toString());



	}

	public  void parse(String path){
		try {
			Lexer lexer = new JavaLexerLexer(CharStreams.fromFileName(path));

			CommonTokenStream tokens = new CommonTokenStream(lexer);
			JavaLexerParser parser = new JavaLexerParser(tokens);
			ParseTree parseTree = parser.r();


			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(luke, parseTree);


		} catch (IOException e) {
			e.printStackTrace();
		}
	}




	public static String getHeader(){
		return  "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
				"<diagram program=\"umlet\" version=\"14.2\">\n" +
				"  <zoom_level>10</zoom_level>";
	}

	public  static String getFooter(){
		return "</diagram>";
	}
}
