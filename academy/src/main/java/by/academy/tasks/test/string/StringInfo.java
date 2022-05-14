package by.academy.tasks.test.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringInfo {

	private String[] str1;

	public StringInfo() {
		super();
		System.out.println("введите стоку:");
		this.str1 = SCANNER.nextLine().split(" ");
	}

	public StringInfo(String[] str1) {
		super();
		this.str1 = str1;
	}

	public static final Scanner SCANNER = new Scanner(System.in);

	public String decrease() {
		for (int i = str1.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (str1[j].length() < str1[j + 1].length()) {
					String temp = str1[j];
					str1[j] = str1[j + 1];
					str1[j + 1] = temp;
				}
			}
		}
		String s = Arrays.toString(str1);
		return s;
	}

	public static String decrease(String str1) {
		String[] str2 = str1.split(" ");
		for (int i = str2.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (str2[j].length() < str2[j + 1].length()) {
					String temp = str2[j];
					str2[j] = str2[j + 1];
					str2[j + 1] = temp;
				}
			}
		}
		String s = Arrays.toString(str2);
		return s;
	}

	public String increase() {
		for (int i = str1.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (str1[j].length() > str1[j + 1].length()) {
					String temp = str1[j];
					str1[j] = str1[j + 1];
					str1[j + 1] = temp;
				}
			}
		}
		String s = Arrays.toString(str1);
		return s;
	}

	public static String increase(String str1) {
		String[] str2 = str1.split(" ");
		for (int i = str2.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (str2[j].length() > str2[j + 1].length()) {
					String temp = str2[j];
					str2[j] = str2[j + 1];
					str2[j + 1] = temp;
				}
			}
		}
		String s = Arrays.toString(str2);
		return s;
	}

	public StringBuilder longerthanAverage() {
		StringBuilder strBuild = new StringBuilder();
		int[] arrInt = new int[str1.length];
		for (int i = 0; i < str1.length; i++) {
			char[] arrChar = str1[i].toCharArray();
			int lengthNum = arrChar.length;
			arrInt[i] = lengthNum;
		}
		double average = 0;
		for (int a : arrInt) {
			average += a;
		}
		average /= str1.length;

		strBuild.append("Строки длинее среднего: ");
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] >= average) {
				strBuild.append("<" + str1[i] + ">");
			}
		}
		return strBuild;
	}

	public static StringBuilder longerthanAverage(String str1) {
		String[] str2 = str1.split(" ");
		StringBuilder strBuild = new StringBuilder();
		int[] arrInt = new int[str2.length];
		for (int i = 0; i < str2.length; i++) {
			char[] arrChar = str2[i].toCharArray();
			int lengthNum = arrChar.length;
			arrInt[i] = lengthNum;
		}
		double average = 0;
		for (int a : arrInt) {
			average += a;
		}
		average /= str2.length;

		strBuild.append("Строки длинее среднего: ");
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] >= average) {
				strBuild.append("<" + str2[i] + ">");
			}
		}
		return strBuild;
	}

	public StringBuilder maxLine() {
		StringBuilder strBuild = new StringBuilder();
		int[] arrInt = new int[str1.length];
		for (int i = 0; i < str1.length; i++) {
			char[] arrChar = str1[i].toCharArray();
			int lengthNum = arrChar.length;
			arrInt[i] = lengthNum;
		}
		int indexOfBiggest = 0;
		int min = Integer.MIN_VALUE;
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] > min) {
				min = arrInt[i];
				indexOfBiggest = i;
			}
		}
		strBuild.append("Максимальное слово из строки: <");
		strBuild.append(str1[indexOfBiggest]);
		strBuild.append(">. Количество символов:");
		strBuild.append(min);
		return strBuild;
	}

	public static StringBuilder maxLine(String str1) {
		String[] str2 = str1.split(" ");
		StringBuilder strBuild = new StringBuilder();
		int[] arrInt = new int[str2.length];
		for (int i = 0; i < str2.length; i++) {
			char[] arrChar = str2[i].toCharArray();
			int lengthNum = arrChar.length;
			arrInt[i] = lengthNum;
		}
		int indexOfBiggest = 0;
		int min = Integer.MIN_VALUE;
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] > min) {
				min = arrInt[i];
				indexOfBiggest = i;
			}
		}
		strBuild.append("Максимальное слово из строки: <");
		strBuild.append(str2[indexOfBiggest]);
		strBuild.append(">. Количество символов:");
		strBuild.append(min);
		return strBuild;
	}

	public StringBuilder minLine() {
		StringBuilder strBuild = new StringBuilder();
		int[] arrInt = new int[str1.length];
		for (int i = 0; i < str1.length; i++) {
			char[] arrChar = str1[i].toCharArray();
			int lengthNum = arrChar.length;
			arrInt[i] = lengthNum;
		}
		int indexOfMin = 0;
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] < max) {
				max = arrInt[i];
				indexOfMin = i;
			}
		}
		strBuild.append("Минимальное слово из строки: <");
		strBuild.append(str1[indexOfMin]);
		strBuild.append(">. Количество символов:");
		strBuild.append(max);
		return strBuild;
	}

	public static StringBuilder minLine(String str1) {
		String[] str2 = str1.split(" ");
		StringBuilder strBuild = new StringBuilder();
		int[] arrInt = new int[str2.length];
		for (int i = 0; i < str2.length; i++) {
			char[] arrChar = str2[i].toCharArray();
			int lengthNum = arrChar.length;
			arrInt[i] = lengthNum;
		}
		int indexOfMin = 0;
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] < max) {
				max = arrInt[i];
				indexOfMin = i;
			}
		}
		strBuild.append("Минимальное слово из строки: <");
		strBuild.append(str2[indexOfMin]);
		strBuild.append(">. Количество символов:");
		strBuild.append(max);
		return strBuild;
	}

	public String[] getStr1() {
		return str1;
	}

	public void setStr1(String[] str1) {
		this.str1 = str1;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("String1 [str1=");
		builder.append(str1);
		builder.append("]");
		return builder.toString();
	}

}
