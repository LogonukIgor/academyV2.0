package by.academy.classwork.thread.tasks;

public class Task3Demo {

	public static void main(String[] args) throws InterruptedException {
		
		Thread3 a1 = new Thread3(new int[]{10,21,3});
		Thread4 a2 = new Thread4(new int[]{43,5,6});
		Thread5 a3 = new Thread5(new int[]{7,81,9});
		
		Thread thr1 = new Thread(a1);
		Thread thr2 = new Thread(a2);
		Thread thr3 = new Thread(a3);
		
		thr1.start();
		thr1.join();
		
		thr2.start();
		thr2.join();
		
		thr3.start();
		thr3.join();
		
		System.out.println("Закончили выполнение");
	}
}
