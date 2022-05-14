package by.academy.classwork.lesson11.gener;

public class BoxDemo {

	public static void main(String[] args) {
		
		Cat[] array1 = new Cat[10];
		
		Box<Cat> catBox = new Box<>(array1);
		System.out.println(catBox.getItem());
		
	}
}
