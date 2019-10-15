
public abstract class Account {
protected String name;
private double balance;
public abstract void deductFees();
}
class Savings extends Account{

	@Override
	public void deductFees() {
		
	}
	
}