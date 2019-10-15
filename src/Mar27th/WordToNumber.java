package Mar27th;

import java.util.Scanner;

public class WordToNumber {
	public static void main(String[] args) {
		String[] units = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty",
				"Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 40, 50, 60, 70, 80,
				90 };
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String arr[]=str.split(" ");
		for(int j=0;j<arr.length;j++)
		for (int i = 0; i < units.length; i++) {
			if (arr[j].toLowerCase().contains(units[i].toLowerCase())) {
				System.out.print(numbers[i]+" ");
			}
		}

	}

}
