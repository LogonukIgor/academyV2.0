package by.academy.classwork.lesson11.enums;

public class JuiceDemo {

	public static void main(String[] args) {

		Juice[] array = Juice.values();

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " " + array[i].getColor() + " " + array[i].getPercent()+"\n");
		}
	}
}
