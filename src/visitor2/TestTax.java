package visitor2;
class Tax{
	private int gross;
	private int savings;
	
	
	public Tax(int aGross, int aSavings) {
		super();
		gross = aGross;
		savings = aSavings;
	}


	public int getGross() {
		return gross;
	}


	public void setGross(int aGross) {
		gross = aGross;
	}


	public int getSavings() {
		return savings;
	}


	public void setSavings(int aSavings) {
		savings = aSavings;
	}


	// returns the tax amount based on gross salary
	public double taxCalculator(){
		if(gross<10000)
			return savings*0.1;
		
		return (gross-100000)*0.1 + savings*0.05;
		
	}
}
public class TestTax {
public static void main(String[] args) {
	Tax t = new Tax(500000, 1000000);
	System.out.println("Tax : "+t.taxCalculator());
}
}
