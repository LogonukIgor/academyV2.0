package by.academy.tasks.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task8 {

	public static void main(String[] args) {

		Random r = new Random();
		int[] array = new int[12];
		int max = array[0];
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(30) - 15;
			if (i >= 1) {
				if (array[i] > max) {
					max = array[i];
					index = i;
				}
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Самое большое число " + max + " под индексом " + index);
	}
}
