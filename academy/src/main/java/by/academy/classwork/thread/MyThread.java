package by.academy.classwork.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("In the thread: " + getName());
		}
	}
}
