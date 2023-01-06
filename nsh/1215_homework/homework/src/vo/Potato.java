package vo;

public class Potato {
	private String type;
	private int weight;
	private String origin;
	
	public Potato() {
		super();
	}

	public Potato(String type, int weight, String origin) {
		super();
		this.type = type;
		this.weight = weight;
		this.origin = origin;
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

	@Override
	public String toString() {
		return "Potato [type=" + type + ", weight=" + weight + ", origin=" + origin + "]";
	}

}
