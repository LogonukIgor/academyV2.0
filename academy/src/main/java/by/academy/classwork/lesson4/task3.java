package by.academy.classwork.lesson4;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите число: ");
		double x = scanner.nextInt();
		double p = 1;
		
		for (int i = 1; i <= x;i++) {
			p = (double) p * i;
			System.out.println(p);
		}
	}
}

