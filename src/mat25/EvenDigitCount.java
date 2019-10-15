package mat25;

import java.util.Scanner;

public class EvenDigitCount {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	System.out.println(num+" has "+countEvenDigits(num)+" even digits");
}

private static int countEvenDigits(int aNum) {
	int count=0;
	// looping until number becomes zero
	while(aNum>0){
		// extract the last digit
		if(aNum%10%2==0)
			count++;
		// removing the last digit
		aNum/=10;
	}
	return count;
}
}
