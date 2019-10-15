import java.util.Scanner;

class Movie{
	private String name;
	private String rating;
	private int numOfTickets;
	public Movie(String aName, String aRating, int aNumOfTickets) {
		super();
		name = aName;
		rating = aRating;
		numOfTickets = aNumOfTickets;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String aRating) {
		rating = aRating;
	}
	public int getNumOfTickets() {
		return numOfTickets;
	}
	public void setNumOfTickets(int aNumOfTickets) {
		numOfTickets = aNumOfTickets;
	}
public String toString(){
	// returns the movie details
	return getName()+" ("+getRating()+") Tickets sold : "+getNumOfTickets();
}
}
public class DriverMovie {
	public static void main(String[] args) {
		char ch='y';
		Scanner sc = new Scanner(System.in);
		String name="";
		String rating="";
		int tickets=0;
		// if user enters than y than ask for another movie
		while(ch=='y' || ch=='Y'){
			System.out.println("Enter the name of movie ");
			name = sc.nextLine();
			System.out.println("Enter the rating of movie ");
			rating = sc.nextLine();
			System.out.println("Enter number of tickets sold for this movie");
			tickets = sc.nextInt();
			// to remove the buffer char (\n) from the buffer
			sc.nextLine();
			Movie m = new Movie(name, rating, tickets);
			System.out.println(m);
			System.out.println("do you want to enter another? (y or n)");
			ch = sc.nextLine().charAt(0);
		}
		sc.close();
	}
}
