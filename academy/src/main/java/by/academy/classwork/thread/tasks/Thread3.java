package by.academy.classwork.thread.tasks;

public class Thread3 implements Runnable {
	
	private int[] array;

	public Thread3() {
		super();
	}

	public Thread3(int[] array) {
		super();
		this.array = array;
	}

	@Override
	public void run() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		int min  = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		System.out.println("Min in 1: "+min);
	}
}
