package by.academy.tasks.arrays;

import java.util.Random;

public class Task17 {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] a = new int[6][7];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = random.nextInt(10);
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a[0].length; j++) {
				if(a[i][j] < a[i][j-1]) {
					int temp = a[i][j-1];
					a[i][j-1] = a[i][j];
					a[i][j] = temp;
				}
			}
		}
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		
		
	}
}
