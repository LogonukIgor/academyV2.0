package by.academy.tasks.cycles;

import java.util.Scanner;

import by.academy.lesson4.For2;

public class task16 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество сенокосилок");
		int a = scanner.nextInt();

		System.out.println("Введите сколько работает сенокосилка");
		int m = scanner.nextInt();

		for (int i = 1; i < a; i++) {
			m += 10;
		}
		System.out.println("Работали " + m + " минут");
	}
}
