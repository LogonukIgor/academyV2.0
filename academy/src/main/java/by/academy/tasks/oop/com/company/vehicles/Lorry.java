package by.academy.tasks.oop.com.company.vehicles;

import by.academy.tasks.oop.com.company.details.Engine;
import by.academy.tasks.oop.com.company.professions.Driver;

public class Lorry extends Car {

	protected double loadCapacity;

	public Lorry() {
		super();
	}

	public Lorry(String brand, String carClass, double weight, Driver driver, Engine engine, double loadCapacity) {
		super(brand, carClass, weight, driver, engine);
		this.loadCapacity = loadCapacity;
	}

	public double getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lorry [loadCapacity=");
		builder.append(loadCapacity);
		builder.append("]");
		return builder.toString();
	}

}
