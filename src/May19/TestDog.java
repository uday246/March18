package May19;

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

public class TestDog {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.eat();
		a.sound();
	}
}
