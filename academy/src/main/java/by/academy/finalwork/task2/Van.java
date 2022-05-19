package by.academy.finalwork.task2;

import java.util.HashMap;

public class Van {

	private HashMap<TypeOfCoffee, Double> coffee;
	private int liftingCapacity;

	public Van(int liftingCapacity) {
		super();
		this.liftingCapacity = liftingCapacity;
		coffee = new HashMap<>();
	}

	public Van(HashMap<TypeOfCoffee, Double> coffee) {
		this.coffee = coffee;
	}

	public void add(TypeOfCoffee typeOfCoffee, Double weight) {
		Double temp = 0.0;
		for (Double value : coffee.values()) {
			temp += value;
		}
		temp += weight;
		if (temp <= liftingCapacity) {
			coffee.put(typeOfCoffee, weight);
		} else {
			System.out.println("Фургон перегружен!!!");
		}
	}

	public void get(TypeOfCoffee typeOfCoffee) {
		TypeOfCoffee.name(typeOfCoffee);
		System.out.print(" " + coffee.get(typeOfCoffee) + " кг "
				+ TypeOfCoffee.calcPrice(typeOfCoffee, coffee.get(typeOfCoffee)) + " руб\n");
	}

	public void get(Double a, Double b) {
		for (TypeOfCoffee key : coffee.keySet()) {
			if (coffee.get(key) >= a && coffee.get(key) <= b) {
				TypeOfCoffee.name(key);
				System.out.print(
						" " + coffee.get(key) + " кг " + TypeOfCoffee.calcPrice(key, coffee.get(key)) + " руб\n");
			}
		}
	}

	private void get(Double a) {
		for (TypeOfCoffee key : coffee.keySet()) {
			if (TypeOfCoffee.calcPrice(key, coffee.get(key)).equals(a)) {
				TypeOfCoffee.name(key);
				System.out.print(
						" " + coffee.get(key) + " кг " + TypeOfCoffee.calcPrice(key, coffee.get(key)) + " руб\n");
			}
		}
	}

	public void sortByPrice() {
		Double[] priceArray = new Double[coffee.size()];
		int a = 0;
		for (TypeOfCoffee key : coffee.keySet()) {
			priceArray[a] = TypeOfCoffee.calcPrice(key, coffee.get(key));
			a++;
		}

		for (int i = priceArray.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (priceArray[j] > priceArray[j + 1]) {
					Double temp = priceArray[j];
					priceArray[j] = priceArray[j + 1];
					priceArray[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < priceArray.length; i++) {
			get(priceArray[i]);
		}
	}

	public void print() {
		System.out.println("-------------------------------------");
		System.out.println("Грузоподъемность фургона " + liftingCapacity + " кг");
		int count = 1;
		Double temp = 0.0;
		Double price = 0.0;
		for (TypeOfCoffee key : coffee.keySet()) {
			System.out.print(count++ + ") ");
			TypeOfCoffee.name(key);
			System.out.print(": " + coffee.get(key) + " кг, ");
			price += TypeOfCoffee.calcPrice(key, coffee.get(key));
			System.out.println(TypeOfCoffee.calcPrice(key, coffee.get(key)) + " руб.");
		}
		for (Double value : coffee.values()) {
			temp += value;
		}
		System.out.println("Итого: вес " + temp + ", цена " + price);
		System.out.println("-------------------------------------");
	}

	public HashMap<TypeOfCoffee, Double> getCoffee() {
		return coffee;
	}

	public void setCoffee(HashMap<TypeOfCoffee, Double> coffee) {
		this.coffee = coffee;
	}

	public int getLiftingCapacity() {
		return liftingCapacity;
	}

	public void setLiftingCapacity(int liftingCapacity) {
		this.liftingCapacity = liftingCapacity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Van ");
		builder.append(coffee);
		return builder.toString();
	}

}
