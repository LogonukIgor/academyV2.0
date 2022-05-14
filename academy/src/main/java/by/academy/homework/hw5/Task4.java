package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task4 {

	public static final Random RANDOM = new Random();

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			array.add(RANDOM.nextInt(11));
		}

		Iterator<Integer> iterator = array.iterator();
		System.out.println(array);

		int maxValue = 0;
		while (iterator.hasNext()) {
			int value = iterator.next();
			if(value > maxValue) {
				maxValue = value;
			}
		}
		System.out.println("Максимальное значение: "+maxValue);
	}
}
