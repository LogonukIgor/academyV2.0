package by.academy.tasks.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
	public static void main(String[] args) {

		int[] array = new int[4];
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = 10 + rand.nextInt(89);
		}
		
		System.out.println(Arrays.toString(array));
		
		boolean x = true;
		
		for (int i = 1; i < array.length; i++) {
			if(array[i]<=array[i-1]) {
				x = false;
				break;
			}
		}
		
		if (x) {
			System.out.println("+");
		} else {
			System.out.println("-");
		}
	}
}
