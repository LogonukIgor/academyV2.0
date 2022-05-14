package by.academy.classwork.lesson3;

public class operators3 {
	public static void main(String[] args) {
		int x = 27;
		if(x % 2 == 0 ) {
			System.out.println("Чётное");
		} else {
			System.out.println("Нечётное");
		}
		
		System.out.println(x & 1);	// 1 - нечётное, 2 - чётное
	}
}
