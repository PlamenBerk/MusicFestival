package musicFestival;

public class Group {
	private String name;
	public Vocal[] vocalsInGroup;
	public Musicplayer[] musicplayers;
	public Song[] songs;

	public Group(String name, int numOfVocals, int numOfSongs) {
		this.setName(name);
		vocalsInGroup = new Vocal[numOfVocals];
		songs = new Song[numOfSongs];
	}

	public Group(int numOfMusicplayers, String name, int numOfSongs) {
		this.setName(name);
		musicplayers = new Musicplayer[numOfMusicplayers];
		songs = new Song[numOfSongs];
	}

	public Group(String name, int numOfVocals, int numOfSongs, int numOfMusicplayers) {
		this.setName(name);
		vocalsInGroup = new Vocal[numOfVocals];
		songs = new Song[numOfSongs];
		musicplayers = new Musicplayer[numOfMusicplayers];
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name.matches("[a-zA-Z0-9 ]+")) {
			this.name = name;
		} else {
			System.out.println("Invalid group name!");
		}
	}

}
