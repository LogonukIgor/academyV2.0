package by.academy.tasks.cycles;

public class task10 {
	public static void main(String[] args) {

		System.out.println("Числа, которые делятся на 5 и 7");
		int x = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 5 == 0 & i % 7 == 0) {
				System.out.print(i + " ");
				x += i;
			}
			if (i % 5 == 0 & i % 7 != 0) {
				System.out.print(i + " ");
				x += i;
			}
			if (i % 7 == 0 & i % 5 != 0) {
				System.out.print(i + " ");
				x += i;
			}
		}
		System.out.println();
		System.out.println("Сумма: " + x);
	}
}
