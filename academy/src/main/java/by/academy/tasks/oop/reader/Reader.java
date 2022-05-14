package by.academy.tasks.oop.reader;

public class Reader {

	protected String fullName;
	protected long ticket;
	protected String faculty;
	protected String dateBirth;
	protected long telNumber;

	public Reader() {
		super();
	}

	public Reader(String fullName) {
		super();
		this.fullName = fullName;
	}

	public Reader(String fullName, long ticket, String faculty, String dateBirth, long telNumber) {
		super();
		this.fullName = fullName;
		this.ticket = ticket;
		this.faculty = faculty;
		this.dateBirth = dateBirth;
		this.telNumber = telNumber;
	}

	public void takeBook(int numBook) {
		System.out.println(fullName + " взял " + numBook + " book.");
	}

	public void takeBook(String... strings) {
		System.out.print(fullName + " взял:");
		for (String s : strings) {
			System.out.print(" " + s + " ");
		}
		System.out.println();
	}

	public void takeBook(Book... a) {
		System.out.print(fullName + " взял: ");
		for (int i = 0; i < a.length; i++) {
			if(i<a.length-1) {
				System.out.print(a[i].getBookName() + ", ");
			}else if(i==a.length-1) {
				System.out.print(a[i].getBookName()+".");
			}
		}
	}

	public void returnBook(int numBook) {
		System.out.println(fullName + " вурнул " + numBook + " book.");
	}

	public void returnBook(String... strings) {
		System.out.print(fullName + " вурнул:");
		for (String s : strings) {
			System.out.print(" " + s + " ");
		}
		System.out.println();
	}

	public void returnBook(Book... a) {
		System.out.print(fullName + " вернул:");
		for (int i = 0; i < a.length; i++) {
			if(i<a.length-1) {
				System.out.print(a[i].getBookName() + ", ");
			}else if(i==a.length-1) {
				System.out.print(a[i].getBookName()+".");
			}
		}
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getTicket() {
		return ticket;
	}

	public void setTicket(long ticket) {
		this.ticket = ticket;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}

	public long getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(long telNumber) {
		this.telNumber = telNumber;
	}

}
