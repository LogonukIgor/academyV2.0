package by.academy.classwork.staticTasks;

public class Apple extends Fruit {

	protected double pricePerKilogram;
	
	public Apple() {
		super();
	}
	
	public Apple(double weight,double pricePerKilogram) {
		super(weight);
		this.pricePerKilogram = pricePerKilogram;
	}
	
	@Override
	public double fruitPrice() {
		return weight * pricePerKilogram;
	}

	public double getPricePerKilogram() {
		return pricePerKilogram;
	}

	public void setPricePerKilogram(double pricePerKilogram) {
		this.pricePerKilogram = pricePerKilogram;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Apple [pricePerKilogram=");
		builder.append(pricePerKilogram);
		builder.append("]");
		return builder.toString();
	}
	
}
