package by.academy.classwork.lesson10;

import java.io.Serializable;

public class Book implements Printable, Serializable {

	@Override
	public void print() {
		System.out.println("книга");
	}

	public static void printBook(Printable[] printable) {
		for (Printable printables : printable) {
			if (printables instanceof Book) {
				printables.print();
				System.out.println("ikik");
			}
		}
	}
}
