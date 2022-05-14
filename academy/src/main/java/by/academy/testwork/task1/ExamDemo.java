package by.academy.testwork.task1;

import java.util.Arrays;
import java.util.Random;

public class ExamDemo {

	public static void main(String[] args) {

		Random random = new Random();
		Integer numMarks = random.nextInt(7)+3;

		Integer[] array2 = new Integer[numMarks];
		
		for(int i = 0;i<array2.length;i++) {
			array2[i] = random.nextInt(11);
		}

		Exam<Integer> exam = new Exam<>(array2);
		System.out.println("Начальный массив:"+Arrays.toString(exam.getMark()));
		
		exam.add(2,7);
		System.out.println("Add element:     "+Arrays.toString(exam.getMark()));
		
		exam.remove(1);
		System.out.println("Remove element:  "+Arrays.toString(exam.getMark()));
		
		
		System.out.println(exam.averageMark());
	}

}
