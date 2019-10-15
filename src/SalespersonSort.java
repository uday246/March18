import java.util.Scanner;

class Salesperson {
	private int id;
	private double sales;

	Salesperson(int idNum, double amt) {
		id = idNum;
		sales = amt;
	}

	public int getId() {
		return id;
	}

	public double getSales() {
		return sales;
	}

	public void setId(int idNum) {
		id = idNum;
	}

	public void setSales(double amt) {
		sales = amt;
	}

	public String toString() {
		return id + ": " + sales;
	}
}

public class SalespersonSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Salesperson arr[] = new Salesperson[7];
		for (int i = 0; i < 7; i++) {
			System.out.println("Enter sales person ID and sales");
			Salesperson s = new Salesperson(sc.nextInt(), sc.nextDouble());
			arr[i] = s;
		}
		System.out.println("How you want sort the array?\n1 Sory By Id\n2 Sort by sales?");
		int ch = sc.nextInt();
		if (ch == 1) {
			sortByID(arr);
		} else {
			sortBySales(arr);
		}
		for(Salesperson s: arr)
			System.out.println(s);
	}

	private static void sortBySales(Salesperson[] arr) {
		int i, j;
		int n = arr.length;
		Salesperson temp;
		// outer loop to travel through the all elements
		for (i = 0; i < n - 1; i++) {
			// inner loop to compare the outer loop elements
			for (j = 0; j < n - i - 1; j++)
				// if element at j< than j+1 than swap both
				if (arr[j].getSales() > arr[j + 1].getSales()) {
					// swap logic
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		}
	}

	private static void sortByID(Salesperson[] arr) {
		int i, j;
		int n = arr.length;
		Salesperson temp;
		// outer loop to travel through the all elements
		for (i = 0; i < n - 1; i++) {
			// inner loop to compare the outer loop elements
			for (j = 0; j < n - i - 1; j++)
				// if element at j< than j+1 than swap both
				if (arr[j].getId() > arr[j + 1].getId()) {
					// swap logic
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		}
	}

	// sortByID()

	// sortBySales()

}