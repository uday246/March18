package mat25;

import java.util.ArrayList;
import java.util.Scanner;

class Recipe {

	private String recipeName;
	private int servings;
	private ArrayList recipeIngredients;
	private double totalRecipeCalories;

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public ArrayList getRecipeIngredients() {
		return recipeIngredients;
	}

	/**
	 * @param recipeIngredients
	 *            the recipeIngredients to set
	 */
	public void setRecipeIngredients(ArrayList recipeIngredients) {
		this.recipeIngredients = recipeIngredients;
	}

	public double getTotalRecipeCalories() {
		return totalRecipeCalories;
	}

	public void setTotalRecipeCalories(double totalRecipeCalories) {
		this.totalRecipeCalories = totalRecipeCalories;
	}

	public Recipe() {
		this.recipeName = "";
		this.servings = 0;
		this.recipeIngredients = new ArrayList<>();
		this.totalRecipeCalories = 0;
	}

	public Recipe(String recipeName, int servings, ArrayList recipeIngredients, double totalRecipeCalories) {
		this.recipeName = recipeName;
		this.servings = servings;
		this.recipeIngredients = recipeIngredients;
		this.totalRecipeCalories = totalRecipeCalories;
	}

	public void printRecipe() {
		double singleServingCalories = totalRecipeCalories / servings;
		System.out.println("Recipe: " + getRecipeName());
		System.out.println("Yield: " + getServings() + " servings");
		System.out.println("Ingredients:");

		for (int i = 0; i < recipeIngredients.size(); i++) {
			Ingredient currentIngredient = (Ingredient) recipeIngredients.get(i);
			String currentIngredientName = currentIngredient.getIngredientName();
			System.out.println(currentIngredientName);
		}
		System.out.println("Total Calories per serving: " + singleServingCalories);
	}

	public Recipe createNewRecipe() { // Comment out for Stepping Stone 6
		// public Recipe createNewRecipe() { //uncomment for Stepping Stone 6
		double totalRecipeCalories = 0;
		ArrayList recipeIngredients = new ArrayList();
		boolean addMoreIngredients = true;
		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter the recipe name: ");
		String recipeName = scnr.nextLine();

		System.out.println("How many servings: ");
		int servings = scnr.nextInt();

		do {
			System.out.println("Please enter the ingredient name or type 'e' if you are done: ");
			String ingredientName = scnr.next();
			if (ingredientName.toLowerCase().equals("e")) {
				addMoreIngredients = false;
			}

			else {
				Ingredient tempIngredient = new Ingredient().addIngredient(ingredientName);
				recipeIngredients.add(tempIngredient);
			}
		} while (addMoreIngredients);

		for (int i = 0; i < recipeIngredients.size(); i++) {
			Ingredient currentIngredient = (Ingredient) recipeIngredients.get(i);
			float ingredientAmount = currentIngredient.getIngredientAmount();
			int ingredientCalories = currentIngredient.getIngredientCalories();
			double ingredientTotalCalories = ingredientAmount * ingredientCalories;
			totalRecipeCalories += ingredientTotalCalories;
		}
		Recipe newRecipe = new Recipe(recipeName, servings, recipeIngredients, totalRecipeCalories);
		// newRecipe.printRecipe();//comment out for Stepping Stone 6
		return newRecipe; // uncomment for Stepping Stone 6

	}

}

class Ingredient {
	private String nameOfIngredient;
	private float numberCups;
	private int numberCaloriesPerCup;
	private double totalCalories;

	/**
	 * @return the nameOfIngredient
	 */
	public String getNameOfIngredient() {
		return nameOfIngredient;
	}

	public int getIngredientCalories() {
		return numberCaloriesPerCup;
	}

	public float getIngredientAmount() {
		return numberCups;
	}

	public String getIngredientName() {
		return nameOfIngredient;
	}

	/**
	 * @param nameOfIngredient
	 *            the nameOfIngredient to set
	 */
	public void setNameOfIngredient(String nameOfIngredient) {
		this.nameOfIngredient = nameOfIngredient;
	}

	/**
	 * @return the numberCups
	 */
	public float getNumberCups() {
		return numberCups;
	}

	/**
	 * @param numberCups
	 *            the numberCups to set
	 */
	public void setNumberCups(float numberCups) {
		this.numberCups = numberCups;
	}

	/**
	 * @return the numberCaloriesPerCup
	 */
	public int getNumberCaloriesPerCup() {
		return numberCaloriesPerCup;
	}

	/**
	 * @param numberCaloriesPerCup
	 *            the numberCaloriesPerCup to set
	 */
	public void setNumberCaloriesPerCup(int numberCaloriesPerCup) {
		this.numberCaloriesPerCup = numberCaloriesPerCup;
	}

	/**
	 * @return the totalCalories
	 */
	public double getTotalCalories() {
		return totalCalories;
	}

	/**
	 * @param totalCalories
	 *            the totalCalories to set
	 */
	public void setTotalCalories(double totalCalories) {
		this.totalCalories = totalCalories;
	}

