package Programming;

import java.util.Scanner;

public class StudentsGrades {
	public static void main(String[] args) {
		String[][] grades = new String[10][11];
		String[] answers = {"A","B","A","C","B","C","D","D","A","C"};
		readData(grades);
		int marks[] = getMarks(grades,answers);
		System.out.println(marks);
		
	}

	private static int[] getMarks(String[][] aGrades, String[] aAnswers) {
		int marks[]=new int[10];
		for(int i=0;i<10;i++){
			int count=0;
			for(int j=0;j<10;j++){
				if(aAnswers[j].equalsIgnoreCase(aGrades[i][j+1]))
					count++;
			}
			marks[i]=count;
		}
		
		return marks;
	}

	private static void readData(String[][] aGrades) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter Student" + i + " Name");
			aGrades[i][0] = sc.nextLine();
			for (int j = 1; j < 11; j++) {
				System.out.println("Enter Answer " + j);
				aGrades[i][j] = sc.nextLine();
			}
		}
		sc.close();
	}
}
