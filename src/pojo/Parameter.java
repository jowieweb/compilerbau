package pojo;

public class Parameter {
	private String dataType;
	private String name;

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType.replace("<", "&lt;").replace(">", "&gt;");
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
		sb.append(name.replace("<", "&lt;").replace(">", "&gt;") + ": " + dataType.replace("<", "&lt;").replace(">", "&gt;"));
		return sb.toString();
	}
}
