package by.academy.tasks.cycles;

import java.util.Scanner;

public class task14 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Считаем сумму квадратов чисел от 1 до n. Введите n:");
		int n = scanner.nextInt();
		int a, sum = 0;

		for (int i = 1; i <= n; i++) {
			a = (int) Math.pow(i, 2);
			System.out.print(a + " ");
			sum += a;
		}
		System.out.println();
		System.out.println("Сумма: " + sum);
	}
}
