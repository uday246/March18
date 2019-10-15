package Mat16th;

abstract class StreamingMedia {
	String title;
	int length;
	public StreamingMedia(String aTitle, int aLength) {
		super();
		title = aTitle;
		length = aLength;
	}
	public StreamingMedia(StreamingMedia media) {
		this.title = media.title;
		this.length = media.length;
	}
	public String getTitle(){
		return title;
	}
	// Using if conditions to decide the category base on the rating it is applicable for both Movie and Song
	// if getCategory() is called by Movie than Movie class getRating() will call, if it called by song than it will the getRating() of Song class

	public char getCategory(){
		int rating = getRating();
		if(rating ==9 || rating==10)
			return 'A';
		else if(rating ==7 || rating==7)
			return 'B';
		else if(rating ==5 || rating==6)
			return 'C';
		else 	if(rating ==3 || rating==4)
			return 'D';
		else
			return 'F';
	}
	public abstract int getRating();

	protected void setLength(int aLength) {
		if(aLength>=1 && aLength<=10)
			length = aLength;
	}
	protected void setTitle(String aTitle) {
		title = aTitle.toUpperCase();
	}
	@Override
	public String toString() {
		return "Title :" + title + ", Length : " + length;
	}

}
class Movie extends StreamingMedia{
	int rating;
	
	public Movie(Movie aMedia) {
		super(aMedia);
	}
	public Movie(String aTitle, int aLength,int rating) {
		// using the super class constructor to assign the values
		super(aTitle, aLength);
		this.rating = rating;
	}

	@Override
	public int getRating() {
		return rating;
	}
	public void setRating(int aRating) {
		if(aRating>=1 && aRating<=10)
			rating = aRating;
	}
	
	public String toString(){
		return super.toString()+" Rating : "+getRating();
		
	}
}

class Song extends StreamingMedia{

	int numberOfLikes;
	
	public int getNumberOfLikes() {
		return numberOfLikes;
	}
	public void addLikes(int aNumberOfLikes) {
		if(aNumberOfLikes>0)
			numberOfLikes = aNumberOfLikes;
	}
	public Song(Song aMedia) {
		//using the super class constructor to assign the values
		super(aMedia);
	}
	public Song(String title,int length) {
		//using the super class constructor to assign the values
		super(title,length);
	}

	public String toString(){
//using the super to Stirng() return the common values
		return super.toString()+" Likes : "+getNumberOfLikes();
		
	}
	@Override
	public int getRating() {
		if(getNumberOfLikes()>=5000)
			return 9;
		else if(getNumberOfLikes()>=500)
			return 7;
		else if(getNumberOfLikes()>=50)
			return 5;
		else if(getNumberOfLikes()>=10)
			return 3;
		else
			return 1;
	}
	
}

public class TestMedia{
	public static void main(String[] args) {
	Song s = new Song("Hello", 5);
	Movie m = new Movie("Dil", 7, 8);
	s.addLikes(10);
	System.out.println(s);
	System.out.println(m);
	
	}
}