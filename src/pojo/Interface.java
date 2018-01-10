package pojo;

import java.util.ArrayList;

public class Interface {
	private String accessModifier;
	private String name;
	private ArrayList<Method> methods;
	private Interface baseInterface;

	public Interface() {
		this.methods = new ArrayList<>();
	}

	public String getAccessModifier() {
		return accessModifier;
	}

	public void setAccessModifier(String accessModifier) {
		this.accessModifier = accessModifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Method> getMethods() {
		return methods;
	}

	public void setMethods(ArrayList<Method> methods) {
		this.methods = methods;
	}

	public Interface getBaseInterface() {
		return baseInterface;
	}

	public void setBaseInterface(Interface baseInterface) {
		this.baseInterface = baseInterface;
	}
}
