package by.academy.classwork.staticTasks;

public abstract class Fruit {
	
	protected double weight;
	
	public Fruit() {
		super();
	}
	
	public Fruit(double weight) {
		super();
		this.weight = weight;
	}
	
	public static final void printManufactoryInfo() {
		System.out.println("Made in USA");
	}
	
	public abstract double fruitPrice();

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fruit [weight=");
		builder.append(weight);
		builder.append("]");
		return builder.toString();
	}
	
	
}
