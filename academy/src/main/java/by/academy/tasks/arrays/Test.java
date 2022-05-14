package by.academy.tasks.arrays;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr = {4,5,0,10};
		
		for (int i = arr.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		Arrays.sort(arr);;
		System.out.println(Arrays.toString(arr));
	}
}
