class BankAccount {
	String id;
	int balance;

	public BankAccount(String aId, int aBalance) {
		super();
		id = aId;
		balance = aBalance;
	}

	public BankAccount() {
	}

	public String getId() {
		return id;
	}

	public void setId(String aId) {
		id = aId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int aBalance) {
		balance = aBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", balance=" + balance + "]";
	}

}

class Bank {
	BankAccount accounts[] = new BankAccount[10];
	int index = 0;

// adds the given account to the array
	public void addBankAccount(BankAccount b) {
		accounts[index++] = b;
	}
	// search the accout in the bank based in the given ID
	public BankAccount getAccountDetails(String id) {
		BankAccount b = null;
		for (int i = 0; i < index; i++) {
			if (accounts[i].id.equals(id)) {
				b = accounts[i];
				break;
			}
		}
		return b;
	}
	public BankAccount getLargestBalAccountDetails() {
		BankAccount b = null;
		int big = accounts[0].balance;
		for (int i = 1; i < index; i++) {
			if(accounts[i].balance>=big){
				big  = accounts[i].balance;
				b = accounts[i];
			}
		}
		return b;
	}
	
}

public class BankTester {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addBankAccount(new BankAccount("1", 100));
		bank.addBankAccount(new BankAccount("2", 5040));
		bank.addBankAccount(new BankAccount("3", 7740));
		bank.addBankAccount(new BankAccount("4", 11000));
		System.out.println(bank.getLargestBalAccountDetails());

	}
}