	public Ingredient() {
		this.nameOfIngredient = "";
		this.numberCups = 0;
		this.numberCaloriesPerCup = 0;
		this.totalCalories = 0.0;
	}

	public Ingredient(String nameOfIngredient, float numberCups, int numberCaloriesPerCup, double totalCalories) {
		this.nameOfIngredient = nameOfIngredient;
		this.numberCups = numberCups;
		this.numberCaloriesPerCup = numberCaloriesPerCup;
		this.totalCalories = totalCalories;
	}

	public Ingredient addIngredient(String tempNameOfIngredient) {
		// tempNameOfIngredient = tempNameOfIngredient;
		float tempNumberCups;
		int tempNumberCaloriesPerCup;
		double tempTotalCalories;
		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter the name of the ingredient: ");
		tempNameOfIngredient = scnr.next();

		System.out.println("Please enter the number of cups of " + nameOfIngredient + " we'll need: ");
		tempNumberCups = scnr.nextFloat();

		System.out.println("Please enter the name of calories per cup: ");
		tempNumberCaloriesPerCup = scnr.nextInt();

		tempTotalCalories = numberCups * numberCaloriesPerCup;

		Ingredient tempNewIngredient = new Ingredient(tempNameOfIngredient, tempNumberCups, tempNumberCaloriesPerCup,
				tempTotalCalories);
		return tempNewIngredient;
	}
}

public class ReceipeBox {
	private ArrayList<Recipe> listOfRecipes;

	public ArrayList<Recipe> getListOfRecipes() {
		return listOfRecipes;
	}

	public void setListOfRecipes(ArrayList<Recipe> listOfRecipes) {
		this.listOfRecipes = listOfRecipes;
	}

	public ReceipeBox(ArrayList<Recipe> listOfRecipes) {
		this.listOfRecipes = listOfRecipes;
	}

	public ReceipeBox() {
		this.listOfRecipes = new ArrayList<>();
	}

	void printAllRecipeDetails(String selectedRecipe) {
		for (Recipe recipe : listOfRecipes) {
			if (recipe.getRecipeName().equalsIgnoreCase(selectedRecipe)) {
				recipe.printRecipe();
				return;
			}
		}
		System.out.println("No Recipe found with name: " + selectedRecipe);
	}

	void printAllRecipeNames() {
		listOfRecipes.forEach((selectedRecipe) -> {
			System.out.println(selectedRecipe.getRecipeName());
		});
	}

	public void addRecipe(Recipe tempRecipe) {
		listOfRecipes.add(tempRecipe);
	}

	public static void main(String[] args) {
		ReceipeBox myRecipeBox = new ReceipeBox();
		Scanner menuScnr = new Scanner(System.in);
		System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n"
				+ "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
		while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {
			int input = menuScnr.nextInt();
			switch (input) {
			case 1:
				myRecipeBox.recipe1();
				break;
			case 2:
				System.out.println("Which recipe?\n");
				String selectedRecipeName = menuScnr.next();
				myRecipeBox.printAllRecipeDetails(selectedRecipeName);
				break;
			case 3:
				for (int j = 0; j < myRecipeBox.listOfRecipes.size(); j++) {
					System.out.println((j + 1) + ": " + myRecipeBox.listOfRecipes.get(j).getRecipeName());
				}
				break;
			default:
				System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n"
						+ "\nPlease select a menu item:");
				break;
			}
			System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n"
					+ "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
		}
	}

	public void recipe1() {
		double totalRecipeCalories = 0.0;
		ArrayList<String> recipeIngredients = new ArrayList();
		boolean addMoreIngredients = true;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter the recipe name: "); // prompt user to
																// enter recipe
																// name.
		String recipeName = scnr.nextLine(); // checks if valid input was
												// entered.
		System.out.println("Please enter the number of servings: "); // prompt
																		// user
																		// to
																		// enter
																		// number
																		// of
																		// servings
																		// for
																		// recipe.
		int servings = scnr.nextInt(); // checks if valid input was entered.
		do {
			System.out
					.println("Please enter the ingredient name or type end if you are finished entering ingredients: ");
			String ingredientName = scnr.next().toLowerCase();
			if (ingredientName.toLowerCase().equals("end")) {
				addMoreIngredients = false;
			} else {
				recipeIngredients.add(ingredientName); // creating array list
														// for recipe
														// ingredients.
				System.out.println("Please enter an ingredient amount: ");
				float ingredientAmount = scnr.nextFloat();
				System.out.println("Please enter the measurement unit for an ingredient: ");
				String unitMeasurement = scnr.next();
				System.out.println("Please enter ingredient calories: ");
				int ingredientCalories = scnr.nextInt();
				totalRecipeCalories = (ingredientCalories * ingredientAmount);
				System.out.println(ingredientName + " uses " + ingredientAmount + " " + unitMeasurement + " and has "
						+ totalRecipeCalories + " calories.");
			} // end else loop.
		} while (addMoreIngredients);
		Recipe recipe = new Recipe(recipeName, servings, recipeIngredients, totalRecipeCalories);
		addRecipe(recipe);
	}
}