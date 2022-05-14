package by.academy.tasks.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task9 {

	public static void main(String[] args) {

		Random r = new Random();
		int[] a1 = new int[10];
		int[] a2 = new int[10];
		double[] a3 = new double[10];
		int number = 0;

		for (int i = 0; i < a1.length; i++) {
			a1[i] = r.nextInt(9) + 1;
			a2[i] = r.nextInt(9) + 1;
			a3[i] = (double) a1[i] / a2[i];
		}
		for (int i = 0; i < a3.length; i++) {
			if (a3[i] % 1 == 0) {
				number++;
			}
		}

		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
		System.out.println("Количество целых элементов: " + number);
	}
}
