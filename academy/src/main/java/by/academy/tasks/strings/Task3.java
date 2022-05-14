package by.academy.tasks.strings;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество строк:");
		int n = scanner.nextInt();
		int cr = 0;

		String[] arr = new String[n];
		arr[0] = scanner.nextLine();

		for (int i = 1; i < arr.length; i++) {
			arr[i] = scanner.nextLine();
			cr += arr[i].length();
		}
		cr /= n;
		System.out.println("Cреднее значение: " + cr);
		System.out.println("Строки которые больше среднего:");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > cr) {
				System.out.print(arr[i] + "  " + " |" + arr[i].length() + "|   ");
			}
		}

		scanner.close();
	}
}
