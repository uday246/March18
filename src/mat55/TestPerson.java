package mat55;
class Person{
	private String firstName;
	private String lastName;
	private int age;
	private double weight;
	//constructor to initialize the values
	
	public Person(String aFirstName, String aLastName, int aAge, double aWeight) {
		super();
		firstName = aFirstName;
		lastName = aLastName;
		age = aAge;
		weight = aWeight;
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
	public int getAge() {
		return age;
	}
	public void setAge(int aAge) {
		age = aAge;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double aWeight) {
		weight = aWeight;
	}
	
	// toString to return the details of the object
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", weight=" + weight;
	}
	
	
}
public class TestPerson {
public static void main(String[] args) {
	// creating person object
	Person p1 = new Person("Uday", "Kumar", 25, 83);
	Person p2 = new Person("Induri", "Koti", 25, 53);
	System.out.println(p1);
	System.out.println(p2);
	
	
}
}
