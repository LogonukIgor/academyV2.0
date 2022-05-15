package by.academy.classwork.thread.tasks;

public class Demo2 {

	public static void main(String[] args) {
		
		Task2Thread a = new Task2Thread();
		
		Thread thread1 = new Thread(a);
		Thread thread2 = new Thread(a);
		Thread thread3 = new Thread(a);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}
