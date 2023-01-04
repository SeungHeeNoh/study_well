package vo;

public class SweetPotato extends Vegetable{
	public SweetPotato() {
		super();
	}

	public SweetPotato(String group, String type, int weight) {
		super(group, type, weight);
	}

	@Override
	public String toString() {
		return "SweetPotato [type=" + getType() + ", weight=" + getWeight() + "]";
	}

}
