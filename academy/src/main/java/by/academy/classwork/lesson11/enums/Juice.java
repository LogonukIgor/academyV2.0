package by.academy.classwork.lesson11.enums;

public enum Juice {

	TOMATO("red", 90.5), ORANGE(), APPLE("green", 98.1);

	private String color;
	private double percent;

	Juice() {
		this.color = "arange";
		this.percent = 95.9;
	}

	Juice(String color, double percent) {
		this.color = color;
		this.percent = percent;
	}

	public String getColor() {
		return color;
	}

	public double getPercent() {
		return percent;
	}

}
