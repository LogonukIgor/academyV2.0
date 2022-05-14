package by.academy.classwork.lesson12.task6;

import by.academy.classwork.lesson10.Book;

public class TestTVK {

	public static void main(String[] args) {

		String string = "TVK";
		Book book = new Book();
		Integer a = 12;

		GenTVK<String, Book, Integer> box1 = new GenTVK<>(string, book, a);
		box1.takeName();

	}
	
}
