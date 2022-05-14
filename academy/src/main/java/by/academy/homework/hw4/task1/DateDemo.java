package by.academy.homework.hw4.task1;

import by.academy.homework.hw4.task1.CustomDate.Year;

public class DateDemo {

	public static void main(String[] args) {

		CustomDate date1 = new CustomDate(2022, 5, 1);
		CustomDate date2 = new CustomDate(2022, 4, 1);
		CustomDate date3 = new CustomDate("12-10-2001");

		System.out.println("Дата, которая проверялась паттерном: " + date3);
		System.out.println("1) " + date1);
		System.out.println("2) " + date2);
		System.out.println("Разница в днях между датами 1) и 2): " + CustomDate.differenceInDays(date1, date2));

		CustomDate.Year year = new Year(2001);
		System.out.println(year);

		System.out.print("День недели для даты 1): ");
		date1.getdayOfWeek();

		date1.setDate(2020, 10, 25);
		System.out.println("Изменённая дата 1): " + date1);
		System.out.println("Является ли он високосным: " + date1.leapYear());
	}
}
