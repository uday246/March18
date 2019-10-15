package H7;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

class Name {
	public Name(String last, String first) {

		this.last = last;

		this.first = first;

	}

	public Name(String first) {
		this("", first);
	}

	public String getFormal() {
		return first + " " + last;
	}

	public String getOfficial() {
		return last + ", " + first;
	}

	public boolean equals(Name other) {
		return first.equals(other.first) && last.equals(other.last);
	}

	public String toString() {
		return first + " " + last;
	}

	public static Name read(Scanner scanner) {

		if (!scanner.hasNext())
			return null;

		String last = scanner.next();

		String first = scanner.next();

		return new Name(last, first);

	}

	public String getInitials() {

		return Character.toUpperCase(first.charAt(0)) + "." + Character.toUpperCase(last.charAt(0)) + ".";

	}

	private String first, last;

	public static void main(String[] args) throws Exception {

		// give the name file path
		Scanner scanner = new Scanner(new File("C:\\Users\\teegu\\Desktop\\names.txt"));

		int count = 0;

		Name name = read(scanner);
		HashSet<String> set = new HashSet<String>();
		// storing the names in the hashset so that we can check for the duplicates
		while (name != null) {
			// if set doesnot contains the name than only we are printing
			if(!set.contains(name.getFormal())){
				set.add(name.getFormal());
				System.out.println("name: " + name);

				System.out.println("formal: " + name.getFormal());

				System.out.println("official: " + name.getOfficial());

				System.out.println("initials: " + name.getInitials());
				
				System.out.println();
				count++;
			}
			//if it contains than we are printing the required message
			else{
				System.out.println("Duplicate name "+name.getFormal()+" discovered");
			}
			
			
			

			name = read(scanner);

		}

		System.out.println("---");

		System.out.println(count + " names processed.");

	}
}