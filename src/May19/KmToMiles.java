package May19;

import java.util.Scanner;

public class KmToMiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double kilometers;
		double miles;
		String repeat = "YES";
		String ch="YES";
		while(repeat.equalsIgnoreCase(ch)){
			kilometers=getValidKM();
			miles=calculateMiles(kilometers);
			displayResults(kilometers, miles);
			System.out.println("Do you want continue? YES");
				ch=sc.nextLine();
		}
	}

	public static double getValidKM() {
		double d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of kilometers: ");
		do {
			d = sc.nextDouble();
		} while (d < 0);
		sc.nextLine();
		sc.close();
		return d;
	}

	public static double calculateMiles(double km) {
		return km * 0.62137119;
	}

	public static void displayResults(double k, double m) {
		System.out.println("Kilometers: " + k + ", Miles : " + m);
	}
}
