package by.academy.homework.hw4.task1;

public enum Week {

	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

	public static void day(int intDayOfWeek) {
		switch (intDayOfWeek) {
		case 1:
			System.out.println(Week.MONDAY);
			break;
		case 2:
			System.out.println(Week.TUESDAY);
			break;
		case 3:
			System.out.println(Week.WEDNESDAY);
			break;
		case 4:
			System.out.println(Week.THURSDAY);
			break;
		case 5:
			System.out.println(Week.FRIDAY);
			break;
		case 6:
			System.out.println(Week.SATURDAY);
			break;
		case 7:
			System.out.println(Week.SUNDAY);
			break;
		}
	}
}
