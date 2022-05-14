package by.academy.tasks.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task10 {

	public static void main(String[] args) {

		Random random = new Random();
		int[] a = new int[11];
		int minus = 0;
		int plus = 0;
		int zero = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(3) - 1;
		}
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				zero++;
			} else if (a[i] == 1) {
				plus++;
			} else if (a[i] == -1) {
				minus++;
			}
		}

		if (zero > plus && zero > minus) {
			System.out.println("Больше всего нулей: " + zero + " штук");
		} else if (plus > zero && plus > minus) {
			System.out.println("Больше всего 1: " + plus + " штук");
		} else if (minus > zero && minus > plus) {
			System.out.println("Больше всего -1: " + minus + " штук");
		}
	}
}
