package chapter10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		// Declaring constant
		final double PI = 3.14159;

		// Declaring variables
		double radius, area, circumference, surfaceArea, volume;

		// Scanner object is used to get the inputs entered by the user
		Scanner sc = new Scanner(System.in);

		// DecimalFormat class is used to format the output
		DecimalFormat df = new DecimalFormat("#.##");

		// getting the radius entered by the user
		System.out.print("Enter the radius of the circle ;");
		radius = sc.nextDouble();

		// calculating the area of the circle
		area = PI * radius * radius;

		// calculating the circumference of the circle
		circumference = 2 * PI * radius;

		// calculating the surface area of the sphere
		surfaceArea = 4 * PI * radius * radius;

		// calculating the volume of the sphere
		volume = (4.0 / 3.0) * PI * radius * radius * radius;

		// Displaying the results
		System.out.println("Area of the Circle is :" + df.format(area));
		System.out.println("Circumference of the Circle :" + df.format(circumference));
		System.out.println("Surface Area of the Sphere :" + df.format(surfaceArea));
		System.out.println("Volume of the Sphere :" + df.format(volume));
		sc.close();

	}

}