package by.academy.classwork.lesson15;

import java.security.MapEntry;
import java.util.HashMap;
import java.util.Map;

public class TaskMap7 {

	public static void main(String[] args) {
		Map<String, Toy> map1 = new HashMap<>();
		
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		Toy t3 = new Toy();
		
		map1.put("Bear", t1);
		map1.put("Car", t2);
		map1.put("Solder", t1);
		
		key(map1);
		value(map1);
		valueAndKey(map1);
		
		
	}
	
	public static void key(Map<String, Toy> map1) {
		for(String key: map1.keySet()) {
			System.out.println(key);
		}
	}
	
	public static void value(Map<String, Toy> map1) {
		for(Toy key: map1.values()) {
			System.out.println(key);
		}
	}
	
	public static void valueAndKey(Map<String, Toy> map1) {
		for(Entry<String, Toy> key: map1.entrySet()) {
			System.out.println(key.getKey()+" "+key.getValue());
		}
	}
}
