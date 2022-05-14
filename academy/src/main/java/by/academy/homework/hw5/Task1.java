package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class Task1 {

	public static final Random RANDOM = new Random();

	public static void main(String[] args) {

		Integer[] array = new Integer[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = RANDOM.nextInt(11);
		}
		System.out.println(Arrays.toString(array));

		ArrayList<Integer> collection = new ArrayList<>();

		for (Integer a : array) {
			collection.add(a);
		}
		
		System.out.println(duplicates(collection));

	}

	public static <T> Collection<T> duplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
	
}
