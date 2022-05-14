package by.academy.tasks.oop.students;

public class Aspirant extends Student {
	
	public Aspirant(double overageMark) {
		super(overageMark);
	}

	@Override
	public int getScholarship() {
		int a = 0;
		if (overageMark == 5) {
			a = 200;
		} else if (overageMark < 5 && overageMark > 0) {
			a = 180;
		}
		return a;
	}

}
