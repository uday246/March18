import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recipe {

	private String recipeName;

	private double totalRecipeCalories;

	private ArrayList<String> recipeIngredients;

	private int servings;

	public Recipe() {

		this.recipeName = "";

		this.servings = 0;

		this.recipeIngredients = new ArrayList<>();

		this.totalRecipeCalories = 0;

	}

	public Recipe(String recipeName, int servings, ArrayList<String> recipeIngredients, double totalRecipeCalories) {

		this.recipeName = recipeName;

		this.servings = servings;

		this.recipeIngredients = recipeIngredients;

		this.totalRecipeCalories = totalRecipeCalories;

	}

	public String getRecipeName() {

		return recipeName;

	}

	public void setRecipeName(String recipeName) {

		this.recipeName = recipeName;

	}

	public double getTotalRecipeCalories() {

		return totalRecipeCalories;

	}

	public void setTotalRecipeCalories(double totalRecipeCalories) {

		this.totalRecipeCalories = totalRecipeCalories;

	}

	public ArrayList<String> getRecipeIngredients() {

		return recipeIngredients;

	}

	public void setRecipeIngredients(ArrayList<String> recipeIngredients) {

		this.recipeIngredients = recipeIngredients;

	}

	public int getServings() {

		return servings;

	}

	public void setServings(int servings) {

		this.servings = servings;

	}

	public void printRecipe() {

		int singleServingCalories = (int) (totalRecipeCalories / servings);

		System.out.println("Recipe: " + recipeName);

		System.out.println("Serves: " + servings);

		System.out.println("Ingredients:");

		for (String ingredient : recipeIngredients) {

			System.out.println(ingredient);

		}

		System.out.println("Each serving has " + singleServingCalories + " Calories.");

	}

	public static void main(String[] args) {

		double totalRecipeCalories = 0;

		ArrayList<String> recipeIngredients = new ArrayList<String>();

		boolean addMoreIngredients = true;

		Scanner scnr = new Scanner(System.in);
		boolean flag = true;

		int ch = 0;
		List<Recipe> list = new ArrayList<Recipe>();

		while (flag) {

			System.out.println("1.Add Receipe");
			System.out.println("2.Print  Receipe Names");
			System.out.println("3.Print Receipe details");
			System.out.println("4.Quit");
			
			ch = scnr.nextInt();
			scnr.nextLine();
			if (ch == 1) {

				System.out.println("Please enter the recipe name: ");

				String recipeName = scnr.nextLine();

				System.out.println("Please enter the number of servings: ");

				int servings = scnr.nextInt();

				do {

					System.out.println("Please enter the ingredient name"

							+ " or type end if you are finished entering ingredients: ");

					String ingredientName = scnr.next();

					if (ingredientName.toLowerCase().equals("end")) {

						addMoreIngredients = false;

					} else {

						recipeIngredients.add(ingredientName);

						System.out.println("Please enter the ingredient amount: ");

						float ingredientAmount = scnr.nextFloat();

						System.out.println("Please enter the ingredient Calories: ");

						int ingredientCalories = scnr.nextInt();

						totalRecipeCalories += (ingredientCalories * ingredientAmount);

					}

				} while (addMoreIngredients);

				Recipe recipe1 = new Recipe(recipeName, servings, recipeIngredients, totalRecipeCalories);
				list.add(recipe1);
				// recipe1.printRecipe();

			}

			if (ch == 2) {
				for (Recipe e : list)
					System.out.println(e.recipeName);
			}
			if (ch == 3) {
				for (Recipe e : list)
					e.printRecipe();
			}
			if(ch==4)
				flag = false;
		}
		scnr.close();
	}
}