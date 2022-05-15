package by.academy.classwork.thread.tasks;

public class Thread5 implements Runnable{

	private int[] array;

	public Thread5() {
		super();
	}

	public Thread5(int[] array) {
		super();
		this.array = array;
	}

	@Override
	public void run() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		int sum = 0;
		for(int i= 0;i<array.length;i++) {
			sum+=array[i];
		}
		System.out.println("Average: "+(double)sum/array.length);
	}
}
