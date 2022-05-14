package by.academy.tasks.oop.matrix;

import java.util.Arrays;
import java.util.Random;

public class Matrix {

	protected double[][] array;
	protected int line;
	protected int column;

	public Matrix() {
		super();
	}

	public Matrix(int line, int column) {
		super();
		this.line = line;
		this.column = column;
		Random random = new Random();
		double[][] array = new double[line][column];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextDouble(11.0);
			}
		}
		this.array = array;
	}

	public void printMatrix() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%.2f", array[i][j]);
				System.out.print("  ");
			}
			System.out.println();
		}
	}

	public double[][] sumMatrix(Matrix a) {
		double[][] c = new double[line][column];
		if (a.array.length == array.length) {
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[i].length; j++) {
					c[i][j] = a.array[i][j]+array[i][j];
				}
			}
		} 
		return c;
	}

	public double[][] mulNum(double a){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] *= a;
			}
		}
		return array;
	}
	
	public double[][] mulMatrix(Matrix a) {
		double[][] c = new double[a.line][a.column];
		if (line == a.column) {
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[i].length; j++) {
					c[i][j] = a.array[i][j]+array[i][j];
				}
			}
		}
		return c;
	}
	
	public double[][] getArray() {
		return array;
	}

	public void setArray(double[][] array) {
		this.array = array;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Matrix [array=");
		builder.append(Arrays.toString(array));
		builder.append(", line=");
		builder.append(line);
		builder.append(", column=");
		builder.append(column);
		builder.append("]");
		return builder.toString();
	}

}
