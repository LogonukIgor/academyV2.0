package by.academy.tasks.cycles;

import java.util.Scanner;

public class task6 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Сумма вклада: ");
		double s = scanner.nextDouble();

		System.out.println("На сколько лет:");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			s *= 1.03;
		}
		System.out.println(s);
	}
}
