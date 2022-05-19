package by.academy.finalwork.task1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Compression {

	public static final Pattern LOWER_CASE_PATTERN = Pattern.compile("^[a-z]+$");

	public static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Введите строку: ");

		String str = SCANNER.nextLine();

		while (!lowerCase(str)) {
			str = SCANNER.nextLine();
		}

		HashMap<Character, Integer> map = toDictionary(str);

		System.out.println(finalString(map));
	}

	public static int charCount(String text, Character character) {
		Character[] characters = new Character[text.length()];
		int counter = 0;
		for (int i = 0; i < characters.length; i++) {
			characters[i] = text.charAt(i);
			if (characters[i].equals(character)) {
				counter++;
			}
		}
		return counter;
	}

	public static HashMap<Character, Integer> toDictionary(String text) {
		Character[] characters = new Character[text.length()];
		HashSet<Character> charList = new HashSet<>();
		for (int i = 0; i < characters.length; i++) {
			characters[i] = text.charAt(i);
			charList.add(characters[i]);
		}
		Character[] charList1 = new Character[charList.size()];
		charList.toArray(charList1);
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < charList1.length; i++) {
			map.put(charList1[i], charCount(text, charList1[i]));
		}
		return map;
	}

	public static StringBuilder finalString(HashMap<Character, Integer> map) {
		StringBuilder str = new StringBuilder();
		Object[] charArray = map.keySet().toArray();
		for (int i = 0; i < charArray.length; i++) {
			Integer value = map.get(charArray[i]);
			str.append(charArray[i]);
			str.append(value);
		}
		return str;
	}

	public static boolean lowerCase(String text) {
		Matcher matcher = LOWER_CASE_PATTERN.matcher(text);
		return matcher.matches();
	}
}
