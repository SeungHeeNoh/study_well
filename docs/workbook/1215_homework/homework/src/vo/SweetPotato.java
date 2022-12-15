package vo;

public class SweetPotato {
	private String type;
	private int weight;
	

	public SweetPotato() {}

	public SweetPotato(String type, int weight) {
		super();
		this.type = type;
		this.weight = weight;
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

	@Override
	public String toString() {
		return "SweetPotato [type=" + type + ", weight=" + weight + "]";
	}


}
