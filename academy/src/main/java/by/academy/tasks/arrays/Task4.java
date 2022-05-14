package by.academy.tasks.arrays;

import java.util.Random;

public class Task4 {
	public static void main(String[] args) {
		int[] array = new int[8];
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = 1+rand.nextInt(10);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if(array[i]==1) {
				array[i]=0;
			}
			System.out.print(array[i] + " ");
		}
	}
}
