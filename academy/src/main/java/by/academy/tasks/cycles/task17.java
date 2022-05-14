package by.academy.tasks.cycles;

import java.util.Scanner;

public class task17 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Количество учащихся:");
		int n = scanner.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			System.out.println("Введите рост " + i + " ученика:");
			int a = scanner.nextInt();
			sum += a;
		}
		
		int sred = sum / n;
		System.out.println("Средний рост: " + sred);
	}
}
