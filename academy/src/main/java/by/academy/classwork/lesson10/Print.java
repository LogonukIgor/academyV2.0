package by.academy.classwork.lesson10;

public class Print {
	
	public static void main(String[] args) {
	
	Printable[] printables = new Printable[4];
	
	printables[0] = new Book();
	printables[1] = new Book();
	printables[2] = new Magazine();
	printables[3] = new Magazine();
	
//	for(Printable printable: printables) {
//		printable.print();
//	}
	
	Magazine.printMagazine(printables);
	System.out.println();
	Book.printBook(printables);
	}
}
