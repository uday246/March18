package Mar15th;

public class Bank {
private double balance;
private  double intrestRate;
public double getBalance() {
	return balance;
}
public void update(double aBalance) {
	balance += aBalance;
}
public double getIntrestRate() {
	return intrestRate;
}
public Bank(double aBalance, double aIntrestRate) {
	super();
	balance = aBalance;
	intrestRate = aIntrestRate;
}

}
