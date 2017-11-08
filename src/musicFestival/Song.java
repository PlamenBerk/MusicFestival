package musicFestival;

public class Song {
	private String title;
	private String text;

	public Song(String title, String text) {
		this.setText(text);
		this.setTitle(title);
	}

	public String getTitle() {
		return this.title;
	}

	public String getText() {
		return this.text;
	}

	public void setTitle(String title) {
		if (title.matches("[a-zA-Z0-9 ]+")) {
			this.title = title;
		} else {
			System.out.println("Invalid title!");
		}
	}

	public void setText(String text) {
		if (text.matches("[a-zA-Z0-9 ]+")) {
			this.text = text;
		} else {
			System.out.println("Invalid text!");
		}
	}

}
