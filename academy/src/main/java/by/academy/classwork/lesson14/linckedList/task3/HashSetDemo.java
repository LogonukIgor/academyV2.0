package by.academy.classwork.lesson14.linckedList.task3;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		String string = "1, 2, 3, 3, 4, 4, 5, 5";
		String[] array1 = string.split(", ");
		HashSet<String> hashSet = new HashSet<>();
		
		for(int i=0;i<array1.length;i++) {
			hashSet.add(array1[i]);
		}
		
		System.out.println(hashSet.size());
		
		System.out.println(HashSetDemo.union(hashSet));
	}
	
	public static StringBuilder union(HashSet<String>...hashSets) {
		StringBuilder builder = new StringBuilder();
		for(int i =0;i<hashSets.length;i++) {
			builder.append(hashSets[i]+"");
		}
		return builder;
	}
}
