package by.academy.tasks.gener.calc;

public class Сalculator<T extends Number> {

	public static double sum(Number a,Number b) {
		double aTemp = a.doubleValue();
		double bTemp = b.doubleValue();
		aTemp += bTemp;
		return aTemp;
	}
	
	public static double subtraction(Number a,Number b) {
		double aTemp = a.doubleValue();
		double bTemp = b.doubleValue();
		aTemp -= bTemp;
		return aTemp;
	}
	
	public static double multiply(Number a,Number b) {
		double aTemp = a.doubleValue();
		double bTemp = b.doubleValue();
		aTemp *= bTemp;
		return aTemp;
	}
	
	public static double divide(Number a,Number b) {
		double aTemp = a.doubleValue();
		double bTemp = b.doubleValue();
		aTemp /= bTemp;
		return aTemp;
	}
}
