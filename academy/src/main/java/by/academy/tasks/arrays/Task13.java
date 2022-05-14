package by.academy.tasks.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int n = scanner.nextInt();

		while (n <= 3) {
			n = scanner.nextInt();
		}
		System.out.println("Первый массив:");

		int[] a1 = new int[n];
		int even = 0;

		for (int i = 0; i < a1.length; i++) {
			a1[i] = random.nextInt(n + 1);
			if (a1[i] % 2 == 0) {
				even++;
			}
		}
		System.out.println(Arrays.toString(a1));

		int[] a2 = new int[even];
		int index = 0;

		for (int i = 0; i < a1.length; i++) {
			if (a1[i] % 2 == 0) {
				a2[index] = a1[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(a2));
	}
}
