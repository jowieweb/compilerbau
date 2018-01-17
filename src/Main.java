
import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
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

	@Parameter(names={"-h", "--help"}, help = true)
	private boolean help;

	@Parameter(names="-u", description="Path to umlet jar")
	private String umletJarpath = "";

	@Parameter(names="-o", description="output file name")
	private String outputFileName;

	@Parameter(description = "Files...")
	private List<String> files = new ArrayList<>();

	@Parameter(names={"-e", "--export"}, description="Export diagram. Supported types: bmp, eps, gif, jpg, pdf, png, svg")
	private String exportFormat;

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

		if (this.files.isEmpty() || this.help) {
			commander.usage();
			return;
		}

		parseFiles(this.files);

		StringBuilder sb = new StringBuilder();

		sb.append(getHeader());
		sb.append(luke.getClasses());
		sb.append(getFooter());

		// Save diagram
		try {
			Files.write(Paths.get(outputFileName), sb.toString().getBytes(StandardCharsets.UTF_8));

		} catch (IOException e) {
			System.out.println("Error saving file: " + e.getMessage());
		}

		// Convert file with UMLet if requested
		convertWithUMLet();

		System.out.println(sb.toString());
	}

	private void convertWithUMLet() {
		if (this.exportFormat != null && !this.exportFormat.isEmpty()) {
			if (this.umletJarpath == null || this.umletJarpath.isEmpty()) {
				System.out.println("Path to UMLet .jar not specified. Skipping conversion.");
				System.out.println("Use --help to display usage information.");
				return;
			}

			try {
				String uxfFile = new File(this.outputFileName).getAbsolutePath();
				ProcessBuilder processBuilder = new ProcessBuilder("java", "-jar", this.umletJarpath,
						"-action=convert", "-format=" + this.exportFormat,
						"-filename=" + uxfFile).redirectError(ProcessBuilder.Redirect.INHERIT);

				System.out.println("Starting UMLet for conversion...");

				Process process = processBuilder.start();
				int status = process.waitFor();
				System.out.println("Umlet exited with status " + status);

			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
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
