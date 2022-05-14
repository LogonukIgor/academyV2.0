package by.academy.classwork.lesson2.operators;

public class SimpleOperators {

	public static void main(String[] args) {
		int number = 5;
		number = -number;
		System.out.println(number);

		boolean bool = true;
		bool = !bool;
		System.out.println(bool);

		char c = 'a';
		c = (char) (c + 1);
		System.out.println(c);

		int number1 = 10;
		System.out.println(number1);
		number1 += 10;
		System.out.println(number1);
		number1 -= 10;
		System.out.println(number1);
		number1 *= 10;
		System.out.println(number1);
		number1 /= 10;
		System.out.println(number1);
		number1 %= 10;

		int i = 1;
		i++;
		System.out.println(i);
		i += 1;
		System.out.println(i);
		i = i + 1;
		System.out.println(i);

		int j = 0;
		j++;
		--j;
		System.out.println(j);

		for (int k = 0; k < 3; k++) {
			System.out.println("Hello world");
		}
	}

}
