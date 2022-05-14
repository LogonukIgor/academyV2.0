package by.academy.testwork.task2;

import java.util.Arrays;
import java.util.Random;

public class Student {

	private String name;
	private int well;
	private long group;
	private int[] marks;
	private double average;

	public Student() {
		super();
	}

	public Student(String name, int well, long group) {
		super();
		this.name = name;
		this.well = well;
		this.group = group;

		this.marks = new int[5];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = RANDOM.nextInt(11);
		}
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		average = (double) sum / marks.length;
	}

	public static final Random RANDOM = new Random();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWell() {
		return well;
	}

	public void setWell(int well) {
		this.well = well;
	}

	public long getGroup() {
		return group;
	}

	public void setGroup(long group) {
		this.group = group;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", well=");
		builder.append(well);
		builder.append(", group=");
		builder.append(group);
		builder.append(", marks=");
		builder.append(Arrays.toString(marks));
		builder.append(", average=");
		builder.append(average);
		builder.append("]");
		return builder.toString();
	}

}
