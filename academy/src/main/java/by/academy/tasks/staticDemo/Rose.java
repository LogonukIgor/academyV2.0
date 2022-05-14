package by.academy.tasks.staticDemo;

public class Rose extends Flower {

	public Rose() {
		super();
	}

	public Rose(String country, String time, double price) {
		super(country, time, price);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rose []");
		return builder.toString();
	}

}
