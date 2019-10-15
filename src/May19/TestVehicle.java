package May19;

class Vehicle {

	private String maker;
	private int model;

	public Vehicle(String aMaker, int aModel) {
		super();
		maker = aMaker;
		model = aModel;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String aMaker) {
		maker = aMaker;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int aModel) {
		model = aModel;
	}

}

class Car extends Vehicle {

	private int numDoors;
	private String color;

	public Car(String aMaker, int aModel, int aNumDoors, String aColor) {
		super(aMaker, aModel);
		numDoors = aNumDoors;
		color = aColor;
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int aNumDoors) {
		numDoors = aNumDoors;
	}

	public String getColor() {
		return color;
	}

	public void chageCarColor(String aColor) {
		color = aColor;
	}

	@Override
	public String toString() {
		return getMaker() + " : " + getModel() + " : " + numDoors + " : " + color;
	}

}

public class TestVehicle {
	public static void main(String[] args) {
		Car c = new Car("Honda", 2018, 4, "Red");
		System.out.println(c);
		c.chageCarColor("Green");
		System.out.println(c);
		
	}
}
