package javaConcepts;

import java.util.Scanner;

// creating the DuplicateException class which will take the 1 argument as duplicate element and returns the proper message
// created this exception class un checked exception
class DuplicateException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int element;

	public DuplicateException(int ele) {
		super();
		element = ele;
	}

	public String toString() {
		return "Element " + element + " already present in the array";
	}

}

public class DuplicateExceptionDriver {
	public static void main(String[] args) {
		int size=5;
		int a[] = new int[size];
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleas enter "+size+" elements");
		for (int i = 0; i < size;) {
			int ele = sc.nextInt();
			
			if (isExist(ele, a)) {
				// if exist than throwing the exception 
				try{
				throw new DuplicateException(ele);
				}
				catch(DuplicateException e){
					e.printStackTrace();
				}
			} else {
				a[i++] = ele;
			}
		}
		System.out.println("Elements : ");
		for(int i=0;i<size;i++)
			System.out.print(a[i]+" ");
		sc.close();
	}
// returns true if element is already present in the array
	private static boolean isExist(int aEle, int[] aA) {
		for (int i = 0; i < aA.length; i++) {
			if (aA[i] == aEle)
				return true;
		}
		return false;
	}
}
