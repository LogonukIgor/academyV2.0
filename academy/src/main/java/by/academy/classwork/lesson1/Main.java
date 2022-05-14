package by.academy.classwork.lesson1;

public class Main {
    public static void main(String[] args) {
    	Cat cat1 = new Cat();
    	Cat cat2 = new Cat("Billy");
    	
    	cat2.setNickname("Bob");
    	System.out.println(cat2.getNickname());
    	cat2.setAge(5);
    	
    	cat1.walk();
    	cat2.eat();
    	cat2.sleep();
    	cat2.grow(5);
    }  
}
