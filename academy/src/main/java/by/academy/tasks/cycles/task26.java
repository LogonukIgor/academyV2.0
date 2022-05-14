package by.academy.tasks.cycles;

import java.util.Scanner;

public class task26 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите n:");
		int n = scanner.nextInt();

		System.out.println("Введите x:");
		double x = scanner.nextDouble();

		double radians = Math.toRadians(x);
		double sum = 0;

		for (int i = 1; i <= n; i++) {
			double a = Math.sin(Math.pow(radians, i));
			sum += a;
		}
		
		System.out.println(sum);
	}
}
