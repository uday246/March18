package May19;

import java.util.Scanner;

class DriverExam {
	 int correct = 0, incorrect = 0, missed = 0;

	String arr[] = { "B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "B", "D",
	"A" };
	DriverExam(){
		
	}
	int questionsMissed[]=new int[20];

	public  int getCorrectAns() {
		return correct;
	}

	public  int getInCorrectAns() {
		return incorrect;
	}

	public  int getmissed() {
		return missed;
	}

	public  boolean passed() {
		return correct >= 15;
	}
	public int [] questionsMissed(){
		return questionsMissed;
	}
}
public class DemoExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DriverExam de = new DriverExam();
		for (int i = 0; i < 20;) {
			System.out.println("Enter Answer : " + (i + 1) + " (A,B,C,D)");
			String ans = sc.nextLine();
			if ("ABCD".toUpperCase().contains(ans.toUpperCase())) {
				if (ans.trim().length() == 0){
					de.missed++;
					de.questionsMissed[i]=i;	
				}
				else if (ans.equalsIgnoreCase(de.arr[i]))
					de.correct++;
				else
					de.incorrect++;
				i++;
			}
		}
		System.out.println("Passed : "+de.passed());
		System.out.println("Total Incorrect: "+de.getInCorrectAns());
	}
}
