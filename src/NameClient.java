
class Name {
	private String firstName;
	private char middleInitial;
	private String lastName;

	public Name(String aFirstName, char aMiddleInitial, String aLastName) {
		super();
		firstName = aFirstName;
		middleInitial = aMiddleInitial;
		lastName = aLastName;
	}

	public void setName(String newFirst, char newInitial, String newLast) {
		this.firstName = newFirst;
		this.middleInitial = newInitial;
		this.lastName = newLast;
	}

	public String getFirst() {
		return firstName;
	}

	public String getLast() {
		return lastName;
	}
	public char getInitial(){
		return middleInitial;
	}
	public String toString(){
		return firstName+" "+middleInitial+" "+lastName;
	}
	public String reverseName(){
		return lastName+" "+firstName+" "+middleInitial;
	}
	public boolean equals(Name obj){
		return obj.firstName.equals(this.firstName) && obj.middleInitial==this.middleInitial && obj.lastName.equals(this.lastName);
	}
}
public class NameClient{
	public static void main(String[] args) {
		Name name = new  Name("Uday Kumar ", 'T', "Reddy");
		Name name1 = new  Name("Keerthi ", 'T', "Reddy");
		
		System.out.println("First Name : "+name.getFirst());
		System.out.println("Initial : "+name.getInitial());
		System.out.println("Last Name :  "+name.getLast());
		System.out.println("Full Name : "+name);
		System.out.println("Reverse Name : "+name.reverseName());
		System.out.println(name+" Equals "+name1+""+name1.equals(name));
	}
}