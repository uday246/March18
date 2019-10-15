import java.util.Scanner;

public class Loan {
	// create the
	private double loanAmt, interestRate, interestAmount, totalAmt;

	// create a default construction to initialize all of the attributes
	// create a setter for each attribute
	// create a getter for each attribute
	// complete the calculateLoan method
	public void calculateLoan() { 
		System.out.println("loan amount : " + this.loanAmt); 
		System.out.println("interest rate: " + ((interestAmount*100) + "%"); 
		System.out.println("interest : " + (loanAmt*interestAmount) ) ; 
		//calculate the cumlative interestAmount //compute the cumlative loanAmt 
		}

	public static void main(String[] args) {
		String flag=""; 
		int counter=0; 
		double loanvalue=0.0; 
		double interest = 0.0; 
		System.out.println("Welcome to the Interest Calculator"); 
		//create a Loan called obj 
		Scanner keyboard = new Scanner(System.in); 
		do { System.out.print("Enter loan amount : "); 
		loanvalue = keyboard.nextDouble(); 
		System.out.print("Enter interest rate: "); 
		interest = keyboard.nextDouble(); 
		//use the setter to set the loanAmt with the loanvalue for the Loan obj 
		//use the setter to set the interestRate with the interest for the Loan obj 
		//call the calculateLoan method for the Loan obj 
		System.out.print("\nWould you like to enter another loan amount? (y/n):"); 
		Scanner input = new Scanner(System.in); 
		flag = input.nextLine(); 
		if (++counter >=3) flag="n"; 
		} while ( flag.equalsIgnoreCase("Y")); 
		System.out.println("\nTotal loan : " + /*get the total Amt for the Loan obj */ ); 
		System.out.println("Total interest : " + /*get the interest Amount for the Loan obj */ ); 
		}
}}}}
