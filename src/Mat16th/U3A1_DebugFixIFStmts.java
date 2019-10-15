package Mat16th;

import java.util.Scanner;

/**
 *
 * @author omora
 */
public class U3A1_DebugFixIFStmts {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here

		System.out.println("Teacher's Copy");

		Scanner input = new Scanner(System.in);

		// prompt the user to enter 3 ints
		// and read them into
		// firstChoice
		//secondChoice
		//thirdChoice
		System.out.println("Enter three integers:");
		int firstChoice = 0;
		int secondChoice = 0;
		int thirdChoice = 0;
		// loops user enters valid number
		do{
			System.out.println("Enter first num in range (1-7)");
			firstChoice = input.nextInt();
		}while(firstChoice<1 || firstChoice>7);
		do{
			System.out.println("Enter second num in range (1-7)");
			secondChoice = input.nextInt();
			}while(secondChoice<1 || secondChoice>7);
		do{
			System.out.println("Enter third num in range (1-7)");
			thirdChoice = input.nextInt();
			}while(thirdChoice<1 || thirdChoice>7);
			
		//Determine & print the state of choices made
		if (firstChoice == 0)
			System.out.println("State of choices: \n" +
					"no choices made yet");
		if (secondChoice == 0)
			System.out.println("State of choices: \n" +
					"user made first choice (" + firstChoice + ")\n" +
					"number of choices = 1");
	// changed = to ==, = is used to assign the values and == is used to compare the values
		else if (thirdChoice == 0)
			System.out.println("State of choices: \n" +
					"user made first choice (" + firstChoice + ")\n" +
					"user made second choice (" + secondChoice + ")\n" +
					"number of choices = 2");

		// ; missed
		System.out.println("State of choices: \n" +
				"user made first choice (" + firstChoice + ")\n" +
				"user made second choice (" + secondChoice + ")\n" +
				"user made third choice (" + thirdChoice + ")\n" +
				"number of choices = 3");
	}

}