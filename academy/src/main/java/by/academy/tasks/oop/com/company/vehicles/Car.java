package by.academy.tasks.oop.com.company.vehicles;

import by.academy.tasks.oop.com.company.details.Engine;
import by.academy.tasks.oop.com.company.professions.Driver;

public class Car {

	protected String brand;
	protected String carClass;
	protected double weight;
	protected Driver driver;
	protected Engine engine;

	public Car() {
		super();
	}

	public Car(String brand, String carClass, double weight, Driver driver, Engine engine) {
		super();
		this.brand = brand;
		this.carClass = carClass;
		this.weight = weight;
		this.driver = driver;
		this.engine = engine;
	}
	
	public void start() {
		System.out.println("Двигвтель включен");
	}
	
	public void stop() {
		System.out.println("Двигвтель выключен");
	}
	
	public void turnLeft() {
		System.out.println("Повернул налево");
	}
	
	public void turnRight() {
		System.out.println("Повернул направо");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCarClass() {
		return carClass;
	}

	public void setCarClass(String carClass) {
		this.carClass = carClass;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [brand=");
		builder.append(brand);
		builder.append(", clas=");
		builder.append(carClass);
		builder.append(", weight=");
		builder.append(weight);
		builder.append(", driver=");
		builder.append(driver);
		builder.append(", engine=");
		builder.append(engine);
		builder.append("]");
		return builder.toString();
	}

}
