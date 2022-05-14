package by.academy.tasks.oop.students;

public class Student {

	protected String firstName;
	protected String lastName;
	protected int group;
	protected double overageMark;

	public Student() {
		super();
	}
	
	public Student(double overageMark) {
		super();
		this.overageMark = overageMark;
	}

	public Student(String firstName, String lastName, int group, double overageMark) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.group = group;
		this.overageMark = overageMark;
	}

	public int getScholarship() {
		int a = 0;
		if (overageMark == 5) {
			a = 100;
		} else if (overageMark < 5 && overageMark > 0) {
			a = 80;
		}
		return a;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public double getOverageMark() {
		return overageMark;
	}

	public void setOverageMark(double overageMark) {
		this.overageMark = overageMark;
	}

}
