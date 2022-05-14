package by.academy.classwork.lesson14.linckedList.task3;

public class SetDemo {

	public static void main(String[] args) {
		
		Set1<String> str1 = new Set1<>("1");
		Set1<String> str2 = new Set1<>("2");
		Set1<String> str3 = new Set1<>("3");
		
		System.out.println(str1.union(str1,str2));
		
	}
}
