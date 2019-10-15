import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Restaurant {
private static final double tax = 0;
private static final double tips = 0;
static int orderID=100;
ArrayList<LunchOrder> orders = null;	
public static void main(String[] args) {
	Restaurant restaurant = new Restaurant();
	Scanner input = new Scanner(System.in);
	
	int ch=0;
	 while(true){
		System.out.println("1  Create  LunchOrders");
		System.out.println("2  Add Lunch Orders ");
		System.out.println("3  Display ");
		System.out.println("4  Sort on Order ");
		System.out.println("5  Sort on Customer ");
		System.out.println("6  Sort on Cost ");
		System.out.println("7  Save Objects into file ");
		System.out.println("8  Restore Indivisual Objects from a file ");
		System.out.println("9  Save Array List Objet into File");
		System.out.println("9  Restore Array List From  File");
		System.out.println("11 Test Clone");
		System.out.println("12 Test Iterators");
		System.out.println("13 Exit");
		ch = input.nextInt();
		
		switch(ch){
		case 1: 
			restaurant.orders = new ArrayList<LunchOrder>(10);
			break;
		case 2 : 
			try {
				restaurant.takeOrders();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			break;
		case 3:
			restaurant.displayOrders();
			break;
		case 4:restaurant.sortOnOrderId();
			break;
		case 5:
			restaurant.sortOnCustomer();
			break;
		case 6:
			restaurant.sortOnCost();
			break;
		case 7:
			try {
				restaurant.saveObjectsIntoFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 8:
			try {
				restaurant.restoreObjectsFromFile();
			} catch (FileNotFoundException e) {
			} catch (ClassNotFoundException e) {
			} catch (IOException e) {
			}
			break;
		
		case 9:
			try {
				restaurant.saveArrayListIntoFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		
		case 10:
			try {
				restaurant.restoreArraylistObjectFromFile();
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
			break;
		case 11:
			restaurant.testClone();
			break;
		case 12:
			restaurant.testIterators();
			break;
		case 13:
			input.close();
			break;
		}
	}
}

private void testClone() {
	for(LunchOrder temp : orders){
		try {
			temp = (LunchOrder) temp.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}

private void restoreArraylistObjectFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
	ObjectInputStream in=new ObjectInputStream(new FileInputStream("lunchOrder.dat"));  
	orders = (ArrayList<LunchOrder>)in.readObject(); 
	
}

private void saveArrayListIntoFile() throws IOException {
	FileOutputStream fout=new FileOutputStream("arrayLunchOrderObjects.dat");  
	ObjectOutputStream out=new ObjectOutputStream(fout);  
	  out.writeObject(orders);  
	  out.flush(); 
	  out.close();
	
}

private void restoreObjectsFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
	
	ObjectInputStream in=new ObjectInputStream(new FileInputStream("lunchOrder.dat"));  
	orders = new ArrayList<LunchOrder>();
	  LunchOrder temp=(LunchOrder)in.readObject();  
	  orders.add(temp);
	  while(temp!=null){
		  temp=(LunchOrder)in.readObject();
		  orders.add(temp);
	  }
	
}

private void saveObjectsIntoFile() throws IOException {
	FileOutputStream fout=new FileOutputStream("lunchOrder.dat");  
	ObjectOutputStream out=new ObjectOutputStream(fout);  
	  for(LunchOrder temp:orders){
	  out.writeObject(temp);  
	  out.flush(); 
	  }
	  out.close();
}

private void sortOnCost() {
	LunchOrder.setCompareOrder(3);
	sortOrders();
	
}

private void sortOrders() {
	Collections.sort(orders);
	
}

private void sortOnCustomer() {
	LunchOrder.setCompareOrder(2);
	sortOrders();
}

private void sortOnOrderId() {
	LunchOrder.setCompareOrder(1);
	sortOrders();
	
}

private void displayOrders() {
	System.out.println(LunchOrder.getHdr());
	for(LunchOrder tempOrder:orders){
		System.out.println(tempOrder.toString());
	}
}

private void takeOrders() throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
String name ="";
int friesCount = 0;
int sodasCount = 0;
int burgerCount = 0;
orders = new ArrayList<LunchOrder>();
	for(int i=1;i<=3;i++){
		System.out.println("Enter Order - "+i+" Details ");
		System.out.println("Enter Your Name");
		name = reader.readLine();
		System.out.println("Enter Number Of Burgers");
		burgerCount =  Integer.parseInt(reader.readLine());
		System.out.println("Enter Number Of Sodas");
		sodasCount =Integer.parseInt(reader.readLine());
		System.out.println("Enter Number Of Fries");
		friesCount = Integer.parseInt(reader.readLine());
		
		LunchOrder temp = new LunchOrder(orderID++,name,burgerCount,friesCount,sodasCount,new Date());
		temp.setOrderCost(temp.computeOrderCost(tax, tips));
		orders.add(temp);
	}
	
	
	
}

public void testIterators(){
	Iterator<LunchOrder> itr1 = orders.iterator();
	Iterator<LunchOrder> itr2 = orders.iterator();
	int i=1;
	while(itr1.hasNext()){
		System.out.println(itr1.next().toString());
		if(i==3){
			System.out.println("Displaying with Iterator 2");
			while(itr2.hasNext()){
				System.out.println(itr2.next().toString());
			}
		}
		i++;
	}
	
}

}
