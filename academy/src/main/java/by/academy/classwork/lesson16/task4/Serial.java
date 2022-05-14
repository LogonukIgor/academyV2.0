package by.academy.classwork.lesson16.task4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import by.academy.classwork.lesson1.Cat;

public class Serial {

	public static void main(String[] args) throws ClassNotFoundException {

		Cat cat = new Cat("Васька", 12, 100);

		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("cat.txt"));
				ObjectOutputStream oos = new ObjectOutputStream(bos);) {
			oos.writeObject("test cat");
			oos.writeInt(100);
			oos.writeObject(cat);
		} catch (IOException e) {
			e.getMessage();
		}

		try (BufferedInputStream br = new BufferedInputStream(new FileInputStream("cat.txt"));
				ObjectInputStream isu = new ObjectInputStream(br);) {
			String string = (String) isu.readObject();
			Integer integer = isu.readInt();
			Cat cat1 = (Cat) isu.readObject();
			System.out.println(string);
			System.out.println(integer);
			System.out.println(cat1);
		} catch (IOException e) {
			e.getMessage();
		}
	}
}
