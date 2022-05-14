package by.academy.homework.hw6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) {

		User u1 = new User("Wilfrid", "Clarke", 20);
		User u2 = new User("Samuel", "McBride", 16);
		User u3 = new User("Raymond", "Atkinson", 17);
		User u4 = new User("Robert", "Garrison", 18);
		User u5 = new User("Wesley", "Nicholson", 20);
		User u6 = new User("Robert", "Foster", 21);
		User u7 = new User("Roy", "Paul", 14);
		User u8 = new User("Michael", "Daniel", 35);
		User u9 = new User("Gervais", "Boyd", 47);
		User u10 = new User("Frank", "Hodge", 80);

		ArrayList<User> userList = new ArrayList<>();

		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
		userList.add(u6);
		userList.add(u7);
		userList.add(u8);
		userList.add(u9);
		userList.add(u10);

		for (int i = 1; i <= userList.size(); i++) {
			String str = "src\\main\\java\\by\\academy\\homework\\hw6\\users\\user" + i + ".txt";
			try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(str));
					ObjectOutputStream oos = new ObjectOutputStream(bos);) {
				oos.writeObject(userList.get(i - 1));
			} catch (IOException e) {
				e.getMessage();
			}
		}

		for (int i = 1; i <= 10; i++) {
			String str = "src\\main\\java\\by\\academy\\homework\\hw6\\users\\user" + i + ".txt";
			try (BufferedInputStream br = new BufferedInputStream(new FileInputStream(str));
					ObjectInputStream isu = new ObjectInputStream(br);) {
				User user = (User) isu.readObject();
				System.out.println(user);
			} catch (IOException | ClassNotFoundException e) {
				e.getMessage();
			}
		}
	}
}
