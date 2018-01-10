import org.antlr.v4.runtime.tree.TerminalNode;
import pojo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LukeTreeListener extends JavaLexerBaseListener {
	private ArrayList<GetMethods> classInfos = new ArrayList<>();
	private Stack<GetMethods> classInfoStack = new Stack<>();

	@Override
	public void enterClass_def(JavaLexerParser.Class_defContext ctx) {
		ClassInfo ci = new ClassInfo(ctx.class_name(0).getText());
		classInfos.add(ci);
		classInfoStack.push(ci);

		ArrayList<String> interfaces = new ArrayList<>();
		for (JavaLexerParser.Interface_nameContext nc : ctx.interface_name()) {
			interfaces.add(nc.getText());
		}

		if (ctx.EXTENDS() != null) {
			ci.setParent(new ClassInfo(ctx.class_name(1).getText()));
		}

		ci.setImplementedInterfaces(interfaces);
		if (ctx.accessmod() != null) {
			ci.setAccessModifier(ctx.accessmod().getText());
		}
		if (ctx.ABSTRACT() != null && !ctx.ABSTRACT().getText().isEmpty()) {
			ci.setAbstractFlag(true);
		}
		if (ctx.STATIC() != null && !ctx.STATIC().getText().isEmpty()) {
			ci.setStaticFlag(true);
		}
		if (ctx.FINAL() != null && !ctx.FINAL().getText().isEmpty()) {
			ci.setFinalFlag(true);
		}
	}

	public void enterConstructor(JavaLexerParser.ConstructorContext ctx) {
		System.out.println("Konstruktor: " + ctx.class_name().getText());
		Method method = new Method();
		method.setMethodName(ctx.class_name().getText());
		method.setParameters(getParameterListFromParameterContext(ctx.parameter()));
		method.setConstructor(true);

		getCurrentScope().getMethods().add(method);
	}

	public void enterMethod_sig(JavaLexerParser.Method_sigContext ctx) {
		System.out.println("Methode: " + ctx.method_name().getText());
		Method method = new Method();
		method.setMethodName(ctx.method_name().getText());
		method.setParameters(getParameterListFromParameterContext(ctx.parameter()));

		getCurrentScope().getMethods().add(method);
	}

	public void enterExpression(JavaLexerParser.ExpressionContext ctx) {
		System.out.println("Expression: " + ctx.getText());

		if (ctx.IDENTIFIER() != null) {
			for (TerminalNode id : ctx.IDENTIFIER()) {
				getCurrentScope().getMethods().get(getCurrentScope().getMethods().size() - 1).getIdentifiers().add(id.getText());
			}
		}
	}

	public void enterAttribute(JavaLexerParser.AttributeContext ctx) {
		System.out.println("Attribut: " + ctx.variable().IDENTIFIER().getText());
		Attribute attribute = new Attribute(ctx.variable().datatype().getText(), ctx.variable().IDENTIFIER().getText());
		if (ctx.accessmod() != null) {
			attribute.setAccessModifier(ctx.accessmod().getText());
		}
		if (ctx.STATIC() != null) {
			attribute.setStaticFlag(true);
		}
	}

	@Override
	public void exitClass_def(JavaLexerParser.Class_defContext ctx) {
		classInfoStack.pop();
	}

	public void enterInterface_def(JavaLexerParser.Interface_defContext ctx) {
		System.out.println("Interface: " + ctx.interface_name().getText());

		Interface i = new Interface(ctx.interface_name().getText());
		classInfos.add(i);
		classInfoStack.push(i);

		if (ctx.accessmod() != null) {
			i.setAccessModifier(ctx.accessmod().getText());
		}
		if (ctx.EXTENDS() != null) {
			i.setBaseInterface(new Interface(ctx.IDENTIFIER().getText()));
		}
	}

	public void exitInterface_def(JavaLexerParser.Interface_defContext ctx) {
		classInfoStack.pop();
	}


	private GetMethods getCurrentScope() {
		return classInfoStack.peek();
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
