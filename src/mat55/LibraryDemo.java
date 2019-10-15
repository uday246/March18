package mat55;

abstract class LibraryItem
{
// None of the variables can be public
private String name;
private String type;
private int loan_period;
private int serial_number;

public LibraryItem(String name_, String type_)
{
this.name = name_;
this.type = type_;
}

public abstract int getLoanPeriod(); // do not change this line
  
public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public int getLoan_period() {
return loan_period;
}

public void setLoan_period(int loan_period) {
this.loan_period = loan_period;
}

public int getSerial_number() {
return serial_number;
}

public void setSerial_number(int serial_number) {
this.serial_number = serial_number;
}

}

/**
* Book should be a subclass of LibraryItem
*
* A book should have a loan_period of 30 days.
*/
 class Book extends LibraryItem {

public Book(String name_, String type_) {
super(name_,type_);
}


@Override
public int getLoanPeriod() {
return 30;
}

@Override
public String toString() {
return "Book [getLoanPeriod()=" + getLoanPeriod() + ", getName()=" + getName() + ", getType()=" + getType()
+ ", getLoan_period()=" + getLoan_period() + ", getSerial_number()=" + getSerial_number()
+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
+ "]";
}
}


class Movie extends LibraryItem{
  
public Movie(String name_, String type_) {
super(name_, type_);
}

@Override
public String toString() {
return "Movie [getLoanPeriod()=" + getLoanPeriod() + ", getName()=" + getName() + ", getType()=" + getType()
+ ", getLoan_period()=" + getLoan_period() + ", getSerial_number()=" + getSerial_number()
+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
+ "]";
}

@Override
public int getLoanPeriod() {
return 7;
}
}


/**
* Novel is a subclass of Book
* A Novel should have a loan_period of 14 days
* A Novel also has a variable of number_of_stars_rating
*/
class Novel
{
private int number_of_stars_rating=0;
private String name;
private int loan_period=14;
public Novel(String name) //this method sets name to the novel
{
this.name=name;
}
void set_star_ratings(int ratings) //this method sets ratings to the novel.
{
number_of_stars_rating=ratings;
}
public String toString() //this method returns name,ratings,loan_period.
{
String k;
k=this.name+" "+ this.number_of_stars_rating+" "+this.loan_period;
return k;
}
}

class LibraryDemo
{
public static void main(String[] args)
{
	LibraryItem[] lib = new LibraryItem[6];
	lib[0] = new Book("Big Java","Technical");
	lib[1] = new Movie("God Father","God");
	Novel h = new Novel("Harry Potter");
	h.set_star_ratings(5);
	//lib[2] = h;

	Novel t = new Novel("To Kill a Mocking Bird");
	t.set_star_ratings(3);
	//lib[3] = t;

	lib[4] = new Movie("The ususal suspects","Thriller");

	lib[5] = new Book("Physics","Education");

	for ( int i = 0; i<lib.length; i++) {
		System.out.println(lib[i].toString());
	}
}
}