package by.academy.finalwork.task2;

public enum TypeOfCoffee {

	GROUND, GRAIN, SEVERABLE, IN_THE_JAR, IN_THE_PACKAGE;

	public static void name(TypeOfCoffee a) {
		switch (a) {
		case GROUND:
			System.out.print("Молотый");
			break;
		case GRAIN:
			System.out.print("Зерновой");
			break;
		case SEVERABLE:
			System.out.print("Растворимый");
			break;
		case IN_THE_JAR:
			System.out.print("В банках");
			break;
		case IN_THE_PACKAGE:
			System.out.print("В пакетиках");
			break;
		}
	}

	public static Double calcPrice(TypeOfCoffee a, Double weight) {
		Double price = 0.0;
		switch (a) {
		case GROUND:
			price = weight * 20;
			break;
		case GRAIN:
			price = weight * 30;
			break;
		case SEVERABLE:
			price = weight * 3;
			break;
		case IN_THE_JAR:
			price = weight * 15;
			break;
		case IN_THE_PACKAGE:
			price = weight * 5;
			break;
		}
		return price;
	}
}
