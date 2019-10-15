package Mar25th;

class Car {

	private String id;
	private int totalMiles;
	private double milesPrGln;
	private int cost;
	private int price;
	private boolean isSold;
	public Car(String aId, int aTotalMiles, double aMilesPrGln, int cost,  boolean aIsSold) {
		super();
		id = aId;
		totalMiles = aTotalMiles;
		milesPrGln = aMilesPrGln;
		this.cost = cost;
		isSold = aIsSold;
	}
	public Car(){
		
	}
	public Car(String id){
		this.id = id;
	}
	int getProfif(){
		return price-cost;
	}
	int compareMPG(Car car){
		return (int)(this.milesPrGln-car.milesPrGln);
	}
	int compareMiles(Car otherCar){
		return this.totalMiles-otherCar.totalMiles;
	}
	int comparePrice(Car otherCar){
		return this.price - otherCar.price;
	}
	int compareId(Car otherCar) {
		return this.id.compareTo(otherCar.id);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String aId) {
		id = aId;
	}
	public int getTotalMiles() {
		return totalMiles;
	}
	public void setTotalMiles(int aTotalMiles) {
		totalMiles = aTotalMiles;
	}
	public double getMilesPrGln() {
		return milesPrGln;
	}
	public void setMilesPrGln(double aMilesPrGln) {
		milesPrGln = aMilesPrGln;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int aPrice) {
		price = aPrice;
	}
	public boolean isSold() {
		return isSold;
	}
	public void setSold(boolean aIsSold) {
		isSold = aIsSold;
	}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int aCost) {
		cost = aCost;
	}
	@Override
	public String toString() {
		String temp = "Car id = "+getId()+", milage = "+getTotalMiles()+", mpg = "+getMilesPrGln()+", cost = "+getCost()+", price = "+getPrice();
		if(isSold)
			temp+=", is Sold";
		else
			temp+=", not sold";
		return temp;
	}
	void addMiles(int miles){
		setTotalMiles(getTotalMiles()+miles);
	}
	
}
public class TestCar{
	public static void main(String[] args) {
		Car c1 = new Car("1");
		c1.setTotalMiles(1000);
		c1.setCost(1000);
		c1.setMilesPrGln(14.5);
		
		Car c2 = new Car("2");
		c2.setTotalMiles(800);
		c2.setCost(1200);
		c2.setMilesPrGln(12.5);
		c1.setPrice(1200);
		c1.setSold(true);
		System.out.println("Profit : "+c1.getProfif());
		System.out.println(c1);
		
	}
}
