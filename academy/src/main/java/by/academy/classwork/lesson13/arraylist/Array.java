package by.academy.classwork.lesson13.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		ArrayList<HeavyBox> array1 = new ArrayList<>();

		HeavyBox box1 = new HeavyBox(1, 2, 3, 4);
		HeavyBox box2 = new HeavyBox(1, 2, 3, 4);
		HeavyBox box3 = new HeavyBox(1, 2, 3, 4);
		HeavyBox box4 = new HeavyBox(1, 2, 3, 4);

		array1.add(box1);
		array1.add(box2);
		array1.add(box3);
		array1.add(box4);

		System.out.println("Массив for each:");

		for (HeavyBox iBox : array1) {
			System.out.print(iBox);
			System.out.println();
		}

		array1.get(0).setWeight(2);

		array1.remove(array1.size() - 1);

		
		System.out.println("Нулевой:");
		HeavyBox[] boxarray = new HeavyBox[array1.size()];
		for(int i = 0;i<boxarray.length;i++) {
			boxarray[i] = array1.get(i);
		}
		System.out.println(Arrays.toString(boxarray));
		
		System.out.println("Первый:");
		Object[] boxarray1 = array1.toArray();
		System.out.println(Arrays.toString(boxarray1));
		
		System.out.println("Второй:");
		HeavyBox[] boxarray2 = new HeavyBox[array1.size()];
		array1.toArray(boxarray2);
		System.out.println(Arrays.toString(boxarray2));
		
		System.out.println("Третий:");
		HeavyBox[] boxarray3 = array1.toArray(HeavyBox[]::new);
		System.out.println(Arrays.toString(boxarray3));
		
		array1.clear();
	}
}
