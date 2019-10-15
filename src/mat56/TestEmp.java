package mat56;


public class TestEmp{
	public static void main(String[] args) {
		
	}
}
class Employee {
	public int getHours() {
		// works 40 hours / week
		return 40;
	}

	public double getSalary() {
		// $40,000.00 / year
		return 40000.0;
	}

	public int getVacationDays() {
		// 2 weeks' paid vacation
		return 10;
	}

	public String getVacationForm() {
		// use the yellow form
		return "yellow";
	}
}

class Lawyer extends Employee {
	public int getVacationDays() {
		return super.getVacationDays() + 5;
	}

	public String getVacationForm() {
		return "pink";
	}

	public void sue() {
System.out.println("I'll see you in court!"); 
}
}