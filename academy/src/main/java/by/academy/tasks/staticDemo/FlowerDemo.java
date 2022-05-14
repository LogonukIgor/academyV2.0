package by.academy.tasks.staticDemo;

public class FlowerDemo {

	public static void main(String[] args) {
		Flower f1 = new Flower("Germ", "2 day", 10);
		Flower f2 = new Rose("Germ", "2 day", 4);
		Flower f3 = new Tulip("Germ", "2 day", 6);
		Flower f4 = new Flower("Germ", "2 day", 2);

		System.out.println(Flower.getNumFlower());

		Flower[] array = new Flower[4];
		array[0] = f1;
		array[1] = f2;
		array[2] = f3;
		array[3] = f4;

		System.out.println(Flower.calcPrice(array));
	}
}
