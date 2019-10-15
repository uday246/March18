import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter base of the triangle");
			double base = sc.nextDouble();
			System.out.println("Enter height of triangle");
			double height = sc.nextDouble();
			System.out.println("Area of triangle with base = "+base+",height = "+height+" is = "+(base*height/2));
			sc.close();
			
	}

}
