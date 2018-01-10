public class LukeTreeWalker extends JavaLexerBaseVisitor<Void> {
	public Void visitConstructor(JavaLexerParser.ConstructorContext ctx) {
		System.out.println("Konstruktor: " + ctx.class_name().getText());

		return super.visitConstructor(ctx);
	}

	public Void visitClass_def(JavaLexerParser.Class_defContext ctx) {
		System.out.println("Class_def: " + ctx.class_name(0).getText());

		return super.visitClass_def(ctx);
	}

	public Void visitMethod_sig(JavaLexerParser.Method_sigContext ctx) {
		System.out.println("Methodensignatur: " + ctx.method_name().getText());

		return super.visitMethod_sig(ctx);
	}
}
