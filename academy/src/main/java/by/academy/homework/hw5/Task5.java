package by.academy.homework.hw5;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task5 {

	public static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Введите текст:");
		String text = SCANNER.nextLine();

		TreeMap<Character, Integer> map = toDictionary(text);

		System.out.println(map);
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

	public static TreeMap<Character, Integer> toDictionary(String text) {
		Character[] characters = new Character[text.length()];
		TreeSet<Character> charList = new TreeSet<>();
		for (int i = 0; i < characters.length; i++) {
			characters[i] = text.charAt(i);
			charList.add(characters[i]);
		}
		Character[] charList1 = new Character[charList.size()];
		charList.toArray(charList1);
		TreeMap<Character, Integer> map = new TreeMap<>();
		for (int i = 0; i < charList1.length; i++) {
			map.put(charList1[i], charCount(text, charList1[i]));
		}
		return map;
	}
}
