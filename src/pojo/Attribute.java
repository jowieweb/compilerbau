package pojo;

public class Attribute {
	private String accessModifier;
	private boolean staticFlag;
	private String dataType;
	private String name;

	public Attribute(String dataType, String name) {
		this.dataType = dataType;
		this.name = name;
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

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(staticFlag){
			sb.append("_");
		}
		sb.append(accessModifier.replace("private", "-").replace("public", "+").replace("protected", "#") + " ");
		sb.append(name.replace("<", "&lt;").replace(">", "&gt;") + ": " + dataType.replace("<", "&lt;").replace(">", "&gt;"));
		if(staticFlag){
			sb.append("_");
		}
		return sb.toString();
	}
}
