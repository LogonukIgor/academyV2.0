package by.academy.homework.hw6;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

public class Task4 {

	public static final Random RANDOM = new Random();

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			String path = "src\\main\\java\\by\\academy\\homework\\hw6\\task4\\" + i + ".txt";
			try (OutputStream output = new FileOutputStream(path);
					InputStream input = new FileInputStream("task2_hw6");) {
				int size = RANDOM.nextInt(task2Length());
				for (int j = 0; j < size; j++) {
					char a = (char) input.read();
					output.write((char) a);
				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}

		try (FileWriter writer = new FileWriter("task4_result.txt");
				BufferedWriter bufferedWriter = new BufferedWriter(writer);) {
			for (int i = 1; i <= 100; i++) {
				String path = "src\\main\\java\\by\\academy\\homework\\hw6\\task4\\" + i + ".txt";
				bufferedWriter.write(i + ".txt  "+textLength(path));
				bufferedWriter.newLine();
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public static int task2Length() throws IOException {
		InputStream input = new FileInputStream("task2_hw6");
		int size = input.available();
		input.close();
		return size;
	}

	public static int textLength(String path) throws IOException {
		InputStream input = new FileInputStream(path);
		int size = input.available();
		input.close();
		return size;
	}
}
