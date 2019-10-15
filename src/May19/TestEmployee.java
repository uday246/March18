package May19;

class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int aId, String aFirstName, String aLastName, int aSalary) {
		super();
		id = aId;
		firstName = aFirstName;
		lastName = aLastName;
		salary = aSalary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int aSalary) {
		salary = aSalary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAnnaulSalary() {
		return getSalary() * 12;
	}

	public void raiseSalary(int percent) {
		salary = (int) ((int)salary + salary * (percent / 100.0));
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}

}

public class TestEmployee {
	public static void main(String[] args) {
		Employee e = new Employee(1001, "John", "Black", 3500);
		System.out.println(e);
		e.raiseSalary(5);
		System.out.println("Annual Sal: " + e.getAnnaulSalary());
	}
}