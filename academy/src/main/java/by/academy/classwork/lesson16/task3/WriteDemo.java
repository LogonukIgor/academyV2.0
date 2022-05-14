package by.academy.classwork.lesson16.task3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) {

		try (FileWriter writer = new FileWriter("java.txt");
				BufferedWriter bufferedWriter = new BufferedWriter(writer);) {
			String[] text = { "Array", "String", "OOP", "Files", "Cycles", "Interface", "Enum", "Operators", "Regex",
					"Generics", "Collections" };
			for (int i = 0; i < text.length; i++) {
				bufferedWriter.write(text[i]);
				bufferedWriter.newLine();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try (FileReader reader = new FileReader("java.txt");
				BufferedReader bufferedReader = new BufferedReader(reader);) {
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
