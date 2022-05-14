package by.academy.classwork.lesson14.linckedList;

public class Demo {

	public static void main(String[] args) {
		LinkedListCustom<String> stringList1 = new LinkedListCustom<>();
		
		stringList1.add("Ф");
		stringList1.add("И");
		stringList1.add("З");
		stringList1.add(1,"f");
		
		System.out.println(stringList1.get(1));
		System.out.println(stringList1.get(2));
		System.out.println(stringList1.get(3));
		stringList1.remove(3);
		System.out.println(stringList1.get(2));
	}
}
