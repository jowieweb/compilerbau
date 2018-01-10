package pojo;

import java.util.ArrayList;
import java.util.Objects;

public class ClassInfo implements GetMethods {
	private ArrayList<ClassInfo> relations;
	private ArrayList<Attribute> attributes;
	private ArrayList<Method> methods;
	private ArrayList<ClassInfo> innerClasses;
	private ArrayList<Interface> interfaces;
	private ArrayList<String> implementedInterfaces;
	private ClassInfo parent;
	private String accessModifier;
	private String name;
	private boolean staticFlag;
	private boolean abstractFlag;
	private boolean finalFlag;

	public ClassInfo(String className) {
		this.relations = new ArrayList<>();
		this.attributes = new ArrayList<>();
		this.attributes = new ArrayList<>();
		this.methods = new ArrayList<>();
		this.innerClasses = new ArrayList<>();
		this.interfaces = new ArrayList<>();
		this.name = className;
	}

	public ArrayList<ClassInfo> getRelations() {
		return relations;
	}

	public void setRelations(ArrayList<ClassInfo> relations) {
		this.relations = relations;
	}

	public ArrayList<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(ArrayList<Attribute> attributes) {
		this.attributes = attributes;
	}

	public ArrayList<Method> getMethods() {
		return methods;
	}

	public void setMethods(ArrayList<Method> methods) {
		this.methods = methods;
	}

	public ArrayList<ClassInfo> getInnerClasses() {
		return innerClasses;
	}

	public void setInnerClasses(ArrayList<ClassInfo> innerClasses) {
		this.innerClasses = innerClasses;
	}

	public ArrayList<Interface> getInterfaces() {
		return interfaces;
	}

	public void setInterfaces(ArrayList<Interface> interfaces) {
		this.interfaces = interfaces;
	}

	public ClassInfo getParent() {
		return parent;
	}

	public void setParent(ClassInfo parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStaticFlag() {
		return staticFlag;
	}

	public void setStaticFlag(boolean staticFlag) {
		this.staticFlag = staticFlag;
	}

	public boolean isAbstractFlag() {
		return abstractFlag;
	}

	public void setAbstractFlag(boolean abstractFlag) {
		this.abstractFlag = abstractFlag;
	}

	public ArrayList<String> getImplementedInterfaces() {
		return implementedInterfaces;
	}

	public void setImplementedInterfaces(ArrayList<String> implementedInterfaces) {
		this.implementedInterfaces = implementedInterfaces;
	}

	public String getAccessModifier() {
		return accessModifier;
	}

	public void setAccessModifier(String accessModifier) {
		this.accessModifier = accessModifier;
	}

	public boolean isFinalFlag() {
		return finalFlag;
	}

	public void setFinalFlag(boolean finalFlag) {
		this.finalFlag = finalFlag;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ClassInfo classInfo = (ClassInfo) o;
		return Objects.equals(name, classInfo.name);
	}

	@Override
	public int hashCode() {

		return Objects.hash(name);
	}
}
