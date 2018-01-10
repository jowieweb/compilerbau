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

	public Method() {
		this.parameters = new ArrayList<>();
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
		this.returnType = returnType;
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
}
