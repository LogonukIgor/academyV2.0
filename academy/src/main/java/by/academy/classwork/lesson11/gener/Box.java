package by.academy.classwork.lesson11.gener;

public class Box<T> {

	private T[] item;

	public Box(){
		super();
		this.item = (T[]) new Object[10];
	}

	public Box(T[] item) {
		super();
		this.item = item;
	}
	

	public T[] getItem() {
		return item;
	}

	public void setItem(T[] item) {
		this.item = item;
	}

}
