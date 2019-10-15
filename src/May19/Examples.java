package May19;

public class Examples {
	public static void main(String[] args) {
		double d = 10.5;
		int i = (int) d; // here we are casting the double type value to the
							// integer
		// so here 5 it primitive int type but we are assigning to the Integer
		// class
		// This is called boxing primitive to Object
		Integer a = 5;

		Integer in = new Integer(10);
		// Here in is an Object of type Integer class
		// we are assigning object to an int type this is called unboxing
		int b = in;

	}
}
// Sub classing example
// here Dog class extending the Animal class
abstract class Animal {
	// instance variable
	private int legs;

	// parametrized constructor
	public Animal(int legs) {
		this.legs = legs;
	}

	/**
	 * getter method
	 */
	public int getLegs() {
		return this.legs;
	}

	/**
	 * setter method
	 */
	public void setLegs(int legs) {
		this.legs = legs;
	}

	/**
	 * concrete method named walk
	 */
	public void walk() {
		System.out.println("This animals walks on " + this.legs + "legs");
	}

	public abstract void eat();

	public abstract void sound();

}

class Dog extends Animal {
	public Dog() {
		super(4);
	}

	@Override
	public void eat() {
		System.out.println("dogs eat meat and small amount of vegetable matter");
	}

	@Override
	public void sound() {
		System.out.println("Dogs: bark, bark, bark");
	}
}