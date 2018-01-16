package pojo;

import java.util.ArrayList;

public interface GetMethods {
	ArrayList<Method> getMethods();
	ArrayList<Attribute> getAttributes();
	String toUML(ArrayList<String> parsed);

}
