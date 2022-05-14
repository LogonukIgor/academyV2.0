package by.academy.tasks.oop.com.company.details;

public class Engine {

	protected double power;
	protected double perfomance;

	public Engine() {
		super();
	}

	public Engine(double power, double perfomance) {
		super();
		this.power = power;
		this.perfomance = perfomance;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public double getPerfomance() {
		return perfomance;
	}

	public void setPerfomance(double perfomance) {
		this.perfomance = perfomance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Engine [power=");
		builder.append(power);
		builder.append(", perfomance=");
		builder.append(perfomance);
		builder.append("]");
		return builder.toString();
	}

}
