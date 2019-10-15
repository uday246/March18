package Mar26th;

public class GroceryStore {
	private String[] items;
	private final int MAX_ITEMS = 3;
	public GroceryStore(String[] aItems) {
		super();
		items = aItems;
	}
	// returns the item at location i
	public String getLocation(int i){
		// checking whether the i is within the range or not
		if(i<items.length)
			return items[i];
		return "";
	}
	
	public static void main(String[] args) {
		String items[]={"Apples","Bananas","Mangos"};
		GroceryStore g = new GroceryStore(items);
		System.out.println("Item at location 1 : "+g.getLocation(1));
	}
}
