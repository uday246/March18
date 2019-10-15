package chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Loan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double annualInterestRate;

	private int numberOfYears;

	private double loanAmount;

	private java.util.Date loanDate;

	/** Default constructor */

	public Loan() {

		this(2.5, 1, 1000);

	}

	/**
	 * Construct a loan with specified annual interest rate,
	 * 
	 * number of years and loan amount
	 * 
	 */

	public Loan(double annualInterestRate, int numberOfYears,

			double loanAmount) {

		this.annualInterestRate = annualInterestRate;

		this.numberOfYears = numberOfYears;

		this.loanAmount = loanAmount;

		loanDate = new java.util.Date();

	}

	/** Return annualInterestRate */

	public double getAnnualInterestRate() {

		return annualInterestRate;

	}

	/** Set a new annualInterestRate */

	public void setAnnualInterestRate(double annualInterestRate) {

		this.annualInterestRate = annualInterestRate;

	}

	/** Return numberOfYears */

	public int getNumberOfYears() {

		return numberOfYears;

	}

	/** Set a new numberOfYears */

	public void setNumberOfYears(int numberOfYears) {

		this.numberOfYears = numberOfYears;

	}

	/** Return loanAmount */

	public double getLoanAmount() {

		return loanAmount;

	}

	/** Set a newloanAmount */

	public void setLoanAmount(double loanAmount) {

		this.loanAmount = loanAmount;

	}

	/** Find monthly payment */

	public double getMonthlyPayment() {

		double monthlyInterestRate = annualInterestRate / 1200;

		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -

				(Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));

		return monthlyPayment;

	}

	/** Find total payment */

	public double getTotalPayment() {

		double totalPayment = getMonthlyPayment() * numberOfYears * 12;

		return totalPayment;

	}

	/** Return loan date */

	public java.util.Date getLoanDate() {

		return loanDate;

	}

}

public class TestLoanClassStorage {

	/** Main method */

static	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Loan> loan = null;
		try{
		loan = loadDataFromFile();
		}catch(Exception e){
			System.out.println("Data doesnot exist");
		}
		if(loan==null)
			loan  = new ArrayList<Loan>();
		int ch=0;
		boolean flag = false;
		while(true){
			System.out.println("1  Add Loan Object");
			System.out.println("2  Print data");
			System.out.println("3 Save Data");
			System.out.println("4 Quit");
			ch = input.nextInt();
			switch(ch){
			case 1:
				Loan l = readLoan();
				loan.add(l);
				break;
				
			case 2:
				display(loan);
				break;
			case 3:
				try {
					saveData(loan);
				} catch (Exception e) {
				}
				break;
			case 4: 
				flag = true;
				break;
			}
			if(flag)
				break;
			
		}
		

	}

	// loading the all objects from file into list
	private static ArrayList<Loan> loadDataFromFile() throws Exception {

		ObjectInputStream in=new ObjectInputStream(new FileInputStream("loan.dat"));  
		ArrayList loan = new ArrayList<Loan>();
		Loan temp=(Loan)in.readObject();  
		  loan.add(temp);
		  boolean flag = true;
		  while(flag){
			  try{
				  temp=(Loan)in.readObject();
				  loan.add(temp);  
			  }
			  catch(Exception e){
				  break;
			  }
			  
		  }
		return loan;
	}
// saving the data into the file
	private static void saveData(ArrayList<Loan> aLoan) throws Exception {
		FileOutputStream fout=new FileOutputStream("loan.dat");  
		ObjectOutputStream out=new ObjectOutputStream(fout);  
		  for(Loan temp:aLoan){
		  out.writeObject(temp);  
		  out.flush(); 
		  }
		  out.close();
	}
// this is used to display the objects in the list
	private static void display(ArrayList<Loan> aLoan) {

		for(Loan loan : aLoan){
			System.out.printf("The loan was created on %s\n" +

			"The monthly payment is %.2f\nThe total payment is %.2f\n",

			loan.getLoanDate().toString(), loan.getMonthlyPayment(),

			loan.getTotalPayment());
		}
	}

	// this method to read the data from the user as indivisual loan object
	private static Loan readLoan() {
		System.out.print(

				"Enter yearly interest rate, for example, 8.25: ");

		double annualInterestRate = input.nextDouble();

		// Enter number of years

		System.out.print("Enter number of years as an integer: ");

		int numberOfYears = input.nextInt();

		// Enter loan amount

		System.out.print("Enter loan amount, for example, 120000.95: ");

		double loanAmount = input.nextDouble();

		// Create Loan object

		Loan loan =

				new Loan(annualInterestRate, numberOfYears, loanAmount);
		
		return loan;
	}

}