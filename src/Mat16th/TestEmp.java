package Mat16th;

class Employee {
	private String ssn;
	private String name;
	private String position;
	private double salary;
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String aSsn) {
		ssn = aSsn;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String aPosition) {
		position = aPosition;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double aSalary) {
		salary = aSalary;
	}
	// constructor which takes 4 args and assign the values
	public Employee(String aSsn, String aName, String aPosition, double aSalary) {
		super();
		ssn = aSsn;
		name = aName;
		position = aPosition;
		salary = aSalary;
	}
	public void printE() {
		System.out.println("ssn : " + ssn + ", name : " + name + ", position : " + position + ", salary : " + salary);
	}

	// increase the salary by given %
	void raise(double percentage){
		salary += salary*(percentage/100);
	}
	// increase salary by given amount
	void raise(int amount){
		salary += amount;
	}
	// increase salary by 500$
	void raise(){
		salary += 500;
	}


}

public class TestEmp{
	public static void main(String[] args) {
		Employee e = new Employee("123", "Test", "Senior Software engineer", 1000);
		e.printE();
		e.raise(10.0);
		e.printE();
		e.raise(1000);
		e.printE();
		e.raise();
		e.printE();
		
		
	}
}