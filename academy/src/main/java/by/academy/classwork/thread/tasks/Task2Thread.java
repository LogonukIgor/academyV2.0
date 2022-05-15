package by.academy.classwork.thread.tasks;

public class Task2Thread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
