package coll.Movies;

 

import java.util.ArrayList;
import java.util.List;

 /*
  * 
  * Save the file name as MovieDriver.java and compile and run the program
  */

class Movie {

private String title;

private int year;

private List<Integer> ratings;

 

// Constructor

public Movie(String title, int year) {
this.title = title;
this.year = year;
ratings = new ArrayList<Integer>();

}

 

// Rate the movie

public void addRating(int rating) {
ratings.add(rating);
// add method will add the rating to the list
 

}

 

// Get the title of the movie

public String title() {

return title;

}

 

// Get the year of the movie

public int year() {

return year;

}

// Get the average rating of the movie

public double rating() {

	double avg = 0;
	// using advanced for loop to iterate through the list of ratings and adding it to the avg variable
	for(int rating:ratings){
		avg+=rating;
	}
	avg = avg/ratings.size();
return avg;

}
}
public class MovieDriver{
	public static void main(String[] args) {
		Movie movie = new Movie("Bahubali", 2015);
		movie.addRating(5);
		movie.addRating(4);
		movie.addRating(3);
		movie.addRating(5);
		System.out.println("Title : "+movie.title());
		System.out.println("Year : "+movie.year());
		System.out.println("Rating : "+movie.rating());
		
	}
}
