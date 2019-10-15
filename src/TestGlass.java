public class TestGlass
{
	public static void main(String [] args)
	{
		Glass milk = new Glass(15); // 15 ounces of milk
		Glass juice = new Glass(3); // 3 ources of juice

		milk.drink(2);
		milk.drink(1);

		milk.report();

		juice.fill(6); // went from 3 to 9 ounces
		juice.drink(1); // now down to 8 ounces

		juice.report();

		juice.spill();

		juice.report();
	}
}
class Glass{
	int numberOfGlasses;

	public Glass(int aNumberOfGlasses) {
		super();
		numberOfGlasses = aNumberOfGlasses;
	}

	public int getNumberOfGlasses() {
		return numberOfGlasses;
	}

	public void setNumberOfGlasses(int aNumberOfGlasses) {
		numberOfGlasses = aNumberOfGlasses;
	}
	// reduces the glass
	public void drink(int num){
		numberOfGlasses-=num;
	}
	// fills the glass
	public void fill(int num){
		numberOfGlasses+=num;
	}
	// empty the glass
	public void spill(){
		numberOfGlasses=0;
	}
	// prints report
	public void report(){
		System.out.println("Remaining "+numberOfGlasses+" ounces");
	}
}