package mat25;

public class Movie {
	private String name;
	private String ratingMPAA;

	// create setters and getters for the above two instance variables
	/* your code goes here */

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public String getRating() {
		return ratingMPAA;
	}

	public void setRating(String aRatingMPAA) {
		ratingMPAA = aRatingMPAA;
	}

	public int getNumRated1() {
		return numRated1;
	}

	public void setNumRated1(int aNumRated1) {
		numRated1 = aNumRated1;
	}

	public int getNumRated2() {
		return numRated2;
	}

	public void setNumRated2(int aNumRated2) {
		numRated2 = aNumRated2;
	}

	public int getNumRated3() {
		return numRated3;
	}

	public void setNumRated3(int aNumRated3) {
		numRated3 = aNumRated3;
	}

	public int getNumRated4() {
		return numRated4;
	}

	public void setNumRated4(int aNumRated4) {
		numRated4 = aNumRated4;
	}

	public int getNumRated5() {
		return numRated5;
	}

	public void setNumRated5(int aNumRated5) {
		numRated5 = aNumRated5;
	}

	private int numRated1 = 0, numRated2 = 0, numRated3 = 0, numRated4 = 0, numRated5 = 0;

	public void addRating(int num) {
		switch(num){
		case 1: numRated1++;break;
		case 2: numRated2++;break;
		case 3: numRated3++;break;
		case 4: numRated4++;break;
		case 5: numRated5++;break;
		
		}
		/* your code goes here */

	}

	public double getAverage() {
		int sum=(numRated1*1)+(numRated2 * 2)+(numRated3 * 3)+(numRated4 * 4)+(numRated5 * 5);
		if(sum>0)
			return sum/5.0;
		else return 0;
		// be careful of integer division in this method!!
		/* your code goes here */

	}

	public static void main(String[] args) {
		// add tests for your Movies here
		/* your code goes here */

		/* DO NOT MODIFY THE LINES BELOW THIS COMMENT */

		Movie m1 = new Movie();
		m1.setName("The Adjustment Bureau");
		m1.setRating("PG-13");
		m1.addRating(5);
		m1.addRating(5);
		m1.addRating(4);
		m1.addRating(4);
		m1.addRating(5);
		System.out.println(m1.getName() + "," + m1.getRating() + " Average rating: " + m1.getAverage());

		Movie m2 = new Movie();
		m2.setName("I Am Number Four");
		m2.setRating("PG-13");
		m2.addRating(3);
		m2.addRating(2);
		m2.addRating(2);
		m2.addRating(4);
		m2.addRating(1);
		System.out.println(m2.getName() + "," + m2.getRating() + " Average rating: " + m2.getAverage());
	}
}
