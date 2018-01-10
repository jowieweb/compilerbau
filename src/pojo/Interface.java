package pojo;

import java.util.ArrayList;
import java.util.Objects;

public class Interface implements GetMethods {
	private String accessModifier;
	private String name;
	private ArrayList<Method> methods;
	private Interface baseInterface;

	public Interface(String name) {
		this.methods = new ArrayList<>();
		this.name = name;
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

	@Override
	public ArrayList<Attribute> getAttributes() {
		return null;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Interface that = (Interface) o;
		return Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {

		return Objects.hash(name);
	}
}
