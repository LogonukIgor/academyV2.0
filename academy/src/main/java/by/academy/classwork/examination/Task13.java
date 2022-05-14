package by.academy.classwork.examination;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Введите число больше 3:");
		int n = scanner.nextInt();

		while (n <= 3) {
			System.out.println("Введите еще раз");
			n = scanner.nextInt();
		}

		System.out.println("Первый массив:");

		int[] a1 = new int[n];
		int temp = 0;

		for (int i = 0; i < a1.length; i++) {
			a1[i] = random.nextInt(n + 1);
			if (a1[i] % 2 == 0) {
				temp++;
			}
		}
		System.out.println(Arrays.toString(a1));

		int[] a2 = new int[temp];
		int index = 0;

		for (int i = 0; i < a1.length; i++) {
			if (a1[i] % 2 == 0) {
				a2[index] = a1[i];
				index++;
			}
		}
		System.out.println("Второй массив:");
		System.out.println(Arrays.toString(a2));
	}
}
