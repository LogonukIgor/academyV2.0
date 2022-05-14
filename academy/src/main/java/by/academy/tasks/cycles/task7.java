package by.academy.tasks.cycles;

import java.util.Scanner;

public class task7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Введите пару чисел: ");
			int a = scanner.nextInt(), b = scanner.nextInt();
			if (a > b) {
				System.out.println(a + ">" + b);
			} else if (a < b) {
				System.out.println(a + "<" + b);
			} else if (a == b) {
				System.out.println(a + "=" + b);
			}
		}
	}
}
