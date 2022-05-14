package by.academy.tasks.operators;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите месяц: ");
		String s = scanner.nextLine();

		switch (s) {
		case "январь":
			System.out.println("Номер 1");
			break;
		case "февраль":
			System.out.println("Номер 2");
			break;
		case "март":
			System.out.println("Номер 3");
			break;
		case "апрель":
			System.out.println("Номер 4");
			break;
		case "май":
			System.out.println("Номер 5");
			break;
		case "июнь":
			System.out.println("Номер 6");
			break;
		case "июль":
			System.out.println("Номер 7");
			break;
		case "август":
			System.out.println("Номер 8");
			break;
		case "сентябрь":
			System.out.println("Номер 9");
			break;
		case "октябрь":
			System.out.println("Номер 10");
			break;
		case "ноябрь":
			System.out.println("Номер 11");
			break;
		case "декабрь":
			System.out.println("Номер 12");
			break;

		}
	}
}
