package by.academy.tasks.oop.person;

public class Person {
	
	protected int age;
	protected String fullName;
	
	public Person() {
		super();
	}
	
	public Person(int age, String fullName) {
		super();
		this.age = age;
		this.fullName = fullName;
	}
	
	public void move() {
		System.out.println(fullName+" идёт.");
	}
	
	public void talk() {
		System.out.println(fullName+" говорит.");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [age=");
		builder.append(age);
		builder.append(", fullName=");
		builder.append(fullName);
		builder.append("]");
		return builder.toString();
	}
	
}
