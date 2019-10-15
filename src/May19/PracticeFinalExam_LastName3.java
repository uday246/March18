package May19;

import java.util.Scanner;

public class PracticeFinalExam_LastName3 {
	public static int getValidSize(Scanner s) {
		int sz;
		while (true) {
			System.out.print("How many numbers do you wish to store? (Between 2 and 10)--> ");
			sz = s.nextInt();
			if (sz >= 2 && sz<=10)
				break;
		}
		return sz;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=getValidSize(sc);
		System.out.println("Your array will be of size "+size);
		double arr[]=new double[size];
		for(int i=0;i<size;i++){
			System.out.println("Enter the "+(i+1)+" number (DECIMAL and whole numbers allowed): ");
			arr[i]=sc.nextDouble();
		}
		System.out.println("Your array contains: ");
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}
