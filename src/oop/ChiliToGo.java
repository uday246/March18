package oop;

import java.util.Scanner;

class ChiliToGo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of adult meals: ");
		int adultMeals = in.nextInt();
		System.out.print("Enter the number of child meals: ");
		int childMeals = in.nextInt();

		double childMealsPrice = childMeals * 4;
		double adultMealsPrice = adultMeals * 7;

		System.out.println("Total price of child meals = $" + childMealsPrice);
		System.out.println("Total price of adult meals = $" + adultMealsPrice);
		System.out.println("Total amount = $" + (childMealsPrice + adultMealsPrice));
	}
}
