package mat25;

public class Book {
private String title;
private String author;
private String ISBN;
private int yearPublished;
public String getTitle() {
	return title;
}
public void setTitle(String aTitle) {
	title = aTitle;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String aAuthor) {
	author = aAuthor;
}
public String getISBN() {
	return ISBN;
}
public void setISBN(String aISBN) {
	ISBN = aISBN;
}
public int getYearPublished() {
	return yearPublished;
}
public void setYearPublished(int aYearPublished) {
	yearPublished = aYearPublished;
}
public static void main(String[] args) {
	
	String exp="[A-Za-z_$][a-z0-9$_]*";
	// [A_Za-z_$] means can start with a-zA-z or _ or $
	// [a-z0-9$_]* means can contain any letters of a-z0-9_$
	System.out.println("Test".matches(exp)); // true
	System.out.println("2a1b".matches(exp)); // false
	System.out.println("_test".matches(exp)); // true
	System.out.println("$a1b".matches(exp)); // true
	System.out.println("#sdf".matches(exp)); // false

}
private static String makeCat() {
	return "Cat";
}
}

