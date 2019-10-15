package Mat16th;

import java.util.Scanner;

public class MouseWithoutGUI {  
	public static void main(String[] args) throws Exception {
		int array[] = new int[7];
		Scanner sc = new Scanner(System.in);
		// array to store the frequency
		int count[] = new int[1000];
		System.out.println("Enter 7 Intergers");
		for(int i=0;i<7;i++){
			array[i] = sc.nextInt();
			// increasing the frequncy
			count[array[i]]++;
		}
		System.out.println("Element : Count");
		// printing the frequency
		for(int i=0;i<7;i++){
			// to avoid the display same element multiple times
			if(count[array[i]]!=0)
			System.out.println(array[i]+" : "+ count[array[i]]);
			count[array[i]] = 0;
		}
		sc.close();
	}
	
}