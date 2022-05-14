package by.academy.homework.hw1;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double discount;

		System.out.println("Введите сумму покупки: ");
		double price = scanner.nextDouble();

		System.out.println("Введите возраст покупателя: ");
		int age = scanner.nextInt();

		if (price >= 400) {
			discount = 20;
		} else if (price < 400 && price >= 300) {
			discount = 15;
		} else if (price < 300 && price >= 200) {
			discount = 12;
			if (age >= 18) {
				discount += 4;
			} else {
				discount -= 3;
			}
		} else if (price < 200 && price >= 100) {
			discount = 7;
		} else {
			discount = 5;
		}

		System.out.println("Скидка: " + discount + "%");

		discount = price * (discount / 100);
		price -= discount;

		System.out.println("Цена с учётом скидки: $" + price);
		
		scanner.close();
	}
}
