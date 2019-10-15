import java.util.Scanner;

abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with color and filled value */
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Return filled. Since filled is boolean, the get method is named isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
}

// -----------------------CIRCLE-----------------------
class Circle extends GeometricObject {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override /** Return area */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}

	@Override /** Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/* Print the circle info */
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}
}

class ComparableCircle extends Circle implements Comparable {

	@Override
	// compareTo method which is used to compare the area of 2 circles
	public int compareTo(Object aO) {
		Circle c1 = (Circle) aO;
		if (c1.getArea() < this.getArea())
			return 1;
		else if (c1.getArea() > this.getArea())
			return -1;
		return 0;
	}

}

public class TestCircle {
	public static void main(String[] args) {
		ComparableCircle cc1 = new ComparableCircle();
		ComparableCircle cc2 = new ComparableCircle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter circle 1 radius");
		double r1 = sc.nextDouble();
		System.out.println("Enter circle 2 radius");
		double r2 = sc.nextDouble();
		cc1.setRadius(r1);
		cc2.setRadius(r2);
		System.out.println(cc1.compareTo(cc2));
		sc.close();

	}
}
