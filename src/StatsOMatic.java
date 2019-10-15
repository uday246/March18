import java.util.Random;
import java.util.Scanner;

public class StatsOMatic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int size = sc.nextInt();
		Random r = new Random();
		double arr[] = new double[size];
		for(int i=0;i<size;i++){
			arr[i] = r.nextDouble()*1000;
		}
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
		
		DescriptiveStatistics des = new DescriptiveStatistics(arr);
		System.out.println(des.getStats());
		double stats[] = des.getStatsArray();
		System.out.println();
		System.out.println();
		System.out.println("Number of elements in array : " + stats[0] + "\n Min element in the array :" + stats[1]
				+ "\n Max element in the array : " + stats[2] + "\nAverage of elements " + stats[3]
						+ "\n Median of array " + stats[4]);
		sc.close();
	}
}

final class DescriptiveStatistics {
	private double elements[];
	private double stats[];

	public DescriptiveStatistics() {
		stats = new double[5];
	}

	public DescriptiveStatistics(double ele[]) {
		this();
		elements = ele;
		findStats();
	}
// finds all the stats min,max,average,median
	private void findStats() {
		double min = elements[0], max = elements[0], sum = elements[0];
		stats[0] = elements.length;
		// finds min,max,avg
		for (int i = 1; i < elements.length; i++) {
			if (elements[i] < min)
				min = elements[i];
			if (elements[i] > max)
				max = elements[i];
			sum += elements[i];
		}
		stats[1] = min;
		stats[2] = max;
		stats[3] = sum / elements.length;
		if (elements.length % 2 != 0)
			stats[4] = elements[elements.length / 2];
		else
			stats[4] = (elements[(elements.length - 1) / 2] + elements[elements.length / 2]) / 2.0;
	}

	public String getStats() {
		return "Number of elements in array : " + stats[0] + "\n Min element in the array :" + stats[1]
				+ "\n Max element in the array : " + stats[2] + "\nAverage of elements " + stats[3]
						+ "\n Median of array " + stats[4];

	}
	public double[]getStatsArray(){
		return stats;
	}

}
