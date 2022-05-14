package by.academy.classwork.lesson9;

public class User {
	
	protected int age;
	protected String name;
	protected double maney;
	
	public User() {
		super();
	}

	public User(int age, String name, double maney) {
		super();
		this.age = age;
		this.name = name;
		this.maney = maney;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getManey() {
		return maney;
	}

	public void setManey(double maney) {
		this.maney = maney;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [age=");
		builder.append(age);
		builder.append(", name=");
		builder.append(name);
		builder.append(", maney=");
		builder.append(maney);
		builder.append("]");
		return builder.toString();
	}
	
}
