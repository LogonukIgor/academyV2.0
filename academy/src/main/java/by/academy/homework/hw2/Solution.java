package by.academy.homework.hw2;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	static int pairs(int k, int n, int[] arr) {
		int pairsCount = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] - arr[j] == k) {
					pairsCount++;
				}
			}
		}

		return pairsCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		System.out.println("Введите n и k через пробел:");
		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] arr = new int[n];
		
		System.out.println("Введите массив:");
		String[] arrItems = scanner.nextLine().split(" ");
		
		System.out.println("Массив чисел:");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(arrItems[i]);
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int result = pairs(k, n, arr);
		System.out.println("Количество пар (разность которых равна " + k + "): " + result);

		scanner.close();
	}
}
