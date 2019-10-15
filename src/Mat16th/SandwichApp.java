package Mat16th;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SandwichApp {
	public static void main(String[] args) {
		String bread, meat = null;
		String[] vegetable = new String[10];
		int n;
		String option = "y";
		Prices.initializePrices();
		Scanner in = new Scanner(System.in);
		while (option.equals("y") || option.equals("Y")) {
			System.out.println("=== Select Sandwich Bread: ===");

			Map<String, Double> breads = Prices.breads;
			Map<String, Double> vegetables = Prices.vegetables;
			Map<String, Double> meats = Prices.meats;
			int i = 0;
			for (Entry<String, Double> ent : breads.entrySet()) {
				System.out.println(++i + " " + ent.getKey() + " " + ent.getValue());
			}
			int num = 0;
			System.out.println("Please enter a number between 1 and 4");
			num = in.nextInt();
			while (num < 1 || num > 4) {
				System.out.println("Invalid Input!\nPlease enter a number between 1 and 4");
				num = in.nextInt();	
			} 
			if (1 == num)
				bread = "White Bread";
			else if (2 == num)
				bread = "Organic Bread";
			else if (3 == num)
				bread = "French Bread";
			else
				bread = "Wheat Bread";
			boolean flag = true;
			i = 0;
			int j = 0;
			while (flag) {
				System.out.println("=== Select Sandwich Vegetables: ===");
				for (Entry<String, Double> ent : vegetables.entrySet()) {
					System.out.println(++i + " " + ent.getKey() + " " + ent.getValue());
				}
				System.out.println("Please enter a number between 1 and 8");
				n = in.nextInt();
				while (n < 1 || n > 8) {
					System.out.println("Invalid Input!..\nPlease enter a number between 1 and 8");
					n = in.nextInt();
				}

				if (1 == n)
					vegetable[j++] = "tomatoes";
				else if (2 == n)
					vegetable[j++] = "green peppers";
				else if (3 == n)
					vegetable[j++] = "red onions";
				else if (4 == n)
					vegetable[j++] = "olives";
				else if (5 == n)
					vegetable[j++] = "pickles";
				else if (6 == n)
					vegetable[j++] = "lettuce";
				else if (7 == n)
					vegetable[j++] = "cheese";
				else
					flag = false;
				i = 0;
			}
			System.out.println("=== Select Sandwich Meat: ===");
			for (Entry<String, Double> ent : meats.entrySet()) {
				System.out.println(++i + " " + ent.getKey() + " " + ent.getValue());
			}
			System.out.println("Please enter a number between 1 and 5");
			int m = in.nextInt();
			while (m < 1 || m > 5) {
				System.out.println("Invalid Input!..\nPlease enter a number between 1 and 5");
				m = in.nextInt();
			}

			if (1 == m)
				meat = "Roasted Chicken Breast";
			else if (2 == m)
				meat = "Ham";
			else if (3 == m)
				meat = "Roast Beef";
			else if (4 == m)
				meat = "Turkey Breast";
			else if (5 == m)
				meat = null;
			System.out.println("Enter Customer Name");
			String name = in.nextLine();
			Sandwich sandwich = new Sandwich(bread, vegetable, meat);
			Date now = new Date();
			DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
			String time = defaultDate.format(now);
			OrderLine order = new OrderLine(name, sandwich, time);
			try {
				order.placeOrder();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Continue to order more sandwich?");
			option = in.nextLine();
			;
		}

	}

}

class Sandwich {
	String bread;
	String[] vegetables;
	String meat;
	Float price;

	public Sandwich(String bread, String[] vegetables, String meat) {
		this.bread = bread;
		this.vegetables = vegetables;
		this.meat = meat;
	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String[] getVegetables() {
		return vegetables;
	}

	public void setVegetables(String[] vegetables) {
		this.vegetables = vegetables;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}

class OrderLine {
	String customerName;
	Sandwich sandwich;
	String timestamp;

	OrderLine(String name, Sandwich sandwich, String time) {
		this.customerName = name;
		this.sandwich = sandwich;
		this.timestamp = time;
	}

	void placeOrder() throws IOException {
		Double price = Prices.getPrice(this.sandwich);
		writeOrder(this.sandwich, this.timestamp, price);
	}

	private void writeOrder(Sandwich sandwich, String timestamp, double price) throws IOException {
		File file = new File("orderline.txt");
		if (!file.exists())
			file.createNewFile();
		try (FileWriter fw = new FileWriter("orderline.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.print(timestamp + " " + this.customerName + " " + sandwich.bread + " ");
			String[] vegs = sandwich.vegetables;
			for (String v : vegs) {
				if (null != v)
					out.print(v + " ");
			}
			out.print(sandwich.meat + " $" + price + "\n");

		} catch (IOException e) {
		}

	}
}

class Prices {
	public static Map<String, Double> breads = new HashMap<String, Double>();
	public static Map<String, Double> vegetables = new HashMap<String, Double>();
	public static Map<String, Double> meats = new HashMap<String, Double>();

	public static void initializePrices() {
		breads.put("White Bread", 1.5);
		breads.put("Wheat Bread", 1.8);
		breads.put("French Bread", 2.0);
		breads.put("Organic Bread", 2.3);
		vegetables.put("red onions", 0.10);
		vegetables.put("olives", 0.10);
		vegetables.put("pickles", 0.10);
		vegetables.put("lettuce", 0.20);
		vegetables.put("green peppers", 0.25);
		vegetables.put("tomatoes", 0.30);
		vegetables.put("cheese", 0.49);
		meats.put("Ham", 0.9);
		meats.put("Roasted Chicken Breast", 0.9);
		meats.put("Turkey Breast", 0.9);
		meats.put("Roast Beef", 0.9);
	}

	public static double getPrice(Sandwich sandwich) {
		double bread = breads.get(sandwich.bread);
		double meat = 0.0;
		double veg = 0.0;
		if (null != sandwich.meat)
			meat = meats.get(sandwich.meat);
		String[] vegs = sandwich.vegetables;
		for (String v : vegs) {
			if (null != v && !v.isEmpty())
				veg += vegetables.get(v);
		}
		return (bread + meat + veg);
	}

}
