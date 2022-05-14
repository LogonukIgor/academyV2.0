package by.academy.tasks.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Введите положительное чётное число: ");

		int n = scanner.nextInt();

		while (n % 2 == 1 || n < 0 || n == 1) {
			n = scanner.nextInt();
		}
		System.out.println("Проверка пройдена");

		int[] a = new int[n];
		int sum1 = 0;
		int sum2 = 0;
		int x = n / 2;

		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(11) - 5;
		}

		for (int i = 0; i < x; i++) {
			sum1 += a[i];
		}

		for (int i = a.length - 1; i >= x; i--) {
			sum2 += a[i];
		}

		System.out.println(Arrays.toString(a));
		System.out.println("Сумма значений первой половины массива: " + sum1);
		System.out.println("Сумма значений второй половины массива: " + sum2);

	}
}
