package pojo;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class GetMethods {
	public static int classCount =0;
	protected ArrayList<Method> methods = new ArrayList<>();
	protected int x;
	protected int y = 10;
	protected int w = 300;
	protected int h;
	protected String name;
	protected String accessModifier;
	protected HashSet<GetMethods> relations = new HashSet<>();
	protected GetMethods parent;

	public ArrayList<GetMethods> getChildren() {
		return children;
	}

	protected ArrayList<GetMethods> children = new ArrayList<>();

	public String getAccessModifier() {
		return accessModifier;
	}

	public void setAccessModifier(String accessModifier) {
		this.accessModifier = accessModifier;
	}

	public ArrayList<Method> getMethods() {
		return methods;
	}

	public void setMethods(ArrayList<Method> methods) {
		this.methods = methods;
	}
	public abstract ArrayList<Attribute> getAttributes();

	public abstract String toUML(ArrayList<GetMethods> parsed);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getW() {
		return w;
	}

	public int getH() {
		return h;
	}

	public HashSet<GetMethods> getRelations() {
		return relations;
	}

	public void setRelations(HashSet<GetMethods> relations) {
		this.relations = relations;
	}

	public ArrayList<GetMethods> getImplementedInterfacesRef() {
		return implementedInterfacesRef;
	}

	protected ArrayList<GetMethods> implementedInterfacesRef = new ArrayList<>();

	public GetMethods getParent() {
		return parent;
	}

	public void setParent(GetMethods parent) {
		this.parent = parent;
	}
}
