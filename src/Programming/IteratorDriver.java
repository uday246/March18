package Programming;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDriver {
public static void main(String[] args) {
	BikeParts p1 = new BikeParts("A", 10);
	BikeParts p2 = new BikeParts("B", 20);
	BikeParts p3 = new BikeParts("C", 30);
	BikeParts p4 = new BikeParts("D", 40);
	ArrayList<BikeParts>parts =new ArrayList<BikeParts>();
	parts.add(p1);
	parts.add(p2);
	parts.add(p3);
	parts.add(p4);
	WareHouse1 h = new WareHouse1(parts);
	Iterator<BikeParts>itr = h.getBikeParts();
	
	while(itr.hasNext())
		System.out.println(itr.next());
}
}

class WareHouse1{
	
	ArrayList<BikeParts> parts;

	public WareHouse1(ArrayList<BikeParts> aParts) {
		super();
		parts = aParts;
	}
	public Iterator<BikeParts> getBikeParts(){
		return parts.iterator();
	}
}
class BikeParts{
	
	private String name;
	private double price;
	
	public BikeParts(String aName, double aPrice) {
		super();
		name = aName;
		price = aPrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double aPrice) {
		price = aPrice;
	}
	
	public String toString(){
		return getName()+" : "+getPrice();
	}
}