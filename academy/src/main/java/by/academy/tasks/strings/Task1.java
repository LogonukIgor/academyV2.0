package by.academy.tasks.strings;

import java.util.Scanner;

public class Task1 {
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

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "  " + arr[i].length());
			if (arr[i].length() > max) {
				max = arr[i].length();
			}
		}
		System.out.println("Max = " + max);
		String word1 = scanner.next();
		System.out.println(word1);
		System.out.println("hello");

		scanner.close();
	}
}
