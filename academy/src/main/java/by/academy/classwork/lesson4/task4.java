package by.academy.classwork.lesson4;

import java.util.Arrays;

public class task4 {
	public static void main(String[] args) {

		int array[] = { 2, 4, 5, 1, 6, 9 };
		System.out.println(Arrays.toString(array));
		for (int j = 0; j < (array.length - 1); j++) {
			for (int i = 0; i < (array.length - 1 - j); i++) {
				if (array[i + 1] < array[i]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
