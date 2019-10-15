import java.util.Arrays;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class StringTokenizerEx {
	public static void main(String[] args) {

		String in = "";

		// Create a String delim for specifying the delimiter (separator).

		String delim = ",";

		// Create an int count to get token count from StringTokenizer.

		int count = 0;

		// Create a String token to get token value from the StringTokenizer.

		String token = "";

		// Get user input in String in

		in = JOptionPane.showInputDialog

		("Enter data values separated by spaces and/or commas");

		// Create StringTokenizer and supply it with String in and String delim

		StringTokenizer st = new StringTokenizer(in, delim);

		// Get token count from StringTokenizer

		count = st.countTokens();

		// Create an array data of size count.

		double[] data = new double[count];

		// Set up a for loop to go arount count times.

		// In each pass through the loop, get the next token from
		// StringTokenizer.

		// Convert token into a double and store it in corresponding array
		// element.
		double sum=0;
		for (int i = 0; i < count; i++)

		{

			token = st.nextToken();
			// trim the token

			// trim removes all leading and trailing spaces.

			token = token.trim();

			data[i] = Double.parseDouble(token);
			sum+=data[i];
		}
		System.out.print("Original Data : ");
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
		Arrays.sort(data);
		System.out.println();
		System.out.print("Sorted Data : ");
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
		System.out.println();
		System.out.printf("Min Element : %.3f\n",data[0]);
		System.out.printf("Max Element :%.3f\n",data[data.length-1]);
		double median = 0;
		if(data.length%2==0)
		{
			median = data[data.length/2]+data[data.length/2-1];
			median /=2;
		}
		else{
			median = data[data.length/2];
		}
		System.out.printf("Mean : %.3f\n",sum/data.length);
		System.out.printf("Median :%.3f\n",median);
	}
}
