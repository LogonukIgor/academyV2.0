package by.academy.classwork.lesson15.taskPet;

import java.util.HashMap;
import java.util.Map;

import by.academy.classwork.lesson15.Toy;

public class PatDemo {

	public static void main(String[] args) {
		Map<String, Pet> map1 = new HashMap<>();
		
		Pet p1 = new Dog();
		Pet p2 = new Parrot();
		Pet p3 = new Cat();
		
		map1.put("Volk", p1);
		map1.put("Fly", p2);
		map1.put("Hrr", p3);
		
		
	}
	
	public static void valueAndKey(Map<String, Pet> map1) {
		for(String key: map1.keySet()) {
			System.out.println(key+": "+map1.get(key));
		}
	}
}
