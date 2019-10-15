package May19;

interface Edible {
	String howToEat();
}

abstract class Food {
	private double weight;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double aWeight) {
		weight = aWeight;
	}

	abstract boolean isVegetarian();
}

class Chicken extends Food implements Edible {

	@Override
	public String howToEat() {
		return "Fry It";
	}

	@Override
	boolean isVegetarian() {
		return false;
	}

}

class Banana extends Food implements Edible {

	@Override
	public String howToEat() {
		return "Peel the skin";
	}

	@Override
	boolean isVegetarian() {
		return true;
	}

}

class Orange extends Food {

	@Override
	boolean isVegetarian() {
		return true;
	}

}

class Pizza implements Edible {

	@Override
	public String howToEat() {
		return "Slice and eat";
	}
}

public class TestFood {

}
