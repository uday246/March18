package Mat16th;

import java.util.Scanner;

class MediaItem {

	String title;

	String format;

	boolean onLoan;

	String loanedTo;

	String dateLoaned;

	MediaItem() { // default constructor

		title = null;

		format = null;

		onLoan = false;

		loanedTo = null;

		dateLoaned = null;

	}

	MediaItem(String title, String format) { // constructor

		onLoan = false;

		this.title = title;

		this.format = format;

	}

	public String getTitle() { // getters and setters are here

		return title;

	}

	public void setTitle(String title) {

		this.title = title;

	}

	public String getFormat() {

		return format;

	}

	public void setFormat(String format) {

		this.format = format;

	}

	public boolean isOnLoan() {

		return onLoan;

	}

	public void setOnLoan(boolean onLoan) {

		this.onLoan = onLoan;

	}

	public String getLoanedTo() {

		return loanedTo;

	}

	public void setLoanedTo(String loanedTo) {

		this.loanedTo = loanedTo;

	}

	public String getDateLoaned() {

		return dateLoaned;

	}

	public void setDateLoaned(String dateLoaned) {

		this.dateLoaned = dateLoaned;

	}

	void markOnLoan(String name, String date) { // methods

		if (onLoan == true)

			System.out.println(this.title + " is already loaned out");

		else {

			onLoan = true;

			loanedTo = name;

			dateLoaned = date;

		}

	}

	void markReturned() {

		if (onLoan == false)

			System.out.println(this.title + " is not currently loaned out");

		onLoan = false;

	}

}


class Library {

	static Scanner in = new Scanner(System.in);

	MediaItem t = new MediaItem();

	MediaItem[] items = new MediaItem[100];

	String[] str = new String[100];

	int numberOfItems = 0; // fields

	int check = 0;

	int called = 0;

	int displayMenu() { // methods

		System.out.println(
				"1. Add new item \n2. Mark an item as on loan \n3. List all items \n4. Mark an item as returned \n5. Quit");

		System.out.print("\nWhat would you like to do? ");

		int a = in.nextInt();

		System.out.println("\n");

		return a;

	}

	void addNewItem(String title, String format) {

		MediaItem item = new MediaItem(title, format);

		items[numberOfItems] = item;

		numberOfItems++;

	}

	void markItemOnLoan(String title, String name, String date) {

		for (int b = 0; b < numberOfItems; b++) {

			if (title.equals(items[b].title)) {

				items[b].markOnLoan(name, date);

				called = 1;

			}

		}

		if (called == 0)

			System.out.println(title + " is not part of your existing Library. \n");

		called = 0;

	}

	void listAllItems() {

		for (int c = 0; c < numberOfItems; c++) {

			if (items[c].onLoan)

				str[c] = "\n" + items[c].title + " " + items[c].format + " loaned to " + items[c].loanedTo + " on "
						+ items[c].dateLoaned;

			else

				str[c] = "\n" + items[c].title + " " + items[c].format;

			System.out.println(str[c] + "\n");

		}

	}

	void markItemReturned(String title){

		for(int b = 0; b < numberOfItems; b++){

			if(title.equals(items[b].title)){

				items[b].markReturned();

				check = 1;

			}   

		}

		if(check == 0)

			System.out.println("Sorry, I couldn't find " + title + " in the library.");

		check = 0;

	}
	// finds whether the given title exists or not
	boolean isItemExist(String title) {
		boolean res=false;
		for (int b = 0; b < numberOfItems; b++) {

			if (title.equals(items[b].title)) {

				items[b].markReturned();
				res = true;
			}

		}
		return res;
	}


}
public class MidtermProject {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Library track = new Library();

		MediaItem obj = new MediaItem();

		int choice = 0;

		while (choice != 5) {

			choice = track.displayMenu();

			switch (choice) {

			case 1:
				System.out.print("What is the title you are entering? ");

				obj.title = in.nextLine();

				System.out.print(
						"\n To enter the format correctly; for movies, use DVD, VHS or Blue-Ray. For games, use the platform (Windows, Mac, XBox, etc.) the game runs on.");

				System.out.print("\nWhat is the format? ");

				obj.format = in.nextLine();

				track.addNewItem(obj.title, obj.format);

				System.out.print("\n");

				break;

			case 2:
				System.out.print("Which title are you loaning? ");

				obj.title = in.nextLine();
				// checking whether the item exist before taking further details
				boolean res = track.isItemExist(obj.title);
				if(res){
					System.out.print("Who are you loaning it to? ");

					obj.loanedTo = in.nextLine();

					System.out.print("When did you loan the item? ");

					obj.dateLoaned = in.nextLine();

					track.markItemOnLoan(obj.title, obj.loanedTo, obj.dateLoaned);	
				}
				else{
					System.out.println("Sorry, I couldn't find " + obj.title + " in the library.");
				}


				break;

			case 3:
				track.listAllItems();

				break;

			case 4:
				System.out.println("Which title are you returning? ");

				obj.title = in.nextLine();

				track.markItemReturned(obj.title);
				break;

			case 5:
				System.out.println("Goodbye");

				break;

			default:

				System.out.println("Invalid option. Please select from 1 - 5.");

				System.out.println("\n");

			}

		}

		in.close();

	}

}
