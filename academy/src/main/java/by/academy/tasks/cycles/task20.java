package by.academy.tasks.cycles;

public class task20 {
	public static void main(String[] args) {
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				int a = (i * 100) + j;
				int b = (j * 100) + i;
				if (a % 99 == 0 & b % 49 == 0) {
					System.out.println(a + " " + b);
				}
			}
		}
	}
}
