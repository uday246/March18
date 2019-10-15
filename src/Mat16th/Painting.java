package Mat16th;

public class Painting {
	private String artist, title;
	private int year;

	public Painting(String aArtist, String aTitle, int aYear) {
		super();
		artist = aArtist;
		title = aTitle;
		year = aYear;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String aArtist) {
		artist = aArtist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String aTitle) {
		title = aTitle;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int aYear) {
		year = aYear;
	}

	public boolean sameArtistYear(Painting p) {
		return p.year == this.year;
	}
}
