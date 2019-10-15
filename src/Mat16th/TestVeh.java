package Mat16th;

class Vehicle {
	int wheels;

	public Vehicle(int aWheels) {
		super();
		wheels = aWheels;
	}

	@Override
	public String toString() {
		return "Wheels : " + wheels;
	}

}

class Truck extends Vehicle {
	private double loadCapacity;

	public Truck(int aWheels, double aLoadCapacity) {
		super(aWheels);
		loadCapacity = aLoadCapacity;
	}

	public double getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(double aLoadCapacity) {
		loadCapacity = aLoadCapacity;
	}

	@Override
	public String toString() {
		return super.toString() + " loadCapacity : " + loadCapacity;
	}

}

class Car extends Vehicle {
	private String dieselType;

	public Car(int aWheels, String aDieselType) {
		super(aWheels);
		dieselType = aDieselType;
	}

	void setDieselType(String b) {
		dieselType = b;
	}

	String getDieselType() {
		return dieselType;
	}

	@Override
	public String toString() {
		return super.toString()+ " DieselType : " + dieselType;
	}

}

public class TestVeh {
	public static void main(String[] args) {
		Vehicle v[] = new Vehicle[2];
		v[0] = new Car(4, "Petrol");
		v[1] = new Truck(4, 100);
		for (Vehicle v1 : v)
			System.out.println(v1);

	}
}
