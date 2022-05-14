package by.academy.tasks.cycles;

import java.util.Scanner;

public class task22 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите n: ");
		int n = scanner.nextInt();
		double value = 0;

		for (int i = 1; i <= n; i++) {
			value = (double) value + Math.pow(i, -1);
		}
		
		System.out.println(value);
	}
}
