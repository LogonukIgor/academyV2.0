package by.academy.tasks.oop.students;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student(5); 
		Student s2 = new Student(4);
		Student a1 = new Aspirant(5);
		Student a2 = new Aspirant(4);
		
		Student[] array = new Student[4];
		array[0] = s1;
		array[1] = s2;
		array[2] = a1;
		array[3] = a2;
		
		for(Student a: array) {
			System.out.println(a.getScholarship());
		}
			
	}
}
