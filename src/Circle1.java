import java.util.Scanner;

public class Circle1 {

	public static void main(String[] args) {

		// creating radius for circle

		Circle myCircle = new Circle();

		double r;

		// scanner for user input

		Scanner input = new Scanner(System.in);

		// user input for radius

		System.out.print("Enter radius: ");

		r = input.nextInt();

		myCircle.setRadius(r);
		// calling getInfo to display
		myCircle.getInfo();
		

		// need to use getInfo method to display Area, Diameter, and
		// Circumference

	}// end main method

	// create getInfo method to display the circle information
	public void getInfo() {
		System.out.println("Area: " + getArea());

		System.out.println("Diameter: " + getDiameter());

		System.out.println("Circumference: " + getCircumference());
	}

	// class Circle2 data field

	class Circle2 {

	}

	// declarations

	double radius;

	double pi = 3.14159;

	// Constructor no-arg

	Circle() {

		radius = 0.0;

	}

	// constructor radii arg.

	Circle(double newRadii) {

		radius = newRadii;

	}

	// mutator function

	void setRadius(double newRadii) {

		radius = newRadii;

	}

	// radius function

	double getRadius() {

		return radius;

	}

	// area calculation

	double getArea() {

		return radius * radius * pi;

	}

	// diameter calculation

	double getDiameter() {

		return radius * 2;

	}

	// circumference calculation

	double getCircumference() {

		return 2 * pi * radius;

	}

}//