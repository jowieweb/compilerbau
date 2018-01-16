package pojo;

import java.util.ArrayList;

public class Method {
	private String accessModifier;
	private boolean staticFlag;
	private String returnType;
	private boolean abstractFlag;
	private String methodName;
	private ArrayList<Parameter> parameters;
	private boolean isConstructor;
	private ArrayList<String> identifiers;

	public Method() {
		this.parameters = new ArrayList<>();
		this.identifiers = new ArrayList<>();
		this.accessModifier = "";
	}

	public String getAccessModifier() {
		return accessModifier;
	}

	public void setAccessModifier(String accessModifier) {
		this.accessModifier = accessModifier;
	}

	public boolean isStaticFlag() {
		return staticFlag;
	}

	public void setStaticFlag(boolean staticFlag) {
		this.staticFlag = staticFlag;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType.replace("<", "&lt;").replace(">", "&gt;");
	}

	public boolean isAbstractFlag() {
		return abstractFlag;
	}

	public void setAbstractFlag(boolean abstractFlag) {
		this.abstractFlag = abstractFlag;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public ArrayList<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(ArrayList<Parameter> parameters) {
		this.parameters = parameters;
	}

	public boolean isConstructor() {
		return isConstructor;
	}

	public void setConstructor(boolean constructor) {
		isConstructor = constructor;
	}

	public ArrayList<String> getIdentifiers() {
		return identifiers;
	}

	public void setIdentifiers(ArrayList<String> identifiers) {
		this.identifiers = identifiers;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(staticFlag){
			sb.append("_");
		}

		sb.append(accessModifier.replace("private", "-").replace("public", "+").replace("protected", "#"));
		sb.append(methodName + "(");
		for (Parameter p:parameters ) {
			sb.append(p.toString() + ", ");
		}
		if(parameters.size() > 0) {
			/* ugly? nooo just a testat :) */
			sb.deleteCharAt(sb.length() - 1);
			sb.deleteCharAt(sb.length() - 1);
		}
		sb.append(")");

		sb.append(": ");
		if(!isConstructor)
			sb.append(returnType);

		if(staticFlag){
			sb.append("_");
		}
		return  sb.toString();
	}
}
