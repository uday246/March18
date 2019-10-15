package May19;

import java.util.Scanner;

public class Foothill {
	// food #1 constants
	static final String FOOD_1_NAME = "Apples, raw, without skin";
	static final double FOOD_1_PROTEIN_P100G = 0.3; // in grams
	static final double FOOD_1_VITAMIN_C_P100G = 0.004; // in grams
	static final double FOOD_1_FAT_P100G = 0.0001; // in grams
	static final double FOOD_1_WATER_P100G = 86.7; // in grams
	// food #2 constants
	static final String FOOD_2_NAME = "Lettuce, cos or romaine, raw";
	static final double FOOD_2_PROTEIN_P100G = 1.2; // in grams
	static final double FOOD_2_VITAMIN_C_P100G = 0.0024; // in grams
	static final double FOOD_2_FAT_P100G = 0.0003; // in grams
	static final double FOOD_2_WATER_P100G = 94.6; // in grams
	// food #3 constants
	static final String FOOD_3_NAME = "Spinach, raw";
	static final double FOOD_3_PROTEIN_P100G = 2.9; // in grams
	static final double FOOD_3_VITAMIN_C_P100G = 0.028; // in grams
	static final double FOOD_3_FAT_P100G = 0.0004; // in grams
	static final double FOOD_3_WATER_P100G = 91.4; // in grams
	// food #4 constants
	static final String FOOD_4_NAME = "Cheese, mozzarella, whole milk";
	static final double FOOD_4_PROTEIN_P100G = 22.2; // in grams
	static final double FOOD_4_VITAMIN_C_P100G = 0; // in grams
	static final double FOOD_4_FAT_P100G = 22.4; // in grams
	static final int FOOD_4_WATER_P100G = 50; // in grams
	// food #5 constants
	static final String FOOD_5_NAME = "Fish, salmon, Atlantic, farmed, raw";
	static final double FOOD_5_PROTEIN_P100G = 20.4; // in grams
	static final double FOOD_5_VITAMIN_C_P100G = 0.0039; // in grams
	static final double FOOD_5_FAT_P100G = 13.4; // in grams
	static final double FOOD_5_WATER_P100G = 64.9; // in grams

	static final String INDENT = " ";
	static final String SEPARATOR = "\n";

	static String RECIPE_NAME; // hold the recipe name
	static double TOTAL_PROTEIN = 0; // total calories of the recipe
	static double TOTAL_VITAMIN_C = 0; // total soluble fiber of the recipe
	static double TOTAL_FAT = 0; // total carbohydrate of the recipe
	static double TOITAL_WATER = 0; // total fat of the recipe
	static int SERVINGS = 0; // how many serving the recipe is

	public static void main(String[] args) {
		String recipeName, userInputStr, inputString;
		int userInputInt = 0;
		double inputNum1, inputNum2;
		Scanner inputStream = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);

		// print menu
		System.out.println("---------- List of Possible Ingredients ---------");
		System.out.println(INDENT + "Food #1: " + FOOD_1_NAME);
		System.out.println(INDENT + "Food #2: " + FOOD_2_NAME);
		System.out.println(INDENT + "Food #3: " + FOOD_3_NAME);
		System.out.println(INDENT + "Food #4: " + FOOD_4_NAME);
		System.out.println(INDENT + "Food #5: " + FOOD_5_NAME + SEPARATOR);

		// name of recipe
		System.out.print("What are you calling this recipe ? ");
		recipeName = inputStream.nextLine();

		// ask the user how many the serving is
		System.out.print("\nEnter the number of servings (Integer):\n ");
		inputString = keyboard.nextLine();
		userInputInt = Integer.parseInt(inputString);
		if (userInputInt < 1 || userInputInt > 10)
			outOfRangeError(); // check range
		SERVINGS = (int) userInputInt;

		// food #1 ---------------------------------------------------------
		System.out.print("How many grams of " + FOOD_1_NAME + "? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr);

		// update accumulators
		TOTAL_PROTEIN += userInputInt * (FOOD_1_PROTEIN_P100G / 100.);
		TOTAL_VITAMIN_C += userInputInt * (FOOD_1_VITAMIN_C_P100G / 100.);
		TOTAL_FAT += userInputInt * (FOOD_1_FAT_P100G / 100.);
		TOITAL_WATER += userInputInt * (FOOD_1_WATER_P100G / 100.);

		// food #2 ---------------------------------------------------------
		System.out.print("How many grams of " + FOOD_2_NAME + "? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr);

		// update accumulators
		TOTAL_PROTEIN += userInputInt * (FOOD_2_PROTEIN_P100G / 100.);
		TOTAL_VITAMIN_C += userInputInt * (FOOD_2_VITAMIN_C_P100G / 100.);
		TOTAL_FAT += userInputInt * (FOOD_2_FAT_P100G / 100.);
		TOITAL_WATER += userInputInt * (FOOD_2_WATER_P100G / 100.);
		;
		;

		// food #3 ---------------------------------------------------------
		System.out.print("How many grams of " + FOOD_3_NAME + "? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr);
		// update accumulators
		TOTAL_PROTEIN += userInputInt * (FOOD_3_PROTEIN_P100G / 100.);
		TOTAL_VITAMIN_C += userInputInt * (FOOD_3_VITAMIN_C_P100G / 100.);
		TOTAL_FAT += userInputInt * (FOOD_3_FAT_P100G / 100.);
		TOITAL_WATER += userInputInt * (FOOD_3_WATER_P100G / 100.);
		;

		// food #4 ---------------------------------------------------------
		System.out.print("How many grams of " + FOOD_4_NAME + "? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr);

		// update accumulators
		TOTAL_PROTEIN += userInputInt * (FOOD_4_PROTEIN_P100G / 100.);
		TOTAL_VITAMIN_C += userInputInt * (FOOD_4_VITAMIN_C_P100G / 100.);
		TOTAL_FAT += userInputInt * (FOOD_4_FAT_P100G / 100.);
		TOITAL_WATER += userInputInt * (FOOD_4_WATER_P100G / 100.);
		;
		// food #5 ---------------------------------------------------------
		System.out.print("How many grams of " + FOOD_5_NAME + "? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr);

		// update accumulators
		TOTAL_PROTEIN += userInputInt * (FOOD_5_PROTEIN_P100G / 100.);
		TOTAL_VITAMIN_C += userInputInt * (FOOD_5_VITAMIN_C_P100G / 100.);
		TOTAL_FAT += userInputInt * (FOOD_5_FAT_P100G / 100.);
		TOITAL_WATER += userInputInt * (FOOD_5_WATER_P100G / 100.);
		;

		// report results --------------------------------------------------
		System.out.println("\nNutrition for " + recipeName + "------------");
		System.out.println(INDENT + "Protein: " + TOTAL_PROTEIN);
		System.out.println(INDENT + "Vitaminc: " + TOTAL_VITAMIN_C * 100 + "mg");
		System.out.println(INDENT + "Fat: " + TOTAL_FAT);
		System.out.println(INDENT + "Water: " + TOITAL_WATER);
	}

	private static void outOfRangeError() {
		System.out.println("Error! The input you entered is out of range.");
		exit();
	}

	private static void checkInputErrors(double input) {
		if (input < 0) {
			System.out.println("Error! wrong input. please read the " + "direction above and try again.");
		}
	}

	private static void exit() {
		System.out.println("Program shutted down.");
		System.exit(1);
	}

	private static int checkAnswer(String input) {
		int output = -1;
		for (int counter = 0; counter <= INDENT.length() - 1; counter += 1) {
			if (input.equals(INDENT)) {
				output = counter;
			}
		}
		return output;
	}
}