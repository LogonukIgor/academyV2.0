package by.academy.classwork.lesson12.task6;

import by.academy.classwork.lesson10.Book;
import java.io.Serializable;

public class GenTVK<T extends Comparable<?>, V extends Book & Serializable, K extends Number> {

	private T itemT;
	private V itemV;
	private K itemK;

	public GenTVK(T itemT, V itemV, K itemK) {
		super();
		this.itemT = itemT;
		this.itemV = itemV;
		this.itemK = itemK;
	}

	public void takeName() {
		System.out.println("T: " + itemT.getClass());
		System.out.println("V: " + itemV.getClass());
		System.out.println("K: " + itemK.getClass());
	}

	public T getItem() {
		return itemT;
	}

	public void setItem(T itemT) {
		this.itemT = itemT;
	}

	public V getItemV() {
		return itemV;
	}

	public void setItemV(V itemV) {
		this.itemV = itemV;
	}

	public K getItemK() {
		return itemK;
	}

	public void setItemK(K itemK) {
		this.itemK = itemK;
	}

}
