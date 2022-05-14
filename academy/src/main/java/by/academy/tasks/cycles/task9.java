package by.academy.tasks.cycles;

public class task9 {
	public static void main(String[] args) {

		System.out.println("Числа, которые дают остаток 1, 2 или 5 (при делении на 7):");

		for (int i = 35; i <= 87; i++) {
			if (i % 7 == 1) {
				System.out.print(i + " ");
			}
			if (i % 7 == 2) {
				System.out.print(i + " ");
			}
			if (i % 7 == 5) {
				System.out.print(i + " ");
			}
		}
	}
}
