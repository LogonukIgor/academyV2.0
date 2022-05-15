package by.academy.classwork.thread.tasks;

public class Thread4 implements Runnable{

	private int[] array;

	public Thread4() {
		super();
	}

	public Thread4(int[] array) {
		super();
		this.array = array;
	}

	@Override
	public void run() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		int max  = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		System.out.println("Max in 2: "+max);
	}
}
