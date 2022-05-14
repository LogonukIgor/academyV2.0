package by.academy.classwork.lesson16.task1;

import by.academy.classwork.lesson15.taskPet.Cat;

public class CatExceptionDemo {

	public static void main(String[] args) {
		Cat cat = new Cat();
		try {
			catThrowException(cat);
		} catch (CatException e) {
			e.printStackTrace();
		}
	}
	
	public static void catThrowException(Cat cat) throws CatException {
		throw new CatException("what");
	}
}
