package mat25;

abstract class BankAccount {
	public abstract void depoist(int amount);

	public abstract void withdraw(int amount);

}

class SavingsAccount extends BankAccount {
	private int amount;
	private boolean active = true;

	public SavingsAccount(int aAmount) {
		super();
		amount = aAmount;
		if (amount >= 25)
			active = true;
	}

	@Override
	public void depoist(int aAmount) {

		if (aAmount > 0) {
			amount += aAmount;
			System.out.println("Successfully deposited : " + aAmount);
			System.out.println("Available balance : " + amount);
		}
		if (amount >= 25)
			active = true;
	}

	@Override
	public void withdraw(int aAmount) {
		if (!active) {
			System.out.println("Your account is in inactive mode,Please deposit money to make withdrawls");
			return;
		}
		if (aAmount + 25 > amount) {
			System.out.println(" Unable to with draw the amount :" + aAmount);
			System.out.println("Please try with the less amount");
			return;
		}
		if (aAmount + 25 < amount) {
			amount -= aAmount;
			System.out.println("Successfully withdrawn : " + aAmount);
			System.out.println("Available balance : " + amount);
		}
		if (amount < 25)
			active = false;
	}

}

public class TestBankAccount {
	public static void main(String[] args) {
		BankAccount bank = new SavingsAccount(100);
		bank.withdraw(50);
		bank.withdraw(30);
		bank.withdraw(20);
		bank.depoist(50);
		bank.withdraw(10);

	}
}