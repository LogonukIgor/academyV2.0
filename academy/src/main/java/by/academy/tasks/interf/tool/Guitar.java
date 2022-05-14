package by.academy.tasks.interf.tool;

public class Guitar implements Tool {

	protected int quantityOfString;

	public Guitar(int quantityOfString) {
		this.quantityOfString = quantityOfString;
	}

	@Override
	public void play() {
		System.out.println("играет гитара" + quantityOfString);
	}
}
