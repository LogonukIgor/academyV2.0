package by.academy.homework.hw4.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	public static final Pattern DATE_PATTERN = Pattern.compile("^\\d{2}[\\/\\-]\\d{2}[\\/\\-]\\d{4}$");

	public static boolean dateValidator(String str) {
		Matcher matcher = DATE_PATTERN.matcher(str);
		return matcher.matches();
	}
}
