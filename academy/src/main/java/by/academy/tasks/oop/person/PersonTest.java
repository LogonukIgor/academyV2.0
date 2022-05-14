package by.academy.tasks.oop.person;

public class PersonTest {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person(20, "Игорь");
		
		p1.talk();
		p1.move();
		p2.talk();
		p2.move();
	}
}
