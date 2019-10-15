package Mar26th;

import java.util.Scanner;

public class ReadStudentsData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double marks[] = null;
		String name = "";
		System.out.println("Enter Student Name");
		name = sc.nextLine();
		System.out.println("Enter number of scores");
		marks = new double[sc.nextInt()];
		for (int i = 0; i < marks.length; i++)
		{
			System.out.println("Score "+i+" : ");
			marks[i] = sc.nextDouble();
		}
		displayArrays(name,marks);
		sc.close();
		
		
	}

	private static void displayArrays(String name,double m[]) {
		System.out.println("In displayArrays Method ");
		System.out.println("======================================");
		
		System.out.println("Student data for : "+name);
		double max=m[0];
		double min=m[0];
		double sum=0;
		// finding the min and max elements in the array and sum of all marks to calculate the average
		for(int i=0;i<m.length;i++){
			if(m[i]>max)
				max=m[i];
			if(m[i]<min)
				min=m[i];
			sum+=m[i];
		}
		System.out.println("Highest Score : "+max);
		System.out.println("Lowest Score  : "+min);
		// printing the avg to 2 decimal points
		System.out.printf("Average Score  : %.2f",(sum/m.length));
		System.out.println();
		System.out.println();
		System.out.println("Index\t\tScore");
		System.out.println("=========================================");
		for(int i=0;i<m.length;i++){
			System.out.println((i+1)+":\t\t"+m[i]);
			
		}	
		
	}

	
}

