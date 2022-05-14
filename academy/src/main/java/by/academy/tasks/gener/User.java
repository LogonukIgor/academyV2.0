package by.academy.tasks.gener;

public class User {

	private String login;
	private String password;

	public User() {
		super();
	}

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public class Query {
		public void printToLog() {
			System.out.println("Пользователь с логином: " + login+" и паролем " +password+" отправил запрос.");
		}
	}
	
	public void createQuery() {
		Query q1 = new Query();
		q1.printToLog();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [login=");
		builder.append(login);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

}
