package by.academy.classwork.lesson12.street;

public class Test {

	public static void main(String[] args) {
		
		Street s1 = new Street();
		Street.House h1 = s1.new House();
		h1.printHouseNumber();
		
		Street.Car c1 = new Street.Car();
	}
}
