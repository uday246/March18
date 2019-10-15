package Mar26th;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L19 {

	public static void main(String[] args) {
		int[][] temp = getInput();
		double av = findAverage(temp);
		System.out.println("The average temperature for the year was " + av);
		Scanner scan = new Scanner(System.in);
		System.out.println("If you tell me a month and a day I will tell you the temperature");
		System.out.println("Which month (1-10)");
		int month = scan.nextInt();
		System.out.println("Which day (1-30)");
		int day = scan.nextInt();
		int dailyTemp = findTemp(temp, month, day);
		System.out.println("The temperature was " + dailyTemp);

	}

	public static int[][] getInput() {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("temps.txt"));
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("File does not exist.");
		}
		// creating array with 10 rows which represents rows and 30 cols which represents days
		int arr [][] = new int[10][30];
		int i=0,j=0;
		while(sc.hasNext()){
			// if we read 30 days data than new month will start so making j=0 and increasing i to next month
			if(j==30){
				j=0;
				i++;
			}
			String str = sc.nextLine().trim();
			arr[i][j] = Integer.parseInt(str);
			j++;
		}
		
		for(int i1=0;i1<arr.length;i1++){
			for(int j1=0;j1<arr[i1].length;j1++)
				System.out.print(arr[i1][j1]+" ");
		System.out.println();	
		}
		sc.close();
		return arr;

	}
// rows represent month and cols reprsents days so we can directly return m*n
	public static int findTemp(int[][] t, int m, int d) {
		
		return t[m][d];
	}

	public static double findAverage(int[][] t) {
		double sum=0;
		for(int i=0;i<t.length;i++)
			for(int j=0;j<t[i].length;j++)
				sum+=t[i][j];
		return sum/300;
	}

}
