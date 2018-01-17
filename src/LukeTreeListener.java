import org.antlr.v4.runtime.tree.TerminalNode;
import pojo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * May the UML be with you
 */
public class LukeTreeListener extends JavaLexerBaseListener {
	private ArrayList<GetMethods> classInfos = new ArrayList<>();
	private Stack<GetMethods> classInfoStack = new Stack<>();

	@Override
	public void enterClass_def(JavaLexerParser.Class_defContext ctx) {
		ClassInfo ci = new ClassInfo(ctx.class_name(0).getText());
		if(!classInfoStack.isEmpty()){
			//HAS PARENT!
			ci.setParentForInnerClass(classInfoStack.peek());
			classInfoStack.peek().getChildren().add(ci);
		}

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
		//System.out.println("Konstruktor: " + ctx.class_name().getText());
		Method method = new Method();
		method.setMethodName(ctx.class_name().getText());
		method.setParameters(getParameterListFromParameterContext(ctx.parameter()));
		method.setConstructor(true);
		method.setAccessModifier(ctx.accessmod().getText());

		getCurrentScope().getMethods().add(method);
	}

	public void enterMethod_sig(JavaLexerParser.Method_sigContext ctx) {
		//System.out.println("Methode: " + ctx.method_name().getText());
		Method method = new Method();
		method.setMethodName(ctx.method_name().getText());
		method.setParameters(getParameterListFromParameterContext(ctx.parameter()));
		method.setAccessModifier(ctx.accessmod().getText());
		if(ctx.datatype() != null) {
			method.setReturnType(ctx.datatype().getText());
		} else  {
			method.setReturnType("");
		}
		getCurrentScope().getMethods().add(method);
	}

	public void enterExpression(JavaLexerParser.ExpressionContext ctx) {
		//System.out.println("Expression: " + ctx.getText());

		if (ctx.IDENTIFIER() != null) {
			for (TerminalNode id : ctx.IDENTIFIER()) {
				getCurrentScope().getMethods().get(getCurrentScope().getMethods().size() - 1).getIdentifiers().add(id.getText());
			}
			if(ctx.datatype() != null){
				getCurrentScope().getMethods().get(getCurrentScope().getMethods().size() - 1).getIdentifiers().add(ctx.datatype().getText());
			}
		}
	}

	public void enterAttribute(JavaLexerParser.AttributeContext ctx) {
		//System.out.println("Attribut: " + ctx.variable().IDENTIFIER().getText());
		Attribute attribute = new Attribute(ctx.variable().datatype().getText(), ctx.variable().IDENTIFIER().getText());
		if (ctx.accessmod() != null) {
			attribute.setAccessModifier(ctx.accessmod().getText());
		}
		if (ctx.STATIC() != null) {
			attribute.setStaticFlag(true);
		}
		getCurrentScope().getAttributes().add(attribute);
	}

	@Override
	public void exitClass_def(JavaLexerParser.Class_defContext ctx) {
		classInfoStack.pop();
	}

	public void enterInterface_def(JavaLexerParser.Interface_defContext ctx) {
		//System.out.println("Interface: " + ctx.interface_name().getText());

		Interface i = new Interface(ctx.interface_name().getText());
		classInfos.add(i);
		classInfoStack.push(i);

		if (ctx.accessmod() != null) {
			i.setAccessModifier(ctx.accessmod().getText());
		}
		if (ctx.EXTENDS() != null) {
			i.setParent((GetMethods) new Interface(ctx.IDENTIFIER().getText()));
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

	public String getClasses(){
		StringBuilder sb = new StringBuilder();

		for (GetMethods ci:classInfos ) {
			sb.append(ci.toUML(classInfos));
			sb.append("\n");
		}
		sb.append(getRelations());

		return  sb.toString();
	}

	private int getXPos(GetMethods cl){
		return (cl.getX() + (cl.getW()/2));
	}

	private int getYPos(GetMethods cl){
		return cl.getY() + cl.getH();
	}
	private int getAY(GetMethods cl, GetMethods re){
		int value = cl.getY() + cl.getH();
		value -= re.getY() + re.getH();
		return value;
	}

	private int getAX(GetMethods cl, GetMethods re){
		if(cl.getX() > re.getX()) {
			return cl.getX() - re.getX();
		}

		return  re.getX() - cl.getX();
	}

	public void drawRelation(StringBuilder sb,GetMethods cl, GetMethods relation, String type, int yoffset){
		sb.append("\n<element>\n<id>Relation</id>\n<coordinates>\n");
		sb.append("<x>" + getXPos(relation) + "</x>\n");
		sb.append("<y>" + getYPos(relation) + "</y>\n");
		sb.append("<w>0</w>\n<h>0</h>\n</coordinates>\n");
		sb.append("<panel_attributes>" + type +"</panel_attributes>\n");
		sb.append("<additional_attributes>");
		sb.append("0.0;0.0;");
		sb.append(getAX(cl,relation) + ".0;" + getAY(cl,relation) +".0;");
		//sb.append((cl.getX() - relation.getX()) +".0;" + (cl.getY() - relation.getY()) + ".0;" );
		sb.append("</additional_attributes>\n");
		//sb.append("<additional_attributes>10.0;130.0;10.0;10.0</additional_attributes>");
		sb.append("</element>\n");
	}

	public String getRelations(){
		StringBuilder sb = new StringBuilder();
		int yoffset = 200;


		for (GetMethods cl: classInfos) {

			for (GetMethods relation: cl.getRelations()) {
				drawRelation(sb,cl,relation,"lt=&lt;-",yoffset);
				yoffset += 20;
			}

			for(GetMethods impl: cl.getImplementedInterfacesRef()){
				drawRelation(sb,cl,impl,"lt=&lt;&lt;.",yoffset);
				yoffset += 20;
			}

			if(cl.getParent() != null){
				drawRelation(sb,cl,cl.getParent(),"lt=&lt;&lt;-",yoffset);
			}

		}


		
		return sb.toString();
	}

	public  void clearStack(){
		classInfoStack.clear();
	}
}
