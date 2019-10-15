
class ArrayIntList{
	private int[] elementData;
	private int size;
// constructor to create the array with given size
	public ArrayIntList(int cap) {
		elementData = new int[cap];
		size = 0;
	}
// this method is used to display the list elements
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(elementData[i] + " ");
		}
		System.out.println();
	}
// this method is used to add elements to list
	public void addElemnt(int ele) {
		if (elementData.length > size) {
			elementData[size++] = ele;
		}
	}
// this is uesd to return the size of the list
	public int getSize() {
		return size;
	}

	public ArrayIntList runningTotal() {
		ArrayIntList res = new ArrayIntList(this.getSize());
		int runningSum = 0;
		for (int i = 0; i < getSize(); i++) {
			runningSum += elementData[i];
			res.addElemnt(runningSum);
		}
		return res;
	}
}

public class DriverArrayIntList {
	public static void main(String[] args) {
		ArrayIntList list1 = new ArrayIntList(10);
		list1.addElemnt(2);
		list1.addElemnt(3);
		list1.addElemnt(5);
		list1.addElemnt(4);
		list1.addElemnt(7);
		list1.addElemnt(15);
		list1.addElemnt(20);
		list1.addElemnt(7);
		System.out.println("Original Elements : ");
		list1.display();
		System.out.println("Elements after calculating Running Total: ");
		ArrayIntList list2 = list1.runningTotal();
		list2.display();

	}
}
