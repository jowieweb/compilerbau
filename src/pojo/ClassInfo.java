package pojo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

public class ClassInfo extends GetMethods {



	private ArrayList<Attribute> attributes;

	private ArrayList<ClassInfo> innerClasses;
	private ArrayList<Interface> interfaces;
	private ArrayList<String> implementedInterfaces;

	private String accessModifier;

	private boolean staticFlag;
	private boolean abstractFlag;
	private boolean finalFlag;




	public ClassInfo(String className) {
		this.relations = new HashSet<>();
		this.attributes = new ArrayList<>();
		this.attributes = new ArrayList<>();
		this.innerClasses = new ArrayList<>();
		this.interfaces = new ArrayList<>();
		this.name = className;
	}




	public ArrayList<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(ArrayList<Attribute> attributes) {
		this.attributes = attributes;
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

	/**
	 * totally effective method for filtering relations
	 * at least for a testat ;-)
	 * @param parsed
	 */
	public void filterRelations(ArrayList<GetMethods> parsed){

		for (Method me: methods) {
			ArrayList<String> kgw = new ArrayList<>();

			for (String s :me.getIdentifiers()) {
				boolean foundInList = false;
				for (GetMethods found: parsed) {
					if(s.equals(found.getName())){
						foundInList = true;
						relations.add(found);
					}
				}
				if(!foundInList){
					kgw.add(s);
				}
			}
			for(String s:kgw){
				me.getIdentifiers().remove(s);
			}
		}
		for (GetMethods p: parsed) {
			for (String s: implementedInterfaces) {
				if(p.getName().equals( s)){
					implementedInterfacesRef.add(p);
				}
			}

		}
	}



	public String toUML(ArrayList<GetMethods> parsed){
		StringBuilder sb = new StringBuilder();
		filterRelations(parsed);
		if(parent != null) {
			x = 10 + (classCount * 350);
			classCount++;

			h = 75 + (15 * (methods.size() + attributes.size()));

			sb.append("<element><id>UMLClass</id><coordinates>");
			sb.append("<x>" + x + "</x>");
			sb.append("<y>" + y + "</y>");
			sb.append("<w>" + w + "</w>");
			sb.append("<h>" + h + "</h> </coordinates>");
			sb.append("<panel_attributes>");
		} else {
			System.out.println("PARENT");
		}

		if(abstractFlag)
			sb.append("/");
		sb.append(this.name );
		sb.append("\n--\n");
		for(Attribute at: this.attributes){
			sb.append(at.toString() + "\n");
		}
		sb.append("--\n");

		for(Method mt: this.methods){
			sb.append(mt.toString() + "\n");
		}

		if(abstractFlag)
			sb.append("/");

		if(children.size() > 0)
		{
			for (GetMethods child: children) {
				/*sb.append("{innerclass\n");
				sb.append(child.toUML(parsed));
				sb.append("\ninnerclass}\n");*/
			}
		}

		sb.append("</panel_attributes>");
		sb.append("<additional_attributes/>\n</element>");
		return  sb.toString();
	}
}
