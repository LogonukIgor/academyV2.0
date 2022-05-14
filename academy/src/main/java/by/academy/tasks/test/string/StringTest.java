package by.academy.tasks.test.string;

public class StringTest {

	public static void main(String[] args) {
		
		StringInfo str = new StringInfo(); 
		
		System.out.println(str.longerthanAverage());
		System.out.println(str.maxLine());
		System.out.println(str.minLine());
		
		System.out.println(StringInfo.maxLine("Привет Витя"));
		System.out.println(StringInfo.minLine("Привет Витя"));
		System.out.println(StringInfo.longerthanAverage("привет я андрей"));
		
		System.out.println(str.decrease());
		System.out.println(str.increase());
	}
}
