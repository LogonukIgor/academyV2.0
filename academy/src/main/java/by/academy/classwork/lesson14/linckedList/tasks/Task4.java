package by.academy.classwork.lesson14.linckedList.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import by.academy.classwork.lesson13.arraylist.HeavyBox;

public class Task4 {

	public static void main(String[] args) {

		HeavyBox h1 = new HeavyBox(200, 2, 3, 4);
		HeavyBox h2 = new HeavyBox(350, 2, 3, 4);
		HeavyBox h3 = new HeavyBox(300, 2, 3, 4);
		HeavyBox h4 = new HeavyBox(150, 2, 3, 4);

		ArrayList<HeavyBox> array1 = new ArrayList<>();
		ArrayList<HeavyBox> array2 = new ArrayList<>();

		array1.add(h1);
		array1.add(h2);
		array1.add(h3);
		array1.add(h4);

		replaceIter(array1, array2);

		System.out.println("Первый:");
		Object[] boxarray1 = array1.toArray();
		System.out.println(Arrays.toString(boxarray1));

		System.out.println("Второй:");
		Object[] boxarray2 = array2.toArray();
		System.out.println(Arrays.toString(boxarray2));
	}

	public static void replace(ArrayList<HeavyBox> a1, ArrayList<HeavyBox> a2) {

		HeavyBox[] hb1 = new HeavyBox[a1.size()];
		a1.toArray(hb1);

		for (int i = 0; i < hb1.length; i++) {
			if (hb1[i].getWeight() > 300) {
				a1.remove(hb1[i]);
				a2.add(hb1[i]);
			}
		}

	}

	public static void replaceIter(ArrayList<HeavyBox> a1, ArrayList<HeavyBox> a2) {

		Iterator<HeavyBox> iter = a1.iterator();
		
		while (iter.hasNext()) {
			if(iter.next().getWeight()>300) {
				HeavyBox h = iter.next();
				a1.remove(h);
				a2.add(h);
			}
		}
	}
}
