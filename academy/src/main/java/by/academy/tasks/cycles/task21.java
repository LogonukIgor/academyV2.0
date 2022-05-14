package by.academy.tasks.cycles;

import java.util.Scanner;

public class task21 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите n: ");
		int n = scanner.nextInt();
		double value = 0;
		double a;

		for (int i = 1; i <= n; i++) {
			if (i == n) {
				a = Math.pow(i * 2, 2);
				value = value + Math.pow(a, -1);
			}else if (i % 2 == 0) {
					a = Math.pow(i, 2);
					value = value + Math.pow(a, -1);
			}
		}
		System.out.println(value);
	}
}