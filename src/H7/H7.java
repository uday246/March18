package H7;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * here i am taking a pojo class because we need return 2 values from the AlterH2, from method we can't return values
 * 1) we can use arraylist to add  2 values and return that arralist
 * 2) we can write 2 separate methods get the values 
 * 3) here I am using simple class which an hold 2 values 
 */
public class H7 {

	public static void main(String[] args) {

		int lenght;

		int width;

		int height;

		final double costPerGallon = 43.50;

		double sqFeetPerGallon = 600;

		Scanner key = new Scanner(System.in);

		System.out.println("Please enter lenght");

		lenght = key.nextInt();

		System.out.println("Please enter width");

		width = key.nextInt();

		System.out.println("Please enter height");

		height = key.nextInt();
		
	    DecimalFormat Format = new DecimalFormat ("####.##");


		Result res = AlterH2(height, width, lenght, sqFeetPerGallon, costPerGallon);

		System.out.print("The area that needs to be painted is:");

		System.out.println(Format.format(res.roomArea) + " square feet");

		System.out.print("Total cost of the paint is: $");

		System.out.println(Format.format(res.totalCost));
		
		res = AlterH2(10, 20, 30, 10.5, 10.4);
		
		System.out.print("The area that needs to be painted is:");

		System.out.println(Format.format(res.roomArea) + " square feet");

		System.out.print("Total cost of the paint is: $");

		System.out.println(Format.format(res.totalCost));
		
		key.close();

	}

	public static Result AlterH2(int height, int width, int lenght, double sqFeetPerGallon, double costPerGallon)

	{

		

		int wallarea = (lenght * height) * 2;

		int otherwall = (width * height) * 2;

		int roomarea = otherwall + wallarea;

		sqFeetPerGallon = roomarea / 600.0;

		double totalcost = sqFeetPerGallon * 43.50;
// Setting the values to result object and returning that object
		Result res = new Result(roomarea, totalcost);
		return res;
		
	}

}
class Result{
	int roomArea;
	double totalCost;
	public Result(int aRoomArea, double aTotalCost) {
		roomArea = aRoomArea;
		totalCost = aTotalCost;
	}
	
	
}