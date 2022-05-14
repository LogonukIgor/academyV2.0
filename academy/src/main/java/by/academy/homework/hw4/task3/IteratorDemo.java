package by.academy.homework.hw4.task3;

public class IteratorDemo {

	public static void main(String[] args) {

		Integer[] array = { 1, 5, 6, 7, 3, 10, 11 };

		CustomCollection<Integer> c1 = new CustomCollection<>(array);

		CustomIterator iterator = c1.getIterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
