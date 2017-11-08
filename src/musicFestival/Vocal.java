package musicFestival;

public class Vocal {
	private String name;
	private int age;

	public Vocal(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		if (name.matches("[a-zA-Z ]+")) {
			this.name = name;
		} else {
			System.out.println("Invalid name!");
		}
	}

	public void setAge(int age) {
		if (age > 3) {
			this.age = age;
		} else {
			System.out.println("Too young vocal!");
		}
	}
}
