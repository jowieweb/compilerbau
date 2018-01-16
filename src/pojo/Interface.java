package pojo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Interface extends GetMethods {
	private Interface baseInterface;

	public Interface(String name) {
		this.name = name;
		y = 10;
		w = 300;
	}

	@Override
	public ArrayList<Attribute> getAttributes() {
		return null;
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

	public String toUML(ArrayList<GetMethods> parsed) {

		x = 10 + (classCount * 350);
		classCount++;

		h = 75 + (15 * (methods.size()));

		StringBuilder sb = new StringBuilder();
		Random r = new Random();
		sb.append("<element><id>UMLClass</id><coordinates>");
		sb.append("<x>" + x + "</x>");
		sb.append("<y>" + y + "</y>");
		sb.append("<w>" + w + "</w>");
		sb.append("<h>" + h + "</h> </coordinates>");
		sb.append("<panel_attributes>");
		sb.append("&lt;&lt;interface&gt;&gt;\n" + this.name);
		sb.append("\n--\n");

		sb.append("--\n");

		for (Method mt : this.methods) {
			sb.append(mt.toString() + "\n");
		}

		sb.append("</panel_attributes>");
		sb.append("<additional_attributes/>\n</element>");
		return sb.toString();
	}
}
