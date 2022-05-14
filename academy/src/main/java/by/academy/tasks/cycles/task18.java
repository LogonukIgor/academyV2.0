package by.academy.tasks.cycles;

import java.util.Scanner;

public class task18 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите натуральное число:");
		int n = scanner.nextInt();
		int number = 0;

		for (int i = 1; i < n; i++) {
			if (i % 2 != 0 & i % 3 != 0 & i % 5 != 0) {
				System.out.print(i + " ");
				number++;
			}
		}
		System.out.println();
		System.out.println(number);
	}
}
