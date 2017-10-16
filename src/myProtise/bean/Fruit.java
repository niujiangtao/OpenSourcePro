package myProtise.bean;

public class Fruit {

	private String name;
	private int number;
	private String weight;
	

	public Fruit(String name, int number, String weight) {
		super();
		this.name = name;
		this.number = number;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	
}
