package by.academy.classwork.lesson12;

public class BoxNumber<T extends Number> {

	private T[] item;

	public BoxNumber() {
		super();
		this.item = (T[]) new Object[10];
	}

	public BoxNumber(T[] item) {
		super();
		this.item = item;
	}

	public double average() {
		double sum = 0.0;

		for (T valueT : item) {
			sum += valueT.doubleValue();
		}
		return sum / item.length;
	}

	public double maxValue() {
		double max = Double.MIN_VALUE;

		for (T valueT : item) {
			if (valueT.doubleValue() > max) {
				max = valueT.doubleValue();
			}
		}
		return max;
	}

	public double minValue() {
		double min = Double.MAX_VALUE;

		for (T valueT : item) {
			if (valueT.doubleValue() < min) {
				min = valueT.doubleValue();
			}
		}
		return min;
	}

	public boolean sameAvg(BoxNumber<?> box2) {
		boolean b = false;
		if (box2.average() == this.average()) {
			b = true;
		} else if (box2.average() != this.average()) {
			b = false;
		}
		return b;
	}

	public T[] getItem() {
		return item;
	}

	public void setItem(T[] item) {
		this.item = item;
	}
}
