package by.academy.classwork.lesson9;

public class Shop {

	public static void main(String[] args) {

		User buyer = new User(20, "Alex", 100);
		User seller = new User(21, "Igor", 0);
		Product[] products = new Product[4];

		Product milk = new Milk(2.5, 3, "A", "white");
		Product bread = new Bread(2, 1, "B", "brown");
		Product cheese = new Cheese(5, 2, "C", "yellow");
		Product butter = new Butter(3, 1, "D", "yellow");
		
		Deal deal = new Deal("12:16 Mondey", "Minsk", buyer, seller, products);

		deal.addProduct(milk);
		deal.addProduct(bread);
		deal.addProduct(cheese);
		deal.addProduct(butter);
		System.out.println(deal);
		
		deal.removeProduct(1);
		System.out.println(deal);
	}
}
