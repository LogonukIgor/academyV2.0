package by.academy.classwork.lesson12;

public class Demo {

	public static void main(String[] args) {
		
		Double[] arr1 = { 1.0, 2.0, 3.0, 4.0 };
		Double[] arr2 = { 1.0, 2.0, 3.0, 4.0 };
		Integer[] arr3 = { 1, 2, 3, 4 };
		
		BoxNumber<Double> box1 = new BoxNumber<>(arr1);
		BoxNumber<Double> box2 = new BoxNumber<>(arr2);
		BoxNumber<Integer> box3 = new BoxNumber<>(arr3);

		System.out.println("Мин " + box1.minValue());
		System.out.println("Макс " + box1.maxValue());
		System.out.println("Средн. арифм. " + box1.average());

		System.out.println("Равны ли коробки: " + box1.sameAvg(box2));
		System.out.println("Равны ли коробки: " + box1.sameAvg(box3));
		
	}
}
