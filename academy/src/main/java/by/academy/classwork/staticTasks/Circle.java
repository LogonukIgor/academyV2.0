package by.academy.classwork.staticTasks;

public class Circle {

	public static final double PI = 3.14;
	protected double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double findArea() {
		return PI * (Math.pow(radius, 2));
	}

	public double circleLength() {
		return 2 * PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [radius=");
		builder.append(radius);
		builder.append("]");
		return builder.toString();
	}

}
