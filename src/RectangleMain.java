// created Rectangle class with height and width
class Rectangle {
	private double width;
	private double height;
// constructor which takes arguments widht and height
	public Rectangle(double aWidth, double aHeight) {
		super();
		width = aWidth;
		height = aHeight;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double aWidth) {
		width = aWidth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double aHeight) {
		height = aHeight;
	}
	public double getArea(){
		return width*height;
	}
// to string returns widht and height of Rectangle
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
public class RectangleMain {
	public static void main(String[] args) {
		Rect r = new Rect();
		r.addRect(new Rectangle(10, 5));
		r.addRect(new Rectangle(8, 5));
		r.addRect(new Rectangle(43, 52));
		r.addRect(new Rectangle(21, 12));
		r.addRect(new Rectangle(45, 21));
		r.addRect(new Rectangle(54, 21));
		System.out.println("Rect with Small area : "+r.getRectangleWithSmallestArea());

	}
}