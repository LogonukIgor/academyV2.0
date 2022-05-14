package by.academy.tasks.arrays;

import java.util.Random;

public class Task3 {
	public static void main(String[] args) {

		int[] array = new int[15];
		Random rand = new Random();
		int x = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
			if (array[i] % 2 == 0 && array[i] != 0) {
				x++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Количество чётных: " + x);

	}
}
