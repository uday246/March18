package visitor2;

public class AreaOfCircle {
	private double radius;

	public AreaOfCircle(double aRadius) {
		super();
		radius = aRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double aRadius) {
		radius = aRadius;
	}

	// calculates the area of circle
	public double circleArea() {
		return Math.PI * radius * radius;
	}
	// calculates the Circumference of circle
	public double circleCircumference() {
		return 2 * Math.PI * radius * radius;
	}
	// displays the information
	public void show(){
		System.out.println("Area of circle : "+circleArea());
		System.out.println("Circumference of circle : "+circleCircumference());
	}
}
