import java.util.Arrays;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

class Statistics {
	public static int count;
	double data[];

	public Statistics(double[] aData) {
		super();
		data = aData;
		count++;
	}

	public static double[] computeSortedData(double[] data) {
		Statistics st = new Statistics(data);
		data = st.sortArray(data);
		return data;
	}

	private double[] sortArray(double[] aData) {
		Arrays.sort(aData);
		return aData;
	}

	public static double computeMin(double[] data) {
		Statistics st = new Statistics(data);

		// Ask Statistics object to find min of the array passed during
		// creation.

		double min = st.findMin();

		// return min to the caller

		return min;
	}

	private double findMin() {
		double min = data[0];
		for (int i = 1; i < data.length; i++)
			if (data[i] < min)
				min = data[i];
		return min;
	}

	public static double computeMax(double[] data) {
		Statistics st = new Statistics(data);

		// Ask Statistics object to find min of the array passed during
		// creation.

		double min = st.findMax();

		// return min to the caller

		return min;
	}

	private double findMax() {
		double max = data[0];
		for (int i = 1; i < data.length; i++)
			if (data[i] < max)
				max = data[i];
		return max;
	}

	public static double computeMean(double[] data) {
		Statistics st = new Statistics(data);

		// Ask Statistics object to find min of the array passed during
		// creation.

		double min = st.findMean();

		// return min to the caller

		return min;
	}

	private double findMean() {
		double sum = 0;
		for (int i = 0; i < data.length; i++)
			sum += data[i];
		sum /= 2;
		return sum;
	}

	public static double computeMedian(double[] data) {
		Statistics st = new Statistics(data);

		// Ask Statistics object to find min of the array passed during
		// creation.

		double min = st.findMedian();

		// return min to the caller

		return min;
	}

	private double findMedian() {
		double median = 0;
		if (data.length % 2 == 0) {
			median = data[data.length / 2] + data[data.length / 2 - 1];
			median /= 2;
		} else {
			median = data[data.length / 2];
		}
		return median;
	}

}

public class TestStatistics {
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
		for (int i = 0; i < count; i++)

		{

			token = st.nextToken();
			// trim the token

			// trim removes all leading and trailing spaces.

			token = token.trim();

			data[i] = Double.parseDouble(token);
		}
		System.out.println("Original Data");
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
		System.out.println();
		
		data = Statistics.computeSortedData(data);
		System.out.println("Sorted Data");
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
		System.out.println();
		System.out.printf("Min Element : %.3f\n",Statistics.computeMin(data));
		System.out.printf("Max Element :%.3f\n",Statistics.computeMax(data));
		System.out.printf("Mean : %.3f\n",Statistics.computeMean(data));
		System.out.printf("Median :%.3f\n",Statistics.computeMedian(data));
		System.out.println("No Of objects created : "+Statistics.count);
	}
}
