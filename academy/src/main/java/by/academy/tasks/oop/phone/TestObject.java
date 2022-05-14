package by.academy.tasks.oop.phone;

public class TestObject {

	public int sumOfNum(int... array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}
}
