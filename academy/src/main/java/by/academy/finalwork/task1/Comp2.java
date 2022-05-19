package by.academy.finalwork.task1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comp2 {

	public static final Pattern LOWER_CASE_PATTERN = Pattern.compile("^[a-z]+$");

	public static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Введите строку: ");

		String str = SCANNER.nextLine();

		while (!lowerCase(str)) {
			str = SCANNER.nextLine();
		}

		System.out.println(countChar(str));

		if (str.length() < compression(countChar(str), str).length()) {
			System.out.print("Начальная строка меньше: ");
			System.out.println(str);
		} else {
			System.out.println(compression(countChar(str), str));
		}

	}

	public static ArrayList<Integer> countChar(String str) {
		char[] charArray = str.toCharArray();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Integer count = 1;
		for (int i = 0; i < charArray.length - 1; i++) {
			if (charArray[i] == charArray[i + 1]) {
				count++;
			} else {
				list.add(count);
				count = 1;
			}
		}
		list.add(count);
		return list;
	}

	public static StringBuilder compression(ArrayList<Integer> list, String str) {
		StringBuilder str1 = new StringBuilder();
		Integer[] intArray = new Integer[list.size()];
		char[] charArray = str.toCharArray();
		list.toArray(intArray);
		int temp = 0;
		for (int i = 0; i < intArray.length; i++) {
			temp += intArray[i];
			str1.append(charArray[temp - 1]);
			str1.append(intArray[i]);
		}
		return str1;
	}

	public static boolean lowerCase(String text) {
		Matcher matcher = LOWER_CASE_PATTERN.matcher(text);
		return matcher.matches();
	}
}
