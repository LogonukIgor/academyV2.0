package by.academy.testwork.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentDemo {

	public static void main(String[] args) {

		Student s1 = new Student("Bob", 3, 10405119L);
		Student s2 = new Student("Billy", 3, 10405119L);
		Student s3 = new Student("John", 2, 10405119L);
		s1.setAverage(2);

		ArrayList<Student> array1 = new ArrayList<>();

		array1.add(s1);
		array1.add(s2);
		array1.add(s3);

		System.out.println("Первый:");
		Object[] boxarray1 = array1.toArray();
		System.out.println(Arrays.toString(boxarray1));

		remove(array1);

		System.out.println("Второй:");
		Object[] boxarray2 = array1.toArray();
		System.out.println(Arrays.toString(boxarray2));

		printStud(array1, 2);
	}

	public static void remove(ArrayList<Student> a1) {

		Student[] hb1 = new Student[a1.size()];
		a1.toArray(hb1);

		for (int i = 0; i < hb1.length; i++) {
			if (hb1[i].getAverage() < 3.0) {
				a1.remove(hb1[i]);
			}
		}
	}

	public static void printStud(ArrayList<Student> a1, int a) {

		Student[] hb1 = new Student[a1.size()];
		a1.toArray(hb1);

		for (int i = 0; i < hb1.length; i++) {
			if (hb1[i].getWell() == a) {
				System.out.print(a1.get(i) + " ");
			}
		}
	}
}
