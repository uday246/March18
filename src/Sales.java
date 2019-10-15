import java.util.Scanner;

public class Sales {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//reading sales and profit percentage
		System.out.print("Projected total sales: $");
		double totalSales = sc.nextDouble();
		System.out.print("Profit margin: : ");
		double profitMargin = sc.nextDouble();
		//finding proft
		double gross = totalSales * (profitMargin / 100);
		//findin tax
		double tax = gross * 0.15;
		//finding net amount
		double net = gross - tax;
		System.out.println("Projected total sales: $" + totalSales);
		System.out.println("Profit margin: : " + profitMargin + " %");
		System.out.println("Tax rate: " + 15 + "%");
		System.out.println("Amount of tax paid:$" + tax);
		System.out.println("Estimated net profit: $" + net);

	}
}
