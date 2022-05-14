package by.academy.tasks.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
	
	public static final Pattern p = Pattern.compile("\\b[a-zA-Z]+\\b");

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите строку (узнаем сколько слов):");
		String text = scanner.nextLine();
		int value = 0;

		Matcher matcher = p.matcher(text);
		while (matcher.find()) {
			value++;
		}
		System.out.println("Слов в строке: " + value);
	}
}
