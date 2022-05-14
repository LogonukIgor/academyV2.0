package by.academy.tasks.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task14 {

	public static void main(String[] args) {

		Random random = new Random();
		int[][] a = new int[8][5];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = random.nextInt(90) + 10;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(a));
	}
}
