package mat25;

import java.awt.Graphics;

public class UdayCompoundInterest {
	public static void main(String[] args) {
		System.out.printf("Your total is $%.2f", computeBalance(1000, .045, 3));

		// should return $1141.17

		System.out.printf("\nYour total is $%.2f", computeBalance(2000, .03, 5));

		// should return $2318.55
		Graphics g=null;
		System.out.printf("\nYour total is $%.2f", computeBalance(3000, .01, 10));
	}

	private static double computeBalance(double principle, double rate, int time) {
		double amount = principle* Math.pow(1.0 + rate, time);
		return amount;
	}
}
