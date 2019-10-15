package May19;

public class FindDouble {
	public static int search(double arr[], double ele, double tolerance) {
		double min = ele - tolerance;
		double max = ele + tolerance;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= min && arr[i] <= max)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		double arr[] = { 5, 5.2, 7.2, 5.3, 5.4, 5.9, 6 };
		System.out.println(search(arr, 5.5, 0.1));
	}
}
