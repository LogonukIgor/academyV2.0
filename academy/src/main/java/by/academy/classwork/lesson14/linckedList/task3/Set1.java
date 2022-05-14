package by.academy.classwork.lesson14.linckedList.task3;

import java.util.HashSet;

public class Set1<E> extends HashSet<E> {

	private String str1;

	public Set1(String str1) {
		super();
		this.str1 = str1;
	}

	public StringBuilder union(Set1<E>... sets) {
		StringBuilder builder = new StringBuilder();
		builder.append(sets);
		return builder;
	}
}
