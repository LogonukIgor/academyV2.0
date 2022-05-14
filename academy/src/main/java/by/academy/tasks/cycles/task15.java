package by.academy.tasks.cycles;

import java.util.Scanner;

public class task15 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите a и b:");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();

		if (a % 2 != 0 & a % 2 != 1) {
			if (b <= 0) {
				System.out.println("b не может быть отрицательным или 0!!!");
			} else {
				double c = Math.pow(a, b);
				System.out.println("a^b: " + c);
			}
		} else {
			int d = (int) Math.pow(a, b);
			System.out.println("a^b: " + d);
		}
	}
}
