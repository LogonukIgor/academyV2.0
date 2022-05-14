package by.academy.tasks.arrays;

public class Task1 {
	public static void main(String[] args) {

		int[] array = new int[10];
		int n = 0;

		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0) {
				array[n] = i;
				n++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
