package by.academy.tasks.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
	
	public static final Scanner scanner = new Scanner(System.in);

	public static final Pattern p = Pattern.compile("\\w+");

	public static void main(String[] args) {

		System.out.println("Введите строку:");
		String text = scanner.nextLine();

		Matcher matcher = p.matcher(text);
		
		StringBuilder rezult = new StringBuilder();
		
		while (matcher.find()) {
            rezult.append(text.substring(matcher.end()-1, matcher.end()));
        }
 
        System.out.println(rezult);
    }
}
