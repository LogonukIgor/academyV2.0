package by.academy.tasks.oop.matrix;

public class MatrixTest {
	
	public static void main(String[] args) {
		
		Matrix m1 = new Matrix(2,2);
		Matrix m2 = new Matrix(2,2);
		
		System.out.println("Матрица 1:");
		m1.printMatrix();
		System.out.println();
		System.out.println("Матрица 2:");
		m2.printMatrix();
		System.out.println();
		
		System.out.println("Сложение матриц:");
		
		double[][] c = m1.sumMatrix(m2);
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.printf("%.2f", c[i][j]);
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Умножение матрицы на число:");
		
		double[][] d = m1.mulNum(2);
		
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.printf("%.2f", d[i][j]);
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
