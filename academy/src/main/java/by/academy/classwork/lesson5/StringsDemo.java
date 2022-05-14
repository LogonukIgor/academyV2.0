package by.academy.classwork.lesson5;

public class StringsDemo {
	public static void main(String[] args) {

		String s = "Для работы со строками в языке Java используются классы String, StringBuilder, StringBuffer";

		System.out.println(s);
		int index = -1;

		do {
			index = s.indexOf("S", index == -1 ? 0 : index + 1);
			if (index != -1) {
				System.out.print(index + " ");
			}
		} while (index != -1);
		
	}
}
