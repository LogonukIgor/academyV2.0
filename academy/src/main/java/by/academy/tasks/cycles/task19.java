package by.academy.tasks.cycles;

public class task19 {
	public static void main(String[] args) {
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				int a = (i*100)+j;
				int b = i*j;
				if(a%b==0) {
					System.out.println(a);
					System.out.println(a/b);
				}
			}
		}
	}
}
