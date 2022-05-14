package by.academy.homework.hw6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task2 {

	public static void main(String[] args) {
		
		try (OutputStream output = new FileOutputStream("result.txt");
				InputStream input = new FileInputStream("task2_hw6");) {
			int size = input.available();
			for (int i = 0; i < size; i++) {
				Character a = (char) input.read();
				if(!a.equals(' ')) {
					output.write((char)a);
				}
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
