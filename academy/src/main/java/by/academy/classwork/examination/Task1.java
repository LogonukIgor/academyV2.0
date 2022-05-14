package by.academy.classwork.examination;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static final Random random = new Random();

	public static void main(String[] args) {
		
		System.out.println("Введите n:");

		int n;

		do {
			n = scanner.nextInt();
		} while (n < 1);

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(11);
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < array.length; i++) {
			array[i] += 10;
		}

		System.out.println();

		System.out.println(Arrays.toString(array));
	}
}
