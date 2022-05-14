package by.academy.classwork.lesson16.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilesDemo {

	public static void main(String[] args) {

		File abs = new File("test.txt");
		System.out.println(abs.length());
		System.out.println(abs.exists());
		
		try (OutputStream output = new FileOutputStream("test1.txt");
				InputStream input = new FileInputStream("test.txt");) {

			int size = input.available();
			for (int i = 0; i < size; i++) {
				char a = (char) input.read();
				output.write(a);
				System.out.print(a);
			}
			
		} catch (IOException e) {
			System.out.println("Опа, ошибка!");
		}
	}
}
