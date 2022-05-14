package by.academy.tasks.interf.tool;

public class Drum implements Tool {

	protected int size;

	public Drum(int size) {
		this.size = size;
	}

	@Override
	public void play() {
		System.out.println("играет барабан" + size);
	}
}
