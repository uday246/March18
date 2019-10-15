import java.io.Serializable;
import java.util.Date;

public class LunchOrder implements Comparable,Cloneable,Serializable {

	private static final long serialVersionUID = 1L;
	int orderNumber;
	String name;
	int numberOfBurgers;
	int numberOfFries;
	int numberOfSodas;
	Date dateCreated;
	double orderCost;
	static int OrderType;
	public static void setCompareOrder(int value){
		OrderType = value;
	}
	static int nextOrderNumber;
	public LunchOrder(int aOrderNumber, String aName, int aNumberOfBurgers, int aNumberOfFries, int aNumberOfSodas,
			Date aDateCreated) {
		super();
		orderNumber = aOrderNumber;
		name = aName;
		numberOfBurgers = aNumberOfBurgers;
		numberOfFries = aNumberOfFries;
		numberOfSodas = aNumberOfSodas;
		dateCreated = aDateCreated;
	}
	private static final double   COST_OF_BURGER = 2.75;
	private static final double   COST_OF_FRIES = 0.75;
	private static final double   COST_OF_SODA = 1.5;


	@Override
	public int compareTo(Object obj) {
		if(OrderType==1){
			Integer i1 = ((LunchOrder)obj).getOrderNumber();
			Integer i2 = this.getOrderNumber();
			return i1.compareTo(i2);
		}
		else
		if(OrderType==2){
			String i1 = ((LunchOrder)obj).getName();
			String i2 = this.getName();
			return i1.compareTo(i2);
		}
		if(OrderType==3){
			Double i1 = ((LunchOrder)obj).getOrderCost();
			Double i2 = this.getOrderCost();
			return i1.compareTo(i2);
		}
		return 0;
	}
	double computeOrderCost(double tax,double tips){
		double total = (numberOfBurgers*COST_OF_BURGER)+(numberOfFries*COST_OF_FRIES)+(numberOfSodas*COST_OF_SODA);

		total = (total *(tax/100))+total;
		total+=tips;
		return total;

	}

	public void basedOnID(){

	}
	public void basedOnCustmerName(){

	}
	public void basedOnCostOrOrder(){

	}
	@Override
	public String toString() {
		return "\t"+getName()+"\t"+getOrderNumber()+"\t"+getNumberOfBurgers()+"\t"+getNumberOfFries()+"\t"+getNumberOfSodas()+"\t"+getOrderCost();

	}
	public static String getHdr(){
		return "\tcustomer\torder#\t#Burgs\tFries\tSodas\tcost";
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int aOrderNumber) {
		orderNumber = aOrderNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public int getNumberOfBurgers() {
		return numberOfBurgers;
	}
	public void setNumberOfBurgers(int aNumberOfBurgers) {
		numberOfBurgers = aNumberOfBurgers;
	}
	public int getNumberOfFries() {
		return numberOfFries;
	}
	public void setNumberOfFries(int aNumberOfFries) {
		numberOfFries = aNumberOfFries;
	}
	public int getNumberOfSodas() {
		return numberOfSodas;
	}
	public void setNumberOfSodas(int aNumberOfSodas) {
		numberOfSodas = aNumberOfSodas;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date aDateCreated) {
		dateCreated = aDateCreated;
	}
	public double getOrderCost() {
		return orderCost;
	}
	public void setOrderCost(double aOrderCost) {
		orderCost = aOrderCost;
	}
	public static int getNextOrderNumber() {
		return nextOrderNumber;
	}
	public static void setNextOrderNumber(int aNextOrderNumber) {
		nextOrderNumber = aNextOrderNumber;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static double getCostOfBurger() {
		return COST_OF_BURGER;
	}

	public static double getCostOfSoda() {
		return COST_OF_SODA;
	}
	public Object clone()throws CloneNotSupportedException{  
		LunchOrder lo = null;
		lo = (LunchOrder) super.clone();  
		//lo.setDateCreated(new Date()); uncomment to enable deep cloning
		return lo;
		
		
		//Deep Cloning : For all the references we need to create the new objects
		//Shadow Cloning : Just it will copies the old value into new object
	}  

}
