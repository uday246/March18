package sep18th;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	String fullName;
	String manager;

	public Employee(String aFullName, String aManager) {
		super();
		fullName = aFullName;
		manager = aManager;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String aFullName) {
		fullName = aFullName;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String aManager) {
		manager = aManager;
	}

	@Override
	public String toString() {
		return fullName+" : "+manager;
	}

}

class EmployeePortfolios {
	List<Employee> list = new ArrayList<Employee>();
	public void readEmployeeData() throws Exception{
		BufferedReader br = null;
			br = new BufferedReader(new FileReader(new File("emp.txt")));
		String line = br.readLine();
		while(line!=null){
			line = br.readLine();
			if(line==null) return;
			String temp[]=line.split(" ");
			list.add(new Employee(temp[0], temp[1]));
		}
	}
	public void sortbyName(){
		// sort the list based on name
		Collections.sort(list,new Comparator() {

			@Override
			public int compare(Object aO1, Object aO2) {
				Employee e1 = (Employee) aO1;
				Employee e2 = (Employee) aO2;
				// returns 0,1,-1 based on name
				return e1.getFullName().compareTo(e2.getFullName());
			}
			
		});
	}
	public void sortbyManager(){
		// sort the list based on manager
		Collections.sort(list,new Comparator() {

			@Override
			public int compare(Object aO1, Object aO2) {
				Employee e1 = (Employee) aO1;
				Employee e2 = (Employee) aO2;
				// returns 0,1,-1 based on manager
				return e1.getManager().compareTo(e2.getManager());
			}
			
		});
	}
}
public class TestEmployeePortfolios{
	public static void main(String[] args) throws Exception {
		EmployeePortfolios e = new EmployeePortfolios();
		e.readEmployeeData();
		e.sortbyName();
		
		System.out.println();
		System.out.println("Sort by name");
		for(Employee emp :e.list){
			System.out.println(emp);
		}
		System.out.println();
		System.out.println("Sort by manager");
		e.sortbyManager();
		for(Employee emp :e.list){
			System.out.println(emp);
		}
	}
}
