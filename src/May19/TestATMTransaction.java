package May19;

import java.util.Scanner;

class ATMTransaction {
	private int accountNumber;
	private double balance;

	public ATMTransaction(int aAccountNumber, double aBalance) {
		super();
		aBalance = aAccountNumber;
		if (aBalance < 0)
			System.out.println("Amount can't be negative...!!!");
		else
			balance = aBalance;

	}

	public ATMTransaction(int aAccountNumber) {
		super();
		accountNumber = aAccountNumber;
	}

	public double checkBalance() {
		return balance;
	}

	public void deposit(double am) {
		if (am < 0) {
			System.out.println("Amount can't negative..!!!");
			return;
		}
		balance += am;
	}

	public void withdraw(double am) {
		
		if(balance<=0) {
			System.out.println("Low balance..can not withdraw");
			return;
		}
		
		if (balance >= am) {
			balance -= am;
		} 
		else{
			System.out.println("Low balance..can not withdraw");
				
		}
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return "AccountNumber : " + accountNumber + ", Balance=" + balance;
	}

}

public class TestATMTransaction {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double i = input.nextDouble();
		double j = input.nextDouble();
		ATMTransaction atm = new ATMTransaction((int) i, j);
		atm.deposit(i);
		System.out.println("Balance : " + atm.checkBalance());
		atm.deposit(i);
		System.out.println("Balance : " + atm.checkBalance());
		atm.withdraw(i);
		System.out.println("Balance : " + atm.checkBalance());
		atm.withdraw(i);
		atm.withdraw(i);
		atm.withdraw(i);
		atm.withdraw(i);
		atm.withdraw(i);
		atm.withdraw(i);
		System.out.println("Balance : " + atm.checkBalance());
		System.out.println(atm);

	}
}
