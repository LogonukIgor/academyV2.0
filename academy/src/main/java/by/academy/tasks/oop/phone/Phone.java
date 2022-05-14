package by.academy.tasks.oop.phone;

public class Phone {

	protected long number;
	protected String model;
	protected double weight;

	public Phone() {
		super();
	}

	public Phone(long number, String model) {
		super();
		this.number = number;
		this.model = model;
	}

	public Phone(long number, String model, double weight) {
		this(number, model);
		this.weight = weight;
	}

	public void receiveCall(String name) {
		System.out.println("Звонит " + name);
	}

	public void receiveCall(String name, long number) {
		System.out.println("Звонит " + name + ". С номера " + number);
	}

	public void sendMassage(long... args) {
		for (long i : args) {
			System.out.println("Сообщение отправлено на номер +" + i + " ");
		}
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Phone [number=");
		builder.append(number);
		builder.append(", model=");
		builder.append(model);
		builder.append(", weight=");
		builder.append(weight);
		builder.append("]");
		return builder.toString();
	}

}
