package H7;

import java.math.BigDecimal;
import java.util.Scanner;

class Compare {
boolean compFloat2(double aa,double bb){
	/*
	 * I am using big decimal class to set the decimal values to certain precision
	 */
	BigDecimal num1 = new BigDecimal(aa);
	BigDecimal num2 = new BigDecimal(bb);
	num1 = num1.setScale(2, BigDecimal.ROUND_DOWN);
	num2 = num2.setScale(2, BigDecimal.ROUND_DOWN);
	return num1.equals(num2);
}
boolean compFloat5(double aa,double bb){
	/*
	 * I am using big decimal class to set the decimal values to certain precision
	 */
	BigDecimal num1 = new BigDecimal(aa);
	BigDecimal num2 = new BigDecimal(bb);
	num1 = num1.setScale(5, BigDecimal.ROUND_DOWN);
	num2 = num2.setScale(5, BigDecimal.ROUND_DOWN);
	return num1.equals(num2);
}
boolean compInt(int num1,int num2){
	return num1==num2;
}
boolean stringEqual(String str1,String str2){
	return str1.equals(str2);
}
boolean stringCompare(String str1,String str2){
	/*
	 * if str1 > str2, it returns positive number  
	   if str1 < str2, it returns negative number  
	   if str1 == str2, it returns 0  
	 */
	return str1.compareTo(str2)>0;
		
}
}
public class ComparisonTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 double values");
		double d1 =  sc.nextDouble();
		double d2 =  sc.nextDouble();
		Compare comp = new Compare();
		boolean areTheyEqual = comp.compFloat2(d1, d2);
		System.out.println("The two doubles are equal up to two decimal points : "+areTheyEqual);
		areTheyEqual = comp.compFloat5(d1, d2);
		System.out.println("The two doubles are equal up to five decimal points : "+areTheyEqual);
		System.out.println("Enter 2 integer values");
		int i1 =  sc.nextInt();
		int i2 =  sc.nextInt();
		areTheyEqual = comp.compInt(i1, i2);
		System.out.println("The two Integers are equal : "+areTheyEqual);
		
		System.out.println("Enter two String values");
		sc.nextLine();
		String str1=  sc.nextLine();
		String str2=  sc.nextLine();
		areTheyEqual = comp.stringEqual(str1, str2);
		System.out.println("The two Strings are equal : "+areTheyEqual);
		areTheyEqual = comp.stringCompare(str1, str2);
		System.out.println("Str1 greater than Str2 : "+areTheyEqual);
		sc.close();
	}
}
