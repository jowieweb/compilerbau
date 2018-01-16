import pojo.ClassInfo;
import pojo.Method;
import pojo.Parameter;

import java.util.ArrayList;
import java.util.List;

public class LukeTreeWalker extends JavaLexerBaseVisitor<Void> {
	private ArrayList<ClassInfo> classInfo;
	private ClassInfo currentClass ;

	public  LukeTreeWalker(){
		classInfo = new ArrayList<>();
		currentClass = new ClassInfo("");
		classInfo.add(currentClass);
	}

	public Void visitConstructor(JavaLexerParser.ConstructorContext ctx) {
		System.out.println("Konstruktor: " + ctx.class_name().getText());
		Method method = new Method();
		method.setMethodName(ctx.class_name().getText());
		method.setParameters(getParameterListFromParameterContext(ctx.parameter()));
		method.setConstructor(true);

		return super.visitConstructor(ctx);
	}

	public Void visitClass_def(JavaLexerParser.Class_defContext ctx) {
		System.out.println("Class_def: " + ctx.class_name(0).getText());
		currentClass.setName(ctx.class_name(0).getText());

		return super.visitClass_def(ctx);
	}

	public Void visitMethod_sig(JavaLexerParser.Method_sigContext ctx) {
		System.out.println("Methodensignatur: " + ctx.method_name().getText());
		Method method = new Method();
		method.setMethodName(ctx.method_name().getText());
		method.setParameters(getParameterListFromParameterContext(ctx.parameter()));

		return super.visitMethod_sig(ctx);
	}

	private ArrayList<Parameter> getParameterListFromParameterContext(List<JavaLexerParser.ParameterContext> paramList) {
		ArrayList<Parameter> parameters = new ArrayList<>();

		for(JavaLexerParser.ParameterContext pc: paramList){
			Parameter p = new Parameter();
			p.setDataType(pc.datatype().getText());
			p.setName(pc.IDENTIFIER().getText());
			parameters.add(p);
		}

		return parameters;
	}


}
