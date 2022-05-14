package by.academy.tasks.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
	
	public static final Scanner scanner = new Scanner(System.in);

	public static final Pattern p = Pattern.compile("^(+1)\\\\d{9}$");

	public static void main(String[] args) {

		System.out.println("Введите строку:");
		String text = scanner.nextLine();

		Matcher matcher = p.matcher(text);
		
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
