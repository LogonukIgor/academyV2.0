package by.academy.tasks.oop.com.company.professions;

public class Driver {

	protected String name;
	protected int experience;

	public Driver() {
		super();
	}

	public Driver(String name, int experience) {
		super();
		this.name = name;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Driver [name=");
		builder.append(name);
		builder.append(", experience=");
		builder.append(experience);
		builder.append("]");
		return builder.toString();
	}

}
