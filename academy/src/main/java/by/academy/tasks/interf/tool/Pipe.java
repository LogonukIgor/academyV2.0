package by.academy.tasks.interf.tool;

public class Pipe implements Tool {

	protected double diameter;

	public Pipe(double diameter) {
		this.diameter = diameter;
	}

	@Override
	public void play() {
		System.out.println("играет труба" + diameter);
	}
}
