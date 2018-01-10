public class LukeTreeWalker extends JavaLexerBaseVisitor<Void> {
	public Void visitConstructor(JavaLexerParser.ConstructorContext ctx) {
		System.out.println("Kontext: " + ctx.class_name().getText());

		return super.visitConstructor(ctx);
	}

}
