import java.util.Scanner;

public class MassDensity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mass = 0.0;
		double density = 0.0;
		System.out.println("Please enter the mass");
		mass = sc.nextDouble();

		System.out.println("Please enter the Density");
		density = sc.nextDouble();
		double volume = mass/density;
		System.out.printf("Volume is : %.2f", volume);

	}
}
class A { 
	protected int method1(int a, int b) 
	{ 
		return 0; 
		}
	}
class B extends A{
	 
	 
}

