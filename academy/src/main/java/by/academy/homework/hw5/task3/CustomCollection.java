package by.academy.homework.hw5.task3;

import java.util.Arrays;
import java.util.Iterator;

public class CustomCollection<T> {

	private T[][] array;

	public CustomCollection(T[][] array) {
		this.array = array;
	}

	public T[][] getArray() {
		return array;
	}

	public void setArray(T[][] array) {
		this.array = array;
	}

	public ArrayIterator getIterator() {
		return new ArrayIterator();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomCollection [array=");
		builder.append(Arrays.toString(array));
		builder.append("]");
		return builder.toString();
	}

	public class ArrayIterator implements Iterator<T> {

		int i;
		int j;

		@Override
		public boolean hasNext() {
			for (int i = this.i; i < array.length; i++) {
				for (int j = this.j; j < array[i].length; j++) {
					return true;
				}
			}
			return false;
		}

		@Override
		public T next() {
			T element = array[i][j++];
			for (int i = this.i; i < array.length; i++) {
				for (int j = (i == this.i ? this.j : 0); j < array[i].length; j++) {
					this.i = i;
					this.j = j;
					return element;
				}
			}

			return element;
		}

	}

}
