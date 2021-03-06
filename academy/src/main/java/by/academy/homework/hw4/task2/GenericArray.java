package by.academy.homework.hw4.task2;

import java.util.Arrays;

public class GenericArray<T> {

	private T[] array;
	private int index;

	public GenericArray() {
		super();
		this.array = (T[]) new Object[16];
	}

	public GenericArray(int arrayLength) {
		super();
		this.array = (T[]) new Object[arrayLength];
	}

	public void add(T object) {
		if (index >= array.length) {
			arrayGrow();
		}
		array[index++] = object;
	}

	private void arrayGrow() {
		T[] tempArray = (T[]) new Object[array.length * 2 + 1];
		System.arraycopy(array, 0, tempArray, 0, array.length);
		this.array = tempArray;
	}

	public T get(int i) throws IndexOutOfBoundsException {
		if (i >= array.length) {
			throw new IndexOutOfBoundsException("ОШИБКА <IndexOutOfBoundsException>");
		}
		return array[i];
	}

	public void remove(int i) {
		if (i < array.length && i >= 0) {
			System.arraycopy(array, i + 1, array, i, array.length - i - 1);
			index--;
		}
	}

	public void remove(T a) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null && array[i].equals(a)) {
				System.arraycopy(array, i + 1, array, i, array.length - i - 1);
				index--;
				break;
			}
		}
	}

	public T getFirst() {
		return array[0];
	}

	public T getLast() {
		return array[index - 1];
	}

	public int lastIndex() {
		return index - 1;
	}

	public int size() {
		return index;
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GenericArray");
		builder.append(Arrays.toString(array));
		return builder.toString();
	}

}
