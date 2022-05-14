package by.academy.tasks.oop.recurs;

public class RecursiaDemo {
	
	public static void main(String[] args) {
		int a = 12;
		int b = 2;
		
		fromAToB(a,b);
	}
	
	public static void fromAToB(int a, int b) {
		if (a < b) {
			System.out.print(a + " ");
			a++;
			if(a==b) {
				System.out.println(a);
				return;
			}
		} else if (a > b) {
			System.out.print(a + " ");
			a--;
			if(a==b) {
				System.out.println(a);
				return;
			}
		}
		fromAToB(a, b);
	}
}
