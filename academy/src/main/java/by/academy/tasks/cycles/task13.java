package by.academy.tasks.cycles;

public class task13 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 100; i <= 200; i++) {
			if (i % 17 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("Сумма чисел, которые делятся на 17: " + sum);
	}
}
