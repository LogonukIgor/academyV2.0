package by.academy.classwork.examination.classwork;

public interface Mouse {
	
	String COLOR = "red";

	void clickRight();
	
	void clickLeft();
	
	void scrollUp();
	
	void scrollDown();
	
	default void eatCheese() {
		System.out.println("Я ем сыр");
	}
}
