package Mat16th;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

interface Command {
	public void execute();

	public void undo();
}
class Dimensions{
	double x;
	double y;
	double width;
	double height;
	public Dimensions(double aX, double aY, double aWidth, double aHeight) {
		super();
		x = aX;
		y = aY;
		width = aWidth;
		height = aHeight;
	}
	public double getX() {
		return x;
	}
	public void setX(double aX) {
		x = aX;
	}
	public double getY() {
		return y;
	}
	public void setY(double aY) {
		y = aY;
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
	
}
class CommandPattern implements Command{
	Rectangle rect = new Rectangle(0,0,0,0);
	List<Dimensions> operations = new ArrayList<Dimensions>();
	// This is using store the user operation to perform the undo operation. as we need to store the x,y,width,height 
	//so I am taking simple java class to store all these values for each operation
	@Override
	public void execute() {
		// did't clear about this method if require please mention in the comments 
	}

	@Override
	public void undo() {
		
		// undo means we should get back to the recent operation that we performed so here I am taking the last operation object
		// which contains the last operation values and setting these values to the rectangle
		if(operations.size()>0){
			Dimensions lastOperation = operations.get(operations.size()-1);
			operations.remove(operations.size()-1);
			rect.setLocation((int)lastOperation.getX(), (int)lastOperation.getY());
			rect.setSize((int)lastOperation.getWidth(), (int)lastOperation.getHeight());
			
		}
		printData();
	}
	public void move(int x,int y) {
		// before changing the values we need to keep track of these values in list
		operations.add(new Dimensions(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight()));
		rect.setLocation(x, y);
		printData();
	}
	public void resize(int w,int h) {
		// before changing the values we need to keep track of these values in list
		operations.add(new Dimensions(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight()));
		rect.setSize(w, h);
		printData();
	}
	
	public void printData(){
		System.out.println("Description : Width : "+rect.getWidth()+" Height : "+rect.getHeight()+" : X : "+rect.getX()+" Y : "+rect.getY());
	}
	
}
public class TestSimulator{
	public static void main(String[] args) {
		CommandPattern rectangle1 = new CommandPattern();
		CommandPattern rectangle2 = new CommandPattern();
		rectangle1.move(5, 10);
		rectangle1.undo();
		rectangle1.resize(5, 10);
		rectangle2.resize(8, 12);
		rectangle2.move(10, 20);
		rectangle1.undo();
		rectangle2.undo();
		
		
	}
}