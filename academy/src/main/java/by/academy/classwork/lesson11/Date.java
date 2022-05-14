package by.academy.classwork.lesson11;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {
		LocalDate a = LocalDate.of(2000,5,26);
		
		int year = a.getYear();
		int month = a.getMonthValue();
		int day = a.getDayOfMonth();
		Month monthDate = a.getMonth();
		
		System.out.println(year+" "+month+" "+day);
		System.out.println(monthDate);
		
		LocalDate a3 = a.plusYears(5).minusMonths(3).plusDays(45);
		
		int year1 = a3.getYear();
		int month1 = a3.getMonthValue();
		int day1 = a3.getDayOfMonth();
		Month monthDate1 = a3.getMonth();
		
		System.out.println();
		System.out.println(year1+" "+month1+" "+day1);
		System.out.println(monthDate1);
		
		boolean b1 = a.equals(a3);
		boolean b2 = a.isAfter(a3);
		boolean b3 = a.isBefore(a3);
		
		System.out.println();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
