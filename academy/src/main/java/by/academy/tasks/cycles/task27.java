package by.academy.tasks.cycles;

import java.util.Scanner;

public class task27 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int k = scanner.nextInt();

		while (m >= 0) {
			m -= k;
			if (m < 0) {
				m += k;
				break;
			}
		}
		System.out.println(m);
	}
}
