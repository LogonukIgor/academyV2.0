package by.academy.tasks.strings;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		String str1 = new String("JavA");
		String str2 = "Java";
		
		System.out.println(str1.charAt(0));
		System.out.println(str1.codePointAt(1));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.concat(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.hashCode());
		System.out.println(str1.indexOf("J"));
		System.out.println(str1.isEmpty());
		System.out.println(str1.length());
		
		String[] strings = str1.split("a");
		System.out.println(Arrays.toString(strings));
		System.out.println(str1.substring(2,3));
		char[] array = str1.toCharArray();
		System.out.println(Arrays.toString(array));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.trim());
		System.out.println(str1.lastIndexOf('a'));
		
		System.out.println(String.join(str1, " < "));
		
	}
}
