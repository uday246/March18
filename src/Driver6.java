import java.util.Scanner;

abstract class Employee {
	private String firstName;
	private String lastName;
	private String empId;
	private String street;
	private String city;
	private String state;

	public Employee() {

	}

	public Employee(String aFirstName, String aLastName, String aEmpId, String aStreet, String aCity, String aState) {
		super();
		firstName = aFirstName;
		lastName = aLastName;
		empId = aEmpId;
		street = aStreet;
		city = aCity;
		state = aState;
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

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String aEmpId) {
		empId = aEmpId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String aStreet) {
		street = aStreet;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String aCity) {
		city = aCity;
	}

	public String getState() {
		return state;
	}

	public void setState(String aState) {
		state = aState;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empId=" + empId + ", street=" + street
				+ ", city=" + city + ", state=" + state + "]";
	}

	public abstract double earnings(); // no implementation here

} // end abstract class Employee

// HourlyEmployee.java

// HourlyEmployee class extends Employee.

class HourlyEmployee extends Employee

{

	private double wage; // wage per hour

	private double hours; // hours worked for week

	public HourlyEmployee(String aFirstName, String aLastName, String aEmpId, String aStreet, String aCity,
			String aState, double aWage, double aHours) {
		super(aFirstName, aLastName, aEmpId, aStreet, aCity, aState);
		wage = aWage;
		hours = aHours;
	}

	// set wage

	public void setWage(double hourlyWage)

	{

		wage = (hourlyWage < 0.0) ? 0.0 : hourlyWage;

	} // end method setWage

	// return wage

	public double getWage()

	{

		return wage;

	} // end method getWage

	// set hours worked

	public void setHours(double hoursWorked)

	{

		hours = ((hoursWorked >= 0.0) && (hoursWorked <= 168.0)) ?

				hoursWorked : 0.0;

	} // end method setHours

	// return hours worked

	public double getHours()

	{

		return hours;

	} // end method getHours

	// calculate earnings; override abstract method earnings in Employee

	public double earnings()

	{

		return getWage() * getHours();

	} // end method earnings

	// return String representation of HourlyEmployee object

	public String toString()

	{

		return super.toString()+" "+

				"hours : "+getHours()+" "+

				"wage : " + getWage()+"earnings :"+ earnings();

	} // end method toString

} // end class HourlyEmployee

public class Driver6 {

	public static void main(String[] args) {

		Employee e1 = getEmpInfo();
		Employee e2 = getEmpInfo();
		System.out.println(e1);
		System.out.println(e2);

	}

	private static Employee getEmpInfo() {
		Scanner sc = new Scanner(System.in);

		// taking user input

		System.out.print("Enter first name: ");

		String first = sc.next();

		System.out.print("Enter last name: ");

		String last = sc.next();

		System.out.print("Enter emp id ");

		String id = sc.next();

		System.out.print("Enter emp street ");

		String street = sc.next();
		System.out.print("Enter emp city ");

		String city = sc.next();
		System.out.print("Enter emp state ");

		String state = sc.next();

		System.out.print("Enter hours worked: ");

		double hoursWorked = sc.nextDouble();

		System.out.print("Enter wage: ");

		double hourlyWage = sc.nextDouble();

		// creating an object of HourlyEmployee

		HourlyEmployee emp = new HourlyEmployee(first, last, id, street, city, state, hourlyWage, hoursWorked);
		return emp;
	}

}