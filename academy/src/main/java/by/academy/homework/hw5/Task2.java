package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {

		ArrayList<Number> arrayList = new ArrayList<>();
		LinkedList<Number> linkedList = new LinkedList<>();

		filling(arrayList);
		filling(linkedList);

		long startArray = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			arrayList.get((int) (Math.random() * 999_999));
		}
		long endArray = System.currentTimeMillis();
		System.out.println("Время получения 100000 элементов ArrayList " + (endArray - startArray) + " ms");

		long startLinked = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			arrayList.get((int) (Math.random() * 999_999));
		}
		long endtLinked = System.currentTimeMillis();
		System.out.println("Время получения 100000 элементов LinkedList " + (endtLinked - startLinked) + " ms");

	}

	public static void filling(Collection<Number> collection) {
		for (int i = 0; i < 1_000_000; i++) {
			collection.add(Math.random());
		}
	}
}
