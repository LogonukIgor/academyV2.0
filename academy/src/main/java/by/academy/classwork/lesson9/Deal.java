package by.academy.classwork.lesson9;

import java.util.Arrays;

public class Deal {

	protected String timeDate;
	protected String place;
	protected User buyer;
	protected User seller;
	protected Product[] products;
	protected int index = 0;

	public Deal() {
		super();
	}

	public Deal(String timeDate, String place, User buyer, User seller) {
		super();
		this.timeDate = timeDate;
		this.place = place;
		this.buyer = buyer;
		this.seller = seller;
	}

	public Deal(String timeDate, String place, User buyer, User seller, Product[] products) {
		super();
		this.timeDate = timeDate;
		this.place = place;
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;
	}

	public void addProduct(Product product) {
		if (products == null) {
			index = 0;
			products = new Product[10];
		}
		if (index >= products.length) {
			productsGrow();
		}
		products[index++] = product;
	}

	public void productsGrow() {
		Product[] tempProducts = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempProducts, 0, products.length);
		products = tempProducts;
	}

	public void removeProduct(int removeIndex) {
		if (removeIndex < products.length && removeIndex >= 0) {
			System.arraycopy(products, removeIndex + 1, products, removeIndex, products.length - index - removeIndex);
			products[--index] = null;
		}
	}

	public void deal() {
		if (products == null) {
			System.out.println("В корзине ничего нет)");
			return;
		}
		double fullPrice = 0;
		for (Product p : products) {
			fullPrice += p.getCalculatePrice();
		}
		if (buyer.maney < fullPrice) {
			System.out.println("У Вас недостаточно денег");
			return;
		} else {
			seller.maney += fullPrice;
			buyer.maney -= fullPrice;
		}
	}

	public String getTimeDate() {
		return timeDate;
	}

	public void setTimeDate(String timeDate) {
		this.timeDate = timeDate;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deal [timeDate=");
		builder.append(timeDate);
		builder.append(", place=");
		builder.append(place);
		builder.append(", buyer=");
		builder.append(buyer);
		builder.append(", seller=");
		builder.append(seller);
		builder.append(", products=");
		builder.append(Arrays.toString(products));
		builder.append("]");
		return builder.toString();
	}

}
