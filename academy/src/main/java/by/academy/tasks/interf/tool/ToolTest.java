package by.academy.tasks.interf.tool;

public class ToolTest {

	public static void main(String[] args) {
		Tool t1 = new Guitar(4);
		Tool t2 = new Drum(58);
		Tool t3 = new Pipe(3.2);

		Tool[] array = new Tool[3];
		array[0] = t1;
		array[1] = t2;
		array[2] = t3;
		
		for(Tool a:array) {
			a.play();
		}
	}
}
