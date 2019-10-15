package mat55;

class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee(String aFirstName, String aLastName, double aMonthlySalary) {
		super();
		firstName = aFirstName;
		lastName = aLastName;
		if (aMonthlySalary < 0)
			monthlySalary = 0;
		else
			monthlySalary = aMonthlySalary;
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

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double aMonthlySalary) {
		monthlySalary = aMonthlySalary;
	}

	public String toString() {
		return firstName + " " + lastName + ", Yearly Salary " + (monthlySalary * 12);
	}
}

public class TestEmp {
	public static void main(String[] args) {
		Employee e1 = new Employee("Uday", "Kumar", 1000);
		Employee e2 = new Employee("Koti", "Induri", 2000);
		Employee e3 = new Employee("Virat", "Viru", 3000);
		Employee e4 = new Employee("Chinna", "Kumar", 4000);
		System.out.println("Employee 1 : " + e1);
		System.out.println("Employee 2 : " + e2);
		System.out.println("Employee 3 : " + e3);
		System.out.println("Employee 4 : " + e4);
		e1.setMonthlySalary(e1.getMonthlySalary() + e1.getMonthlySalary() * 0.1);
		e2.setMonthlySalary(e2.getMonthlySalary() + e2.getMonthlySalary() * 0.1);
		e3.setMonthlySalary(e3.getMonthlySalary() + e3.getMonthlySalary() * 0.1);
		e4.setMonthlySalary(e4.getMonthlySalary() + e4.getMonthlySalary() * 0.1);
		System.out.println("After giving 10% hike");
		System.out.println("Employee 1 : " + e1);
		System.out.println("Employee 2 : " + e2);
		System.out.println("Employee 3 : " + e3);
		System.out.println("Employee 4 : " + e4);

	}
}
