package oop;

import java.util.Scanner;

public class Pal{
public static void main(String[] args) {
	String str1="";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string: ");
	str1=sc.nextLine();
	while(!str1.equals("")){
		boolean isPalindrome=true;
		int index=0;
		while(index<str1.length()-1 && isPalindrome){
			int end=str1.length()-1-index;
			if(str1.charAt(index)!=str1.charAt(end)){
				isPalindrome=false;
				break;
			}
			index++;
		}
		if(isPalindrome)
			System.out.println(str1+" is Palidrome");
		else
			System.out.println(str1+" is not aPalidrome");
		
		System.out.println("Enter a string: ");
		str1=sc.nextLine();
				
		}
	}
}
