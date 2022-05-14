package by.academy.classwork.lesson9;

public abstract class Product {

	protected double price;
	protected int quantity;
	protected String name;

	public Product() {
		super();
	}

	public Product(double price, int quantity, String name) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double getCalculatePrice() {
		return price * quantity;
	}

	public abstract double getDiscount();

	public void onShelf() {
		System.out.println("Тавар " + name + " выставлен на продажу.");
	}

	public void debited() {
		System.out.println("Тавар " + name + " списан.");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getValue() {
		return quantity;
	}

	public void setMoney(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [price=");
		builder.append(price);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
