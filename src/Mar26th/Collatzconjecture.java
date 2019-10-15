package Mar26th;

import java.util.Scanner;

/*
 * Logic : if number s even than divide it into half
 * if number is odd than multiply with 3 and add 1 3*num+1
 * repeat until num reach 1
 */
public class Collatzconjecture {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number : ");
		int start=sc.nextInt();

		System.out.println("Enter second number : ");
		int end=sc.nextInt();
		
		int count1=0;
		int count2=0;
		
		int res = 0;
		
		int temp =0;
		if(start>end)
		{
			temp=start;
			start = end;
			end = temp;
		}
		int tempStart=start;
		while(tempStart<=end){
			count1 = getCollatzConjectureCount(tempStart);
			tempStart++;
			if(count1>count2)
				count2 = count1;
		}
		res = (count1>count2)?count1:count2;
		System.out.println();
		System.out.println("Maximum Cycle between "+start+" and "+end+" is : "+res);
		
	}
	// repeating the loop untill it reaches 1
	public static int getCollatzConjectureCount(int num){
		int count=1;
		while(num>1){
			count++;
			if(num%2==0)
				num/=2;
			else
				num = num *3+1;
		}
		return count;
	}
}

