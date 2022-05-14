package by.academy.tasks.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

	public static final Pattern p = Pattern.compile(".+");

	public static void main(String[] args) {
		String text = "Hey      There!     How      Are you doing   ;";
		String s = text.replaceAll("\\s+", " ");
		
		Matcher matcher = p.matcher(s);
		
		while(matcher.find()) {
			
			int start = matcher.start();
			int end = matcher.end();
			
			System.out.println(s.substring(start,end));
		}
	}
}
