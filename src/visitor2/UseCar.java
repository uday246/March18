package visitor2;

import java.util.ArrayList;

class Car {
	private String make;
	private String model;
	private int year;
	private double price;
	private CarOwner owner;

	Car() {

	}

	public Car(String aMake, String aModel, int aYear, double aPrice, CarOwner o) {
		super();
		make = aMake;
		model = aModel;
		year = aYear;
		price = aPrice;
		owner = o;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String aMake) {
		make = aMake;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String aModel) {
		model = aModel;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int aYear) {
		year = aYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double aPrice) {
		price = aPrice;
	}

	public CarOwner getOwner() {
		return owner;
	}

	public void setOwner(CarOwner aOwner) {
		owner = aOwner;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + ", owner=" + owner
				+ "]";
	}

}

class CarOwner {
	private String name;
	private String address;

	CarOwner() {

	}

	public CarOwner(String aName, String aAddress) {
		super();
		name = aName;
		address = aAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String aAddress) {
		address = aAddress;
	}

	@Override
	public String toString() {
		return "CarOwner [name=" + name + ", address=" + address + "]";
	}

}

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car("Honda", "Civic", 2018, 60000, new CarOwner("Uday", "Hyderabad"));
		Car c2 = new Car("Volkswagon", "Polo", 2018, 70000, new CarOwner("Koti", "Hyderabad"));
		Car c3 = new Car("Hyundai", "I20", 2019, 90000, new CarOwner("Chinna", "Hyderabad"));
		ArrayList<Car> list = new ArrayList<Car>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		for (Car c : list)
			System.out.println(c);

	}
}
