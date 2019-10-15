import java.util.ArrayList;
import java.util.Scanner;

class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pro, qua = 1;
		boolean flag = true;
		double price = 0;
		// for storing the products and its quantites
		ArrayList<Integer> product = new ArrayList<Integer>();
		ArrayList<Integer> quantity = new ArrayList<Integer>();

		while (flag) {
			System.out.println("Enter Product number : ");
			pro = sc.nextInt();
			switch (pro) {
			case 1:
				System.out.println("Enter Product 1 Quantity : ");
				qua = sc.nextInt();
				price = price + (qua * 2.98);
				product.add(pro);
				quantity.add(qua);
				break;
			case 2:
				System.out.println("Enter Product 2 Quantity : ");
				qua = sc.nextInt();
				price = price + (qua * 4.50);
				product.add(pro);
				quantity.add(qua);
				break;
			case 3:
				System.out.println("Enter Product 3 Quantity : ");
				qua = sc.nextInt();
				price = price + (qua * 9.98);
				product.add(pro);
				quantity.add(qua);
				break;

			case 4:
				System.out.println("Enter Product 4 Quantity : ");
				qua = sc.nextInt();
				price = price + (qua * 4.49);
				product.add(pro);
				quantity.add(qua);
				break;
			case 5:
				System.out.println("Enter Product 5 Quantity : ");
				qua = sc.nextInt();
				price = price + (qua * 6.87);
				product.add(pro);
				quantity.add(qua);
				break;
			default:
				flag = false;
				break;
			}
		}
		// disaply the selected products
		for(int i=0;i<product.size();i++){
			System.out.println("Product "+product.get(i)+" : "+quantity.get(i));
		}
		System.out.println("Total Cost : "+price);
		sc.close();
	}
}