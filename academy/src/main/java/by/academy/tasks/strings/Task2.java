package by.academy.tasks.strings;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество строк:");
		int n = scanner.nextInt();
		int max = 0;

		String[] arr = new String[n];
		arr[0] = scanner.nextLine();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextLine();
		}
		System.out.println();

		for (int i = arr.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(arr[j].length() < arr[j+1].length()) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}

		scanner.close();
	}
}
