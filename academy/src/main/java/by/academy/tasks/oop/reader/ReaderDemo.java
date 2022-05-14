package by.academy.tasks.oop.reader;

public class ReaderDemo {

	public static void main(String[] args) {
		Book b1 = new Book("John","Big Lake");
		Book b2 = new Book("Billy","Storm");
		
		Reader r1 = new Reader("Логонюк И.И.");
		
		r1.takeBook(b1,b2);
	}
}
