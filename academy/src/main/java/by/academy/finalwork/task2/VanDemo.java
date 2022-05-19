package by.academy.finalwork.task2;

public class VanDemo {

	public static void main(String[] args) {
		
		Van van = new Van(500);
		
		van.add(TypeOfCoffee.GRAIN, 120.0);
		van.add(TypeOfCoffee.GROUND, 125.4);
		van.add(TypeOfCoffee.IN_THE_JAR, 20.6);
		van.add(TypeOfCoffee.IN_THE_PACKAGE, 100.6);
		van.add(TypeOfCoffee.SEVERABLE, 80.0);
		
		van.print();
		
		van.get(TypeOfCoffee.GRAIN);
		System.out.println();
		
		van.get(100.0, 120.0);
		System.out.println();
		
		van.sortByPrice();
	}
}
