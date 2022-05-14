package by.academy.tasks.arrays;

import java.util.Random;

public class Task15 {

	public static void main(String[] args) {

		Random random = new Random();
		int[][] a = new int[5][8];
		int max = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = random.nextInt(200) - 99;
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Максимальное значение: " + max);
	}

}
