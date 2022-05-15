package by.academy.classwork.thread;

public class RunDemo {

	public static void main(String[] args) {
		MyRunnable a = new MyRunnable(new int[] { 1, 2, 3, 4, 5 });

		Thread thread1 = new Thread(a);
		Thread thread2 = new Thread(a);
		Thread thread3 = new Thread(a);

		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello lambda");
			}
		});

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
