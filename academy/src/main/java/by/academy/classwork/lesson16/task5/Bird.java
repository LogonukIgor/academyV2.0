package by.academy.classwork.lesson16.task5;

public class Bird {

	private String name;

	public Bird(String name) {
		super();
		this.name = name;
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
		builder.append("Bird [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
