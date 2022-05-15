package by.academy.classwork.thread.tasks.task4;

public class Task4 extends Thread {

	private StringBuilder str;
	private int num;

	public Task4(StringBuilder str) {
		this.str = str;
	}

	@Override
	public void run() {
		print();
		add();
	}

	public synchronized void print() {
		for (int i = 0; i < 100; i++) {
			System.out.print(str);
		}
		System.out.println();
	}

	public synchronized void add() {
		num++;
	}

	public StringBuilder getStr() {
		return str;
	}

	public void setStr(StringBuilder str) {
		this.str = str;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
