package by.academy.tasks.oop.reader;

public class Book {

	protected String authorName;
	protected String bookName;

	public Book() {
		super();
	}

	public Book(String authorName, String bookName) {
		super();
		this.authorName = authorName;
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}
