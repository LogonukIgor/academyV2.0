package by.academy.classwork.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread a = new MyThread();
		a.setDaemon(true);
		a.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("In the thread: " + i);
		}
		System.out.println("Hello there i don't care about daemon");
	}
}
