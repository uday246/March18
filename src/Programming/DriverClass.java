package Programming;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();
		System.out.println("Enter Id");
		e.setId(sc.next());
		sc.nextLine();
		System.out.println("Enter Name");
		e.setName(sc.nextLine());
		System.out.println("Enter hours");
		e.setHours(sc.nextDouble());
		System.out.println("Enter rate");
		e.setRate(sc.nextDouble());
		printPaySlip(e);
		sc.close();
	}

	private static void printPaySlip(Employee aE) {
		SimpleDateFormat sf = new SimpleDateFormat("MMM yyyy");
		
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\tSALARY SLIP");
		System.out.println("\t\t\t\tPeriod: "+sf.format(new Date()));
		
		
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("Employee Name :\t"+aE.getName());
		System.out.println("Employee Id :\t"+aE.getId());
		System.out.print("Employee Pay Rate :\t$"+aE.getRate()+"/hour");
		System.out.println("\t\tWork hours : "+aE.getHours());
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		// checking for extra hours
		double extraHours = (aE.getHours()>80)?(aE.getHours()-80):0;
		
		// calculating extra hours payment
		double amount = aE.getHours()*aE.getRate();
			amount += extraHours*(aE.getRate()*.5);

			System.out.print("Two week gross Pay\t\t");
			System.out.printf("%5.2f",amount);
			System.out.println();
			double ft = (amount*18.5)/100.0;
			double ss = (amount*4.2)/100;
			double medicare = (amount*1.45)/100;
			double state = (amount*2.7)/100;
			
			System.out.print("Federal tax (18.5%)\t\t\t\t");
			System.out.printf("%5.2f",ft);
			System.out.println();
			
			System.out.print("Social Security (4.2%)\t\t\t\t");
			System.out.printf("%5.2f",ss);
			System.out.println();
			
			System.out.print("Medicare(1.45%)\t\t\t\t\t");
			System.out.printf("%5.2f",medicare);
			System.out.println();
			
			
			
			System.out.print("state(2.7%)\t\t\t\t\t");
			System.out.printf("%5.2f",state);
			System.out.println();
			
			System.out.print("-----------------------------------------------------------------------------------------------");
			System.out.println();
			System.out.print("Total\t\t\t\t"+(amount)+"\t\t");
			System.out.printf("%5.2f",(ft+ss+medicare+state));
			System.out.println();
			
			System.out.print("-----------------------------------------------------------------------------------------------");
			System.out.println();
			System.out.print("Net pay\t\t\t\t\t\t");
			System.out.printf("%5.2f",amount-(ft+ss+medicare+state));
			System.out.println();
			
			
			
	}

}

class Employee{
	private String name;
	private String id;
	private double hours;
	private double rate;
	
	public Employee(){
		
	}
	public Employee(String aName, double aHours, double aRate,String aId) {
		super();
		name = aName;
		id=aId;
		hours = aHours;
		rate = aRate;
	}
	
	
	
	public String getId() {
		return id;
	}



	public void setId(String aId) {
		id = aId;
	}



	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double aHours) {
		hours = aHours;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double aRate) {
		rate = aRate;
	}
	
}