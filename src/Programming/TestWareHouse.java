package Programming;

import java.io.BufferedReader;

import java.io.FileReader;

import java.util.ArrayList;

import java.util.Scanner;

public class TestWareHouse {

static ArrayList<WareHouse> wareHouses = new ArrayList<WareHouse>();

public static void main(String[] args) {

ArrayList<Parts>parts = null;

boolean found = false;

// loading data from files

try {

loadHouses();

parts = getParts();

} catch (Exception e) {

e.printStackTrace();

}

Scanner sc = new Scanner(System.in);

System.out.println("Enter partNo");

String partNo = sc.nextLine();

String descrition = "";

double price=0;

boolean flag = true;

double total = 0;

for(Parts part:parts){

if(part.getPartNo().equals(partNo)){

descrition = part.getDescription();

found = true;

price = part.getPrice();

WareHouse temp = getHouse(part.getWarehouseID());

if(flag){

// need to print these info only once so taking flag

System.out.println(descrition);

System.out.println("Part#: "+partNo);

System.out.println("Price : "+price);

System.out.println("Warehoues Qty");

System.out.println("\n");

flag = false;

}

System.out.printf("%s%15s",temp.getCity(),part.getQuantity());

System.out.println();

total+=part.getQuantity();

}

}

if(found)

   System.out.printf("Total%15s",total);

else

 System.out.printf("Part Doesnot exist");

sc.close();

}

// load the data from the file into array list

private static void loadHouses() throws Exception {

BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\teegu\\Desktop\\warehoues.txt"));

String line = reader.readLine();

while(line!=null){

String temp[] = line.split(" ");

if(temp.length>2){

String id = temp[0];

String city = temp[1];

String state = temp[2];

wareHouses.add(new WareHouse(id, state, city));

}

line = reader.readLine();

}

reader.close();

}

// get the specific house for the specific part

private static WareHouse getHouse(String aWarehouseID) {

WareHouse temp = null;

for(WareHouse t:wareHouses){

if(t.getWarehouseID().equals(aWarehouseID))

{

temp = t;

break;

}

}

return temp;

}

// load all the parts into arraylist from the file

private static ArrayList<Parts> getParts() throws Exception {

BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\teegu\\Desktop\\parts.txt"));

ArrayList<Parts> list = new ArrayList<Parts>();

String line = reader.readLine();

while(line!=null){

String temp[] = line.split(",");

String aPartNo = temp[0];

String aDescription = temp[1];

double aPrice = Double.parseDouble(temp[2].trim());

String aWarehouseID = temp[3];

int aQuantity = Integer.parseInt(temp[4].trim());

Parts part = new Parts(aPartNo, aDescription, aPrice, aWarehouseID, aQuantity);

list.add(part);

line = reader.readLine();

}

reader.close();

return list;

}

}

class WareHouse implements Comparable{

private String warehouseID;

private String state;

private String city;

public WareHouse(String aWarehouseID, String aState, String aCity) {

super();

warehouseID = aWarehouseID;

state = aState;

city = aCity;

}

public String getWarehouseID() {

return warehouseID;

}

public void setWarehouseID(String aWarehouseID) {

warehouseID = aWarehouseID;

}

public String getState() {

return state;

}

public void setState(String aState) {

state = aState;

}

public String getCity() {

return city;

}

public void setCity(String aCity) {

city = aCity;

}

// sorting the Warehouses based in the ID

@Override

public int compareTo(Object aO) {

WareHouse obj =(WareHouse)aO;

return this.getWarehouseID().compareTo(obj.getWarehouseID());

}

}

class Parts{

private String partNo;

private String description;

private double price;

private String warehouseID;

private int quantity;

public Parts(String aPartNo, String aDescription, double aPrice, String aWarehouseID, int aQuantity) {

super();

partNo = aPartNo;

description = aDescription;

price = aPrice;

warehouseID = aWarehouseID;

quantity = aQuantity;

}

public String getPartNo() {

return partNo;

}

public void setPartNo(String aPartNo) {

partNo = aPartNo;

}

public String getDescription() {

return description;

}

public void setDescription(String aDescription) {

description = aDescription;

}

public double getPrice() {

return price;

}

public void setPrice(double aPrice) {

price = aPrice;

}

public String getWarehouseID() {

return warehouseID;

}

public void setWarehouseID(String aWarehouseID) {

warehouseID = aWarehouseID;

}

public int getQuantity() {

return quantity;

}

public void setQuantity(int aQuantity) {

quantity = aQuantity;

}

}
