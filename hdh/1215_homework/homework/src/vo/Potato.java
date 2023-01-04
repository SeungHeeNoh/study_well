package vo;

public class Potato extends Vegetable{
	String origin;

	public Potato() {
		super();
	}

	public Potato(String group, String type, int weight, String origin) {
		super(group, type, weight, origin);
	}

	@Override
	public String toString() {
		return "Potato [type=" + getType() + ", weight=" + getWeight() + ", origin=" + getOrigin() + "]";
	}

}
