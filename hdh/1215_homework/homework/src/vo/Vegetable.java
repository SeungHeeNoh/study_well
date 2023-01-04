package vo;

public class Vegetable {
	private String group;
	private String type;
	private String origin;
	private int weight;

	public Vegetable() {}

	public Vegetable(String name, String type, int weight) {
		this.group = name;
		this.type = type;
		this.weight = weight;
	}

	public Vegetable(String name, String type, int weight, String origin) {
		this.group = name;
		this.type = type;
		this.weight = weight;
		this.origin = origin;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
