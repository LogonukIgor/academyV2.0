package by.academy.tasks.staticDemo;

public class Tulip extends Flower {

	public Tulip() {
		super();
	}

	public Tulip(String country, String time, double price) {
		super(country, time, price);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tulip []");
		return builder.toString();
	}

}
