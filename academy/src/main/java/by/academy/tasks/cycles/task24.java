package by.academy.tasks.cycles;

public class task24 {
	public static void main(String[] args) {
		
		int a = 1;
		double p = 1;
		
		for (int i = 2; i < 11; i++) {
			a += i;
			p *= (double) a;
		}
		System.out.println(p);
	}
}
