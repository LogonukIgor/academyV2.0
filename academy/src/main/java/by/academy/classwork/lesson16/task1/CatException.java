package by.academy.classwork.lesson16.task1;

public class CatException extends Exception {

	public CatException(String massage) {
		super(massage);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CatException []");
		return builder.toString();
	}

}
