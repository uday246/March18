package Mar20th;

import java.util.Scanner;

public class Conversions {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	int ch=0;
	double input=0;
	while(flag){
	System.out.println("1 Length");
	System.out.println("2 Volume");
	System.out.println("3 Temperature");
	System.out.println(" 4 Exit");
	ch = sc.nextInt();
		switch(ch){
		// for length conversions
		case 1:
			System.out.println("You have chosen length conversion.");
			System.out.println("Conversion options:");
			System.out.println("1 Inches to centimeters");
			System.out.println("2 Centimeters to inches");
			ch = sc.nextInt();
			if(ch==1){
				System.out.println("Enter the number of inches");
				input = sc.nextDouble();
				System.out.println(input+" Inches is equal to "+(input*2.45)+" centimeters");
			}
			else{
				System.out.println("Enter the number of centimeters");
				input = sc.nextDouble();
				System.out.println(input+" centimeters is equal to "+(input*0.39)+" Inches ");
			}
			break;
			// for volume conversions
		case 2:
			System.out.println("You have chosen volume conversion.");
			System.out.println("Conversion options:");
			System.out.println("1 gallons to liters");
			System.out.println("2 liters to gallons");
			ch = sc.nextInt();
			if(ch==1){
				System.out.println("Enter the number of gallons");
				input = sc.nextDouble();
				System.out.println(input+" gallons is equal to "+(input*3.78)+" liters");
			}
			else{
				System.out.println("Enter the number of liters");
				input = sc.nextDouble();
				System.out.println(input+" liters is equal to "+(input*0.26)+" gallons ");
			}
			break;
		// for temparature conversions
		case 3:
			System.out.println("You have chosen temparature conversion.");
			System.out.println("Conversion options:");
			System.out.println("1 Fahrenheit  to celsius");
			System.out.println("2 celsius to Fahrenheit ");
			ch = sc.nextInt();
			if(ch==1){
				System.out.println("Enter the number of Fahrenheit ");
				input = sc.nextDouble();
				System.out.println(input+" Fahrenheit  is equal to "+(input-32) * 5.0 / 9.0+" celsius");
			}
			else{
				System.out.println("Enter the number of celsius");
				input = sc.nextDouble();
				System.out.println(input+" celsius is equal to "+(input * 9.0 / 5.0 + 32)+" Fahrenheit  ");
			}
			break;
		case 4:
			flag = false;
			
		}
	
	}
}
}
