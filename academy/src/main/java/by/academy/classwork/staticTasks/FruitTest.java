package by.academy.classwork.staticTasks;

public class FruitTest {

	public static void main(String[] args) {

		Fruit apple = new Apple(2, 4);
		Fruit.printManufactoryInfo();
		System.out.println(apple.fruitPrice());
	}
}
