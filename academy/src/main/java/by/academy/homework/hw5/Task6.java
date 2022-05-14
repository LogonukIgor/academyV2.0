package by.academy.homework.hw5;

import java.util.Random;

public class Task6 {

	public static final Random RANDOM = new Random();

	public static void main(String[] args) {

		int[] array = new int[8];

		try {
			for (int i = 0; i < 10; i++) {
				array[i] = RANDOM.nextInt(11);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is to small, expand the array");
		}

	}
}
