import javax.swing.JOptionPane;

public class Exponent {
	public static void main(String[] args) {
		String m = JOptionPane.showInputDialog("Enter number ");
		// converting string to double
		double num = Double.parseDouble(m);
		// showing the output
		JOptionPane.showMessageDialog(null,"Showing result with static method : "+findSquare(num));  
		JOptionPane.showMessageDialog(null,"Showing result with non-static method : "+new Exponent().findSquare1(num));  

	}
	// static method to find the square 
	private static double findSquare(double aNum) {
		return aNum * aNum;
	}
	//method to find the square
	private double findSquare1(double aNum) {
		return aNum * aNum;
	}

}
