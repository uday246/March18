package chapter10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shipping {
	static int zipcode[] = { 75672, 75601, 73344, 75507, 75011, 75780, 75846, 75773, 75456, 75975 };
	static Scanner sc = new Scanner(System.in);

	static  double prices[][] = { { 1.86, 4.99, 10.85, 18.67 }, { 1.99, 5.86, 11.23, 20.10 }, { 2.13, 6.10, 12.14, 21.45 },
			{ 1.86, 4.99, 10.85, 18.67 }, { 2.10, 5.98, 10.98, 19.95 }, { 1.85, 4.59, 10.63, 17.75 },
			{ 1.93, 4.92, 10.67, 18.55 }, { 2.86, 6.99, 12.85, 21.67 }, { 2.36, 6.23, 11.96, 19.48 },
			{ 1.99, 5.99, 10.99, 19.99 }, { 3.09, 7.21, 13.25, 22.35 }

	};
	public static void main(String[] args) {
		List<List<String>>shipments = new ArrayList<List<String>>();
		
		while(true){
			int code = 0;
			double weight =0;
			System.out.println("Enter Zip Code");
			code = sc.nextInt();
			System.out.println("Enter Weight");
			weight = sc.nextDouble();
			double res= getPrice(code,weight);
			String ch="";
			// if we got price as -1 than we will not ship to that code so we need ask the user again
			if(res==-1){
				sc.nextLine();
				System.out.println("We do not ship to that zip code. Would you like to try another? y or n");
				ch=sc.nextLine();
				if(ch.equalsIgnoreCase("n")){
					break;
				}
			}
			else{
				System.out.println("Price for shipping is : "+res);
				sc.nextLine();
				System.out.println("Do you wish to create shipment");
				ch=sc.nextLine();
				if(ch.equalsIgnoreCase("n")){
					break;
				}
				List<String> temp = new ArrayList<String>();
				System.out.println("Please enter the first name Name");
				temp.add(sc.nextLine());
				System.out.println("Please enter the last name Name");
				temp.add(sc.nextLine());
				
				System.out.println("Please enter street Name");
				temp.add(sc.nextLine());
				System.out.println("Please enter city Name");
				temp.add(sc.nextLine());
				System.out.println("Please enter state Name");
				temp.add(sc.nextLine());
				temp.add(code+"");
				temp.add(weight+"");
				temp.add(res+"");
				shipments.add(temp);
				System.out.println("would like to ship another package? y or n : ");
				ch=sc.nextLine();
				if(ch.equalsIgnoreCase("n")){
					break;
				}
				
				
				
			}
		}
		for(List<String>l:shipments){
			System.out.println(l);
		}
	}
// this method will return the price for the give code and weight, if give code is not available than it will return -1
	private static double  getPrice(int aCode, double aWeight) {
		int index =-1;
		for(int i=0;i<zipcode.length;i++)
			if(zipcode[i]==aCode){
				index = i;
				break;
			}
		if(index==-1)
			return -1.0;
		if(aWeight<5)
			return prices[index][0];
		if(aWeight>= 5 && aWeight<10)
			return prices[index][1];
		if(aWeight>= 10 && aWeight<20)
			return prices[index][2];
		if(aWeight>= 20)
			return prices[index][3];
		return -1;
		
	}

}
