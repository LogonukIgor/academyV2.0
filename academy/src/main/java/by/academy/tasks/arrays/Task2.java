package by.academy.tasks.arrays;

public class Task2 {

	public static void main(String[] args) {

		int[] array = new int[50];
		int n = 0;

		for (int i = 1; i < 100; i++) {
			if ((i & 1) == 1) {
				array[n] = i;
				n++;
			}
		}

		for (int i = array.length - 1; i >= 0 ; i--) {
			System.out.print(array[i] + " ");
		}

	}

}
