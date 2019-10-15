import java.util.Scanner;

class Sale {
	private String invoice;
	private double price;
	private double discount;
	private double salesTax = 0.08;

	public Sale(String aInvoise, double aPrice, double aDiscount) {
		super();
		invoice = aInvoise;
		price = aPrice;
		discount = aDiscount;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String aInvoise) {
		invoice = aInvoise;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double aPrice) {
		price = aPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double aDiscount) {
		discount = aDiscount;
	}

	public double getSalesTax() {
		return salesTax;
	}

	// returns total after discount + tax
	public double getTotalAmountAfterDiscount() {
		double total = price - price * (discount / 100.0);
		total = total * (getSalesTax() + 1);
		return total;
	}

	// returns the tax amoount
	public double getTaxAmount() {
		double total = price - price * (discount / 100.0);
		return total * salesTax;
	}

	// returns discount amount
	public double getDiscountAmount() {
		return price * (discount / 100.0);
	}
}

public class TestSales {
	public static void main(String[] args) {
		int flag = 1;
		Scanner sc = new Scanner(System.in);
		double total=0;
		while (flag == 1) {
			System.out.println("Enter Invoice no");
			String invoice = sc.next();
			System.out.println("Please Enter the item Price");
			double price = sc.nextDouble();
			System.out.println("Please Enter the sale discount as whole number , ten percent would be 10");
			double discount = sc.nextDouble();

			Sale s = new Sale(invoice, price, discount);
			System.out.println("Invoice #" + s.getInvoice() + " Price of the Item : $" + s.getPrice());
			System.out.println("Discount subtracted: $" + s.getDiscountAmount() + " Tax rate : " + s.getSalesTax()
					+ " Tax : $" + s.getTaxAmount());
			System.out.printf("Discount price including tax : $%.2f", s.getTotalAmountAfterDiscount());
			total +=s.getTotalAmountAfterDiscount();
			System.out.println();
			System.out.println("Do you want to continue ? Yes=1 or No =0");
			flag = sc.nextInt();

		}
		System.out.println();
		System.out.println("Your total sales receipts is :$"+total);
		sc.close();
	}
}
