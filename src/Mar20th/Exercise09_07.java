package Mar20th;

import java.util.Date;

class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	Account(int i, double b) {
		id = i;
		balance = b;
		dateCreated = new Date();
	}

	void setId(int i) {
		id = i;
	}

	int getId() {
		return id;
	}

	void setBalance(double b) {
		balance = b;
	}

	double getBalance() {
		return balance;
	}

	void setAnnualInterestRate(double a) {
		annualInterestRate = a;
	}

	double getAnnualInterestRate() {
		return annualInterestRate;
	}

	Date getDateCreated() {
		return dateCreated;
	}

	double getMonthlyInterest() {
		return balance * getAnnualInterestRate() / 1200.0;
	}

	void withdraw(double amount) {
		balance -= amount;
		if (amount < 0)
			balance = 0;
	}

	void deposit(double amount) {
		balance += amount;
	}
}


public class Exercise09_07 {
	public static void main(String args[]) {
		Account object = new Account(1122, 20000);
		//System.out.println("New account with ID " + object.getId() + ", balance $" + object.getBalance() + " created");
		object.setAnnualInterestRate(4.5);
		//System.out.println("Withdrawing $2500 from the account");
		object.withdraw(2500);
		//System.out.println("Depositing $3000 to the account");
		object.deposit(3000);
		System.out.println("Balance is  $" + object.getBalance());
		System.out.println("Monthly Interest is  " + object.getMonthlyInterest());
		System.out.println("The account was created at  " + object.getDateCreated());
	}
}

