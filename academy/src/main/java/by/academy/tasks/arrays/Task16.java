package by.academy.tasks.arrays;

import java.util.Random;

public class Task16 {

	public static void main(String[] args) {

		Random random = new Random();
		int[][] a = new int[7][4];
		int[] a1 = { 1, 1, 1, 1, 1, 1, 1 };
		int max = 0;
		int index = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = random.nextInt(11) - 5;
				a1[i] *= Math.abs(a[i][j]);
				if (a1[i] > max) {
					max = a1[i];
					index = i;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println("   |" + a1[i]);
		}
		System.out.println("Максимальное значение " + max + ". Индекс строки " + index);
	}

}
