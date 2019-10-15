package Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContactList {
	List<Contact>contacts;
	public ContactList(){
		contacts = new ArrayList<Contact>();
	}
	// creates contact object and add to the contacts
	public void addContact(String firstName , String lastName, String number){
		Contact c = new Contact(firstName, lastName, number);
		contacts.add(c);
	}
	// sort the list and return as string
	public String toString(){
		Collections.sort(contacts, new Comparator<Contact>() {

			@Override
			public int compare(Contact c1, Contact c2) {
				return c1.toString().compareTo(c2.toString());
			}
		});
		return contacts.toString();
	}
	// search the contact based on the given string
	public String searchContacts(String searchString){
		for(Contact temp:contacts){
			if(temp.toString().contains(searchString)){
				return temp.toString();
			}
		}
		return "";
	}
	public static void main(String[] args) {
		ContactList l = new ContactList();
		l.addContact("DDDD", "DDD", "123123");
		l.addContact("BBB", "BBB", "123123");
		l.addContact("AAAA", "AAAA", "98213");
		// testing toString
		System.out.println(l.toString());
		// testing searchContact
		System.out.println(l.searchContacts("AAAA"));
	}
}
class Contact{
	private String firstName;
	private String lastName;
	private String number;
	public Contact(String aFirstName, String aLastName, String aNumber) {
		super();
		firstName = aFirstName;
		lastName = aLastName;
		number = aNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String aFirstName) {
		firstName = aFirstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String aLastName) {
		lastName = aLastName;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String aNumber) {
		number = aNumber;
	}
	

	public String toString(){
		return getFirstName()+" "+getLastName()+" : "+getNumber();
	}
}