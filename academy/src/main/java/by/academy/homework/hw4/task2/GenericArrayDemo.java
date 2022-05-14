package by.academy.homework.hw4.task2;

public class GenericArrayDemo {

	public static void main(String[] args) {

		GenericArray<Integer> array1 = new GenericArray<>();

		array1.add(12);
		array1.add(4);
		array1.add(9);
		array1.add(2);

		System.out.println("Размер массива (без null): " + array1.size());

		try {
			System.out.println(array1.get(16));
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Элемент с индексом <2>: " + array1.get(2));
		System.out.println("Первый элемент: " + array1.getFirst());
		System.out.println("Последний элемент: " + array1.getLast());
		System.out.println("Индекс последнего элемента: " + array1.lastIndex());
		
		System.out.println(array1.toString());
		array1.remove(0);
		System.out.println(array1.toString());
		
		Integer a = 2;
		array1.remove(a);
		System.out.println(array1.toString());
	}
}
