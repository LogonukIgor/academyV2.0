package by.academy.tasks.cycles;

public class task23 {
	public static void main(String[] args) {
		double sum = 1;
		for (int i = 1; i <= 10; i++) {
			sum += Math.pow(2, i);
		}
		System.out.println(sum);
	}
}
