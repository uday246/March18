package Mat18th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Rental {

	//constant fields
	public final static int num_min = 60;//fields that hold the number of minutes in an hour
	//public final static int rate_hour = 40;//fields that hold the hourly rental rate
	public final static double rate_hour = 40.00;//fields that hold the hourly rental rate

	//other fields
	private String contract_number;
	private int number_of_hours, number_of_minutes;
	private double price; // Price is double
    private String contactNumber; // created contact number as per the requirement
    
	//default constructor
	public Rental() {
	this.setContract_number("A000");
	this.setHoursAndMinutes(0);
	this.setContactNumber("0000000000"); // setting to 000000000 when creating default object
	}

	//parameterised constructor 
	// changed constructor to take 3 parameters
	public Rental(String contract_number, int number_of_minutes,String contactNo) {
	this.setContract_number(contract_number);
	this.setHoursAndMinutes(number_of_minutes);
	this.setContactNumber(contactNo);
	}

	//getter/setters
	public String getContract_number() {
	return contract_number;
	}

	public int getNumber_of_hours() {
	return number_of_hours;
	}

	public int getNumber_of_minutes() {
	return number_of_minutes;
	}

	public double getPrice() {
	return price;
	}

	private void setContract_number(String contract_number) {
		
		// Checking whether the contract no is valid or not
		// isAlphabetic will check given char is alphabetic or not and isDigit will check given char is digit or not
		if(contract_number.length()==4 && Character.isAlphabetic(contract_number.charAt(0)) && Character.isDigit(contract_number.charAt(1)) && Character.isDigit(contract_number.charAt(2)) && Character.isDigit(contract_number.charAt(3)))
		{
			this.contract_number = contract_number;
		}
		else{
			this.contract_number = "A000";
			
		}
	}
	
// returning the mobile in the given format using substring
	public String getContactNumber() {
		
		return "("+contactNumber.substring(0, 4)+") "+contactNumber.substring(4,7)+"-"+contactNumber.substring(7);
	}

	public void setContactNumber(String aContactNumber) {
		String temp="";
		//  exctrating the numbers from the given input
		for(int i=0;i<aContactNumber.length();i++){
			if(Character.isDigit(aContactNumber.charAt(i)))
				temp+=aContactNumber.charAt(i);
		}
		if(temp.length()==10){
			contactNumber = temp;
		}
		else{
			contactNumber = "0000000000";
		}
	}

	private void setHoursAndMinutes(int number_of_minutes) {
	//this.number_of_hours = number_of_minutes / num_min;
	//this.number_of_minutes = number_of_minutes % num_min;
	//this.price = rate_hour * number_of_hours;
	      this.number_of_hours = number_of_minutes / num_min;
	      this.number_of_minutes = number_of_minutes % num_min;
	      this.price = number_of_hours * rate_hour + number_of_minutes;

	}

	//method to print the output
	// modified toString to return contact number
	@Override
	public String toString() {
	return "Rental{" + "contract_number=" + contract_number + ", number_of_hours=" + number_of_hours + ", number_of_minutes=" + number_of_minutes + ", price=" + price +"contact no :"+contactNumber+"}" ;
	}

	}


public class RentalDemo {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
		// object 1 with default parameter values
		Rental r1 = new Rental();
		// to take user input
		Scanner s = new Scanner(System.in);
		String contrctNumber;
		String contact_number;
		int number_mins;
		// System.out.println("Enter the contract number");
		System.out.print("Enter the contract number: "); // should be print
		contrctNumber = s.next();
		// System.out.println("Enter the number of minutes");
		System.out.print("Enter the number of minutes: "); // Should be print
		number_mins = s.nextInt();
		
		System.out.print("Enter the contact no: "); // Should be print
		contact_number= reader1.readLine();
		
		// object 2 with user defined parameter values
		Rental r2 = new Rental(contrctNumber, number_mins,contact_number);
		// prints r1 data
		System.out.println(r1.toString());
		// prints r2 data
		System.out.println(r2.toString());
		System.out.println(r2.getContactNumber());
	}

}
