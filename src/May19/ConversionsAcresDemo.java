package May19;

import java.util.Scanner;

class ConversionsAcres  {
	double arr[];

	public ConversionsAcres(double[] aArr) {
		super();
		arr = aArr;
	}

	public double getTotal() {
		double sum = 0;
		for (double d : arr){
			sum =sum+ d;
		}
		return sum;
	}

	public double convertToHectors() {
		return getTotal() * 0.4;
	}
}

public class ConversionsAcresDemo  {
	public static void main(String[] args) {
		double arr[] = new double[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Please enter the total acres for item " + (i + 1));
			arr[i] = sc.nextDouble();
		}
		sc.close();
		ConversionsAcres c = new ConversionsAcres(arr);
		System.out.println("The total gallons converted is: " + c.getTotal());
		System.out.printf("The total liters converted is: %.2f" , c.convertToHectors());
	}
}
