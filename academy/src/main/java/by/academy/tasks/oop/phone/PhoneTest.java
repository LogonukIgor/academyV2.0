package by.academy.tasks.oop.phone;

public class PhoneTest {

	public static void main(String[] args) {

		Phone p1 = new Phone(375447550115L, "LL15", 1.2);
		Phone p2 = new Phone(375293242344L, "LL16", 1.3);
		Phone p3 = new Phone(375333485836L, "LL17", 1.35);

		System.out.print(p1 + "\n" + p2 + "\n" + p3 + "\n");

		p1.receiveCall("Витя");
		p2.receiveCall("Петя", 375333485357L);
		p2.receiveCall("Саша", 375333485358L);
		
		p1.sendMassage(375335663991L,375335663999L);
		
	}
}
