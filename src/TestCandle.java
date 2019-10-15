
public class TestCandle {
	public static void main(String[] args) {
		Candle c = new Candle();
		c.setColor("Red");
		c.setHeight(10);
		System.out.println("Candle price : " + c.getPrice());
		ScentedCandle sc = new ScentedCandle();
		sc.setHeight(30);
		System.out.println("ScentedCandle price : " + sc.getPrice());

	}
}

class Candle {
	String color;
	int height;
	double price;

	public String getColor() {
		return color;
	}

	public void setColor(String aColor) {
		color = aColor;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int aHeight) {
		height = aHeight;
		price = aHeight * 2;
	}

	public double getPrice() {
		return price;
	}

}

class ScentedCandle extends Candle {
	private int scent;

	public int getScent() {
		return scent;
	}

	public void setScent(int aScent) {
		scent = aScent;
	}

	public void setHeight(int aHeight) {
		price = aHeight * 3;
	}
}