package musicFestival;

public class Musicplayer {
	private String name;
	private int age;
	private String musicInstrument;

	public Musicplayer(String name, int age, String musicInstrument) {
		this.setName(name);
		this.setAge(age);
		this.setMusicInstrument(musicInstrument);
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getMusicInstrument() {
		return this.musicInstrument;
	}

	public void setName(String name) {
		if (name.matches("[a-zA-Z ]+")) {
			this.name = name;
		} else {
			System.out.println("Invalid name!");
		}
	}

	public void setAge(int age) {
		if (age > 2) {
			this.age = age;
		} else {
			System.out.println("Too young musicplayer");
		}
	}

	public void setMusicInstrument(String musicInstrument) {
		if (musicInstrument.matches("[a-zA-Z ]+")) {
			this.musicInstrument = musicInstrument;
		} else {
			System.out.println("Invalid music instrument");
		}
	}
}
