package by.academy.homework.hw5.task3;

import by.academy.homework.hw5.task3.CustomCollection.ArrayIterator;

public class IteratorTest {

	public static void main(String[] args) {

		Integer[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		String[][] array1 = {{"a","b","c"},{"d","e","f"},{"g","h","i"}};

		CustomCollection<Integer> collection = new CustomCollection<>(array);
		CustomCollection<String> collection1 = new CustomCollection<>(array1);
		
		ArrayIterator iterator = collection.getIterator();
		ArrayIterator iterator1 = collection1.getIterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.println();
		
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() + " ");
		}
	}
}
