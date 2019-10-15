package May19;

import javax.swing.JOptionPane;

public class ProductsPrices {
	public static void main(String[] args) {
		int arr[][] = new int[100][2];
		int size = getProductsAndPrices(arr);
		displayProducts(arr, size);

	}

	private static void displayProducts(int[][] aArr, int aSize) {
		for (int i = 0; i < aSize; i++)
			System.out.println(aArr[i][0] + " : " + aArr[i][1]);
	}

	private static int getProductsAndPrices(int[][] arr) {
		int size = 0;
		for (int i = 0; i < 100;) {
			int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Product ID (-1 to exit)"));
			if (id == -1)
				break;
			int price = Integer.parseInt(JOptionPane.showInputDialog("Enter Product price"));
			while (id <= 0 || price <= 0) {
				JOptionPane.showMessageDialog(null, "Values must be greater than 0");
				id = Integer.parseInt(JOptionPane.showInputDialog("Enter Product ID (-1 to exit)"));
				if (id == -1)
					break;
				price = Integer.parseInt(JOptionPane.showInputDialog("Enter Product price"));
			}
			arr[i][0] = id;
			arr[i][1] = price;
			size++;
			i++;
		}
		return size;
	}
}
