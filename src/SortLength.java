import java.util.Arrays;
import java.util.Random;

class Length implements Comparable {
	int feet;
	int inches;

	public Length() {
		feet = 0;
		inches = 0;
	}
// adds 2 length objects
	public Length add(Length l) {
		Length res = new Length(this.getFeet() + l.getFeet(), this.getInches() + l.getInches());
		return res;
	}
// subtracts 2 length objects
	public Length subtract(Length l) {
		Length res = new Length(this.getFeet() - l.getFeet(), this.getInches() - l.getInches());
		return res;
	}

	public String toString() {
		return feet + "\'" + inches + "\"";
	}

	public Length(int aFeet, int aInches) {
		super();
		feet = aFeet;
		inches = aInches;
	}

	public int getFeet() {
		return feet;
	}

	public void setFeet(int aFeet) {
		feet = aFeet;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int aInches) {
		inches = aInches;
	}
// checks equality of 2 objects
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Length other = (Length) obj;
		if (feet != other.feet)
			return false;
		if (inches != other.inches)
			return false;
		return true;
	}
// used to sort the array
	@Override
	public int compareTo(Object aO) {
		Length l = (Length) aO;
		Integer count1 = this.getFeet() * 12 + getInches();
		Integer count2 = l.getFeet() * 12 + l.getInches();
		return count1.compareTo(count2);
	}

}

public class SortLength {
	public static void main(String[] args) {
		Length list[] = new Length[10];
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			// generating the random number in range
			int feet = rand.nextInt((20 - 10) + 1) + 10;
			int inches = rand.nextInt(11);
			list[i] = new Length(feet, inches);
		}
		for (int i = 0; i < 10; i++)
			System.out.println(list[i]);
		Arrays.sort(list);
		System.out.println("After Sort : ");
		for (int i = 0; i < 10; i++)
			System.out.println(list[i]);

	}
}
