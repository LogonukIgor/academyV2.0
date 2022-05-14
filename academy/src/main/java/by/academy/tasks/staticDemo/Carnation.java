package by.academy.tasks.staticDemo;

public class Carnation extends Flower {

	public Carnation() {
		super();
	}

	public Carnation(String country, String time, double price) {
		super(country, time, price);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carnation []");
		return builder.toString();
	}

}
