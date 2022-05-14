package by.academy.homework.hw1;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите тип данных:");
		String s1 = scanner.nextLine();

		switch(s1) {
		case "int":
			System.out.println("Введите число: ");
			int s2 = scanner.nextInt();
			s2 = s2%2;
			System.out.println("Остаток от деления на 2 = " + s2);
			break;
		case "double":
			System.out.println("Введите число: ");
			double s3 = scanner.nextDouble();
			s3 *= 0.7;
			System.out.println("70% от числа: " + s3);
			break;
		case "float":
			System.out.println("Введите число: ");
			float s4 = scanner.nextFloat();
			s4 = (float) Math.pow(s4, 2);
			System.out.println("Число в квадрате: " + s4);
			break;
		case "char":
			System.out.println("Введите символ: ");
			char s5 = scanner.next().charAt(0);
			int x = (int) s5;
			System.out.println("Код символа: " + x);
			break;
		case "String","string":
			System.out.println("Введите Ваше имя:");
			String s6 = scanner.nextLine();
			System.out.println("Привет, " + s6 + "!");
			break;
		default:
			System.out.println("Unsupported type");
		}
		
		scanner.close();
	}
}
