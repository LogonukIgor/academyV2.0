package by.academy.classwork.lesson16.task5;

public class FlyTest {

	public static void main(String[] args) {
		
		Bird b1 = new Bird("Гоша");
		Bird b2 = new Bird("Петя");
		Bird b3 = new Bird("Вова");
		
		Flyable birdFly = b -> System.out.println(b.getName()+" летит!");
		
		birdFly.fly(b1);
		birdFly.fly(b2);
		birdFly.fly(b3);
	}
}
