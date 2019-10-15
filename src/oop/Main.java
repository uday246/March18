package oop;

public class Main {
	private int firstNumber;
	private int secondNumber;

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int aFirstNumber) {
		firstNumber = aFirstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int aSecondNumber) {
		secondNumber = aSecondNumber;
	}

	public int getSum() {
		return firstNumber + secondNumber;
	}

	public double getAverage() {
		return (firstNumber + secondNumber) / 2.0;
	}

	public int getDifference() {
		return firstNumber - secondNumber;
	}

	public int getProduct() {
		return firstNumber * secondNumber;
	}

	public int getDistance() {
		return Math.abs(firstNumber - secondNumber);
	}

	public int getMaximum() {
		return (firstNumber > secondNumber) ? firstNumber : secondNumber;
	}

	public int getMinimum() {
		return (firstNumber < secondNumber) ? firstNumber : secondNumber;
	}

	public void printStats() {
		System.out.println("Sum : " + getSum());
		System.out.println("Average : " + getAverage());
		System.out.println("Difference: " + getDifference());
		System.out.println("Product : " + getProduct());
		System.out.println("Distance : " + getDistance());
		System.out.println("Maximum : " + getMaximum());
		System.out.println("Minimum: " + getMinimum());
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.setFirstNumber(25);
		m.setSecondNumber(20);
		//m.printStats();
		char c='-';
		System.out.println((int)c);
	}
}
