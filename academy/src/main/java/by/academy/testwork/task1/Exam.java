package by.academy.testwork.task1;

import java.util.Arrays;

public class Exam<T extends Number> {

	private T[] mark;

	public Exam() {
		super();
	}

	public Exam(T[] mark) {
		super();
		this.mark = mark;
	}

	public double averageMark() {
		Integer sum = 0;
		for (T a : mark) {
			sum += a.intValue();
		}
		double cped = (double) sum / mark.length;
		System.out.print("Средняя оценка: ");
		return cped;
	}

	public void add(T value) {
		T[] tempMark = (T[]) new Number[mark.length + 1];
		System.arraycopy(mark, 0, tempMark, 0, mark.length);
		mark = tempMark;
		mark[mark.length - 1] = value;
	}

	public void add(int index, T value) {
		if (index <= mark.length && index >= 0) {
			T[] tempMark = (T[]) new Number[mark.length + 1];
			System.arraycopy(mark, 0, tempMark, 0, index);
			System.arraycopy(mark, index, tempMark, index + 1, mark.length - index);
			mark = tempMark;
			mark[index] = value;
		}

	}
	
	public void remove(int index) {
		if (index <= mark.length && index >= 0) {
			T[] tempMark = (T[]) new Number[mark.length - 1];
			System.arraycopy(mark, 0, tempMark, 0, index);
			System.arraycopy(mark, index+1, tempMark, index, mark.length - index-1);
			mark = tempMark;
		}

	}

	public T[] getMark() {
		return mark;
	}

	public void setMark(T[] mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Exam [mark=");
		builder.append(Arrays.toString(mark));
		builder.append("]");
		return builder.toString();
	}

}
