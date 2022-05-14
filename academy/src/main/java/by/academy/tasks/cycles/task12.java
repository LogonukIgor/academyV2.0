package by.academy.tasks.cycles;

public class task12 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 10; i < 100; i++) {
			if (i % 2 == 1 & i % 13 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("Сумма нечётных чисел, которые делятся на 13: " + sum);
	}
}
