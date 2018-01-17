
import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main extends JavaLexerBaseVisitor {
	private static final String DEFAULT_OUTPUT_FILE = "out.uxf";
	private LukeTreeListener luke = new LukeTreeListener();

	@Parameter(names="-o", description="output file name")
	private String outputFileName;

	@Parameter(description = "Files...")
	private List<String> files = new ArrayList<>();

	public static void main(String[] args) {
		Main main = new Main();
		main.run(args);
	}

	private void parseFiles(List<String> fileNames) {
		File[] files = new File[fileNames.size()];

		for (int i = 0; i < fileNames.size(); i++) {
			files[i] = new File(fileNames.get(i));
		}

		parseFiles(files);
	}

	private void parseFiles(File[] files) {
		for (File f : files) {
			if (f.exists()) {
				if (f.isDirectory()) {
					System.out.println("Betrete Verzeichnis " + f.getName());
					parseFiles(f.listFiles());

				} else {
					parse(f.getAbsolutePath());
					//System.out.println("Datei: " + f.getName());
				}
			}
		}
	}

	private void run(String[] args) {
		JCommander commander = JCommander.newBuilder().addObject(this).build();
		commander.parse(args);

		if (this.outputFileName == null || this.outputFileName.isEmpty()) {
			this.outputFileName = DEFAULT_OUTPUT_FILE;
		}

		if (this.files.isEmpty()) {
			commander.usage();
			return;
		}

		parseFiles(this.files);

		StringBuilder sb = new StringBuilder();

		sb.append(getHeader());
		sb.append(luke.getClasses());
		sb.append(getFooter());

		try {
			Files.write(Paths.get(outputFileName), sb.toString().getBytes(StandardCharsets.UTF_8));

		} catch (IOException e) {
			System.out.println("Error saving file: " + e.getMessage());
		}

		System.out.println(sb.toString());
	}

	private void parse(String path){
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

	private static String getHeader(){
		return  "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
				"<diagram program=\"umlet\" version=\"14.2\">\n" +
				"  <zoom_level>10</zoom_level>";
	}

	private static String getFooter(){
		return "</diagram>";
	}
}
