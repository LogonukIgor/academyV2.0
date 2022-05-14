package by.academy.classwork.lesson10;

public class Magazine implements Printable {

	@Override
	public void print() {
		System.out.println("журнал");
	}

	public static void printMagazine(Printable[] printable) {
		for(Printable printables: printable) {
			if(printables instanceof Magazine) {
				printables.print();
				System.out.println("sxsxs");
			}
		}
	}
}
