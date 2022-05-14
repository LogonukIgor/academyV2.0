package by.academy.tasks.arrays;

import java.util.Random;

public class Task5 {
	public static void main(String[] args) {

		int[] array1 = new int[5];
		int[] array2 = new int[5];
		double sum1 = 0;
		double sum2 = 0;
		Random rand = new Random();

		for (int i = 0; i < array1.length; i++) {
			array1[i] = rand.nextInt(6);
			sum1 += array1[i];
		}

		for (int i = 0; i < array2.length; i++) {
			array2[i] = rand.nextInt(6);
			sum2 += array2[i];
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();

		double sa1 = sum1 / 5;
		double sa2 = sum2 / 5;

		System.out.println("Сред. арифм. первого массива " + sa1);
		System.out.println("Сред. арифм. второго массива " + sa2);

		if (sa1 > sa2) {
			System.out.println("1 > 2");
		} else if (sa2 > sa1) {
			System.out.println("2 > 1");
		} else if (sa1 == sa2) {
			System.out.println("1 = 2");
		}
	}
}
