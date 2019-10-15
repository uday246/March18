package Mar26th;

public class TestMovie {
public static void main(String[] args) {
	Movie m1 = new Movie("Abc");
	m1.setDescription("Testing Abc");
	m1.setDirector("Smith");
	m1.setYear(2017);
	m1.setRating(4);
	System.out.println(m1);
	Movie m2 = new Movie("Abc");
	m2.setDescription("Testing the movie");
	m2.setDirector("Smith");
	m2.setYear(2017);
	m2.setRating(3);
	System.out.println(m2);
	System.out.println("M1 and M2 are equals : "+m1.equals(m2));
	m2.setName("xyz");
	System.out.println(m2);
	System.out.println("M1 comparing with M2: "+m1.compareTo(m2));
	
}
}

class Movie {
	private String name;
	private int year;
	private String director;
	private String description;
	private int rating;

	public Movie(String aName) {
		super();
		name = aName;
	}

	@Override
	public String toString() {
		return "Name :" + name + ", year :" + year + ", rating : " + rating;
	}
// will comapre the movie objects based on the name 
	public int compareTo(Movie m){
		int res = this.getName().compareTo(m.getName());
		if(res==0)
			return 0;
		else if(res<0)
			return -1;
		return 1;
	}
	// implemented hashcode according to the equal method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + year;
		return result;
	}
	// checking the name and director and year for equality

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year != other.year)
			return false;

		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int aYear) {
		year = aYear;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String aDirector) {
		director = aDirector;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String aDescription) {
		description = aDescription;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int aRating) {
		rating = aRating;
	}

}