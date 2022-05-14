package by.academy.tasks.staticDemo;

public class Flower {

	protected String country;
	protected String time;
	protected double price;
	protected static int numFlower;

	public Flower() {
		super();
		numFlower++;
	}

	public Flower(String country, String time, double price) {
		super();
		this.country = country;
		this.time = time;
		this.price = price;
		numFlower++;
	}

	public static double calcPrice(Flower[] flow) {
		int pr = 0;
		for (int i = 0; i < flow.length; i++) {
			pr += flow[i].price;
		}
		return pr;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getNumFlower() {
		return numFlower;
	}

	public static void setNumFlower(int numFlower) {
		Flower.numFlower = numFlower;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Flower [country=");
		builder.append(country);
		builder.append(", time=");
		builder.append(time);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
