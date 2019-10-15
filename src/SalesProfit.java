import java.util.Scanner;
/*
 * Step1: Read sales from user
 * Step2: Multiply the sales with .62 as it has 62% profits
 * 
 */
public class SalesProfit {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sales ");
		int sales=sc.nextInt();
		System.out.println("This year the East Coast Division will generate $"+sales*.62 +"in sales.");
	}
}
