package by.academy.homework.hw4.task1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CustomDate {

	private Year year;
	private Month month;
	private Day day;

	public CustomDate() {
		super();
	}

	public CustomDate(String patternString) {
		super();
		if (Validator.dateValidator(patternString)) {
			this.year = new Year(Integer.parseInt(patternString.substring(6)));
			this.month = new Month(Integer.parseInt(patternString.substring(3, 5)));
			this.day = new Day(Integer.parseInt(patternString.substring(0, 2)));
		} else {
			System.out.println("Дата должна быть в формате dd-mm-yyyy");
		}
	}

	public CustomDate(int year, int month, int day) {
		this.year = new Year(year);
		this.month = new Month(month);
		this.day = new Day(day);
	}

	public void setDate(int year, int month, int day) {
		this.year = new Year(year);
		this.month = new Month(month);
		this.day = new Day(day);
	}

	public void getdayOfWeek() {
		Calendar calendar = new GregorianCalendar();
		calendar.set(year.getYear(), month.getMonth(), day.getDay() + 3);
		int a = calendar.get(Calendar.DAY_OF_WEEK);
		Week.day(a);
	}

	public static int differenceInDays(CustomDate a, CustomDate b) {
		Calendar calendar1 = new GregorianCalendar(a.getYear().getYear(), a.getMonth().getMonth(), a.getDay().getDay());
		Calendar calendar2 = new GregorianCalendar(b.getYear().getYear(), b.getMonth().getMonth(), b.getDay().getDay());
		int diff = dateDiff(calendar1, calendar2);
		return diff;
	}

	public static int dateDiff(Calendar date1, Calendar date2) {
		if (date1.get(Calendar.YEAR) == date2.get(Calendar.YEAR)) {
			return Math.abs(date1.get(Calendar.DAY_OF_YEAR) - date2.get(Calendar.DAY_OF_YEAR));
		} else {
			if (date2.get(Calendar.YEAR) > date1.get(Calendar.YEAR)) {
				Calendar temp = date1;
				date1 = date2;
				date2 = temp;
			}
			int resultDays = 0;
			int dayOneOriginalYearDays = date1.get(Calendar.DAY_OF_YEAR);
			while (date1.get(Calendar.YEAR) > date2.get(Calendar.YEAR)) {
				date1.add(Calendar.YEAR, -1);
				resultDays += date1.getActualMaximum(Calendar.DAY_OF_YEAR);
			}
			return resultDays - date2.get(Calendar.DAY_OF_YEAR) + dayOneOriginalYearDays;
		}
	}

	public boolean leapYear() {
		return year.getYear() % 4 == 0 && year.getYear() % 100 != 0 || year.getYear() % 400 == 0;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(day);
		builder.append(".");
		builder.append(month);
		builder.append(".");
		builder.append(year);
		return builder.toString();
	}

	public static class Year {
		private int year;

		public Year(int year) {
			super();
			this.year = year;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(year);
			return builder.toString();
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

	}

	public static class Month {
		private int month;

		public Month(int month) {
			this.month = month;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(month);
			return builder.toString();
		}

	}

	public static class Day {
		private int day;

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public Day(int day) {
			this.day = day;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(day);
			return builder.toString();
		}

	}

}
