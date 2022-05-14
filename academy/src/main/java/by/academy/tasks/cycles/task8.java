package by.academy.tasks.cycles;

public class task8 {
	public static void main(String[] args) {
		
		System.out.println("Числа, которые делятся на 3, но не делятся на 5:");
		
		for (int i = 20; i <= 50; i++) {
			if (i % 3 == 0 & i % 5 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
