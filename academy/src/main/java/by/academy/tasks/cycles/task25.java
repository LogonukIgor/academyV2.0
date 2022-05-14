package by.academy.tasks.cycles;

import java.util.Scanner;

public class task25 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите n:");
		int n = scanner.nextInt();

		System.out.println("Введите a:");
		double a = scanner.nextDouble();

		double p = a;
		double b;

		for (int i = 1; i < n; i++) {
			b = a + i;
			p *= b;
		}
		
		System.out.println(p);
	}
}
