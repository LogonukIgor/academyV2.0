package by.academy.homework.hw6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	public static final Pattern TEXT_PATTERN = Pattern.compile("stop");

	public static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Введите строку: ");
		String text = SCANNER.nextLine();

		try (OutputStream output = new FileOutputStream("task1_hw6.txt");) {
			char[] textToChar = text.substring(0, stopWord(text)).toCharArray();
			for (int i = 0; i < textToChar.length; i++) {
				output.write(textToChar[i]);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static int stopWord(String text) {
		Matcher matcher = TEXT_PATTERN.matcher(text);
		while (matcher.find()) {
			int start = matcher.start();
			return start;
		}
		return text.length();
	}
}
