package by.academy.classwork.thread.tasks.task4;

public class Task4Demo {

	public static void main(String[] args) throws InterruptedException {
		
		StringBuilder str = new StringBuilder("s");
		
		new Task4(str).start();
		
		new Task4(str).start();
		
		new Task4(str).start();
		
//		System.out.println(a.getNum());
	}
}
