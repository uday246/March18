package oop;

interface ThreeDShape {
	double area();
}

class Cube implements ThreeDShape {
	private int side;

	public Cube(int aSide) {
		super();
		side = aSide;
	}
	// returns the area of Cube
	@Override
	public double area() {
		return 6 * side * side;
	}

}

class Sphere implements ThreeDShape {
	private double radius;

	public Sphere(double r) {
		super();
		radius = r;
	}

	// returns the area of Sphere
	@Override
	public double area() {
		return 4 / 3 * Math.PI * radius * radius * radius;
	}

}

public class TestThreeDShape {
	public static void main(String[] args) {
		ThreeDShape t;
		t = new Cube(5);
		System.out.println("Area of Cube : " + t.area());
		t = new Sphere(3);
		System.out.println("Area of Sphere: " + t.area());

	}
}
