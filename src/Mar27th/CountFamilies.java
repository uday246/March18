package Mar27th;

import java.util.Scanner;

public class CountFamilies {

	public static void main(String[] args) {
		
			int numberOfFamilies = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the number of families");
			numberOfFamilies = sc.nextInt();
			int incomes [] = new int[numberOfFamilies];
			// reading the family income
			for(int i=0;i<numberOfFamilies;i++){
				System.out.println("Enter an income : ");
				incomes[i] = sc.nextInt();
			}
			int max=getMaximum(incomes);
			System.out.println("Max income is : "+max);
			System.out.println();
			System.out.println("The incomes of families making less than 10% of the maximum are:");
			int count = 0;
			for(int i=0;i<incomes.length;i++){
				if(incomes[i]<(max*.1)){
					count++;
					System.out.println(incomes[i]);
				}
			}
			if(count>1)
				System.out.println("for a total of "+count+" families");
			else
				System.out.println("for a total of "+count+" family");
				
			sc.close();
	}
	// will find and return the max income from the given array

	public static int getMaximum(int[] incomes) {
		int max=incomes[0];
		for(int i=0;i<incomes.length;i++){
			if(incomes[i]>max){
				max = incomes[i];
			}
		}		
		return max;
	}

}
