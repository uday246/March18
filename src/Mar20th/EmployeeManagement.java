package Mar20th;
/*
 * here we are using the 1 dimensional array of employee objects
 * we are having  2 constructors for class Employee default and parameterized constructor
 * here we are overloading the function findEmp() with id and with name, overloading means same function name with different number of order of type of arguments
 *
 *Encapsulation means process of combing the properties and methods into single container
 */
public class EmployeeManagement {
	static Employee emp[] = new Employee[5];
public static void main(String[] args) {
Employee temp = new Employee("Emp1",1,20000);
emp[0]=temp;
temp = new Employee("Emp2",2,30000);
emp[1]=temp;
temp = new Employee("Emp3",3,25000);
emp[2]=temp;
temp = new Employee("Emp4",4,28900);
emp[3]=temp;
temp = new Employee("Emp5",5,80000);
emp[4]=temp;
System.out.println("Finding By Emp Name :\n");
System.out.println(new EmployeeManagement().findEmp("Emp4"));
System.out.println("\nFinding By Emp Id :\n");
System.out.println(new EmployeeManagement().findEmp(3));

}

public Employee findEmp(int id){
	Employee em = new Employee();
	for(Employee e:EmployeeManagement.emp){
		if(e.getId()==id){
			return e;
		}
	}
	return em;
}

public Employee findEmp(String name){
	Employee em = new Employee();
	for(Employee e:EmployeeManagement.emp){
		if(e.getName().equals(name)){
			return e;
		}
	}
	return em;
}
}
class Employee{
	
	
	private String name;
	private int id;
	private double salary;
	
	public Employee(){
		
	}
	
	public Employee(String aName, int aId, double aSalary) {
		super();
		name = aName;
		id = aId;
		salary = aSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getId() {
		return id;
	}

	public void setId(int aId) {
		id = aId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double aSalary) {
		salary = aSalary;
	}

	@Override
	public String toString() {
		return "Name = " + name + "\nId =" + id + "\nSalary =" + salary + "";
	}
	
	
}
