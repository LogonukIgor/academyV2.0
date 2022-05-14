package by.academy.classwork.examination;

import java.util.Arrays;
import java.util.Random;

public class Task12 {

	public static void main(String[] args) {

		Random random = new Random();

		int[] a = new int[12];
		int plus = 1;
		int minus = 2;

		while (plus != minus) {
			plus = 0;
			minus = 0;
			for (int i = 0; i < a.length; i++) {
				a[i] = random.nextInt(21) - 10;
				if (a[i] > 0) {
					plus++;
				} else if (a[i] < 0) {
					minus++;
				} else if (a[i] == 0) {
					minus -= 100;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));

	}
}
