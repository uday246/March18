import java.io.BufferedReader;
import java.io.FileReader;

public class Classgrade {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("grades.txt"));
		String line = br.readLine();
		double gpa = 0, small = 5, big = -1;
		String smallGrade = "";
		String bigGrade = "";
		while (line != null) {
			// checks for grade
			if (line.equals("A+"))
				gpa = 4.33;
			if (line.equals("A"))
				gpa = 4;
			if (line.equals("A-"))
				gpa = 3.67;
			if (line.equals("B+"))
				gpa = 3.33;
			if (line.equals("B"))
				gpa = 3;
			if (line.equals("B-"))
				gpa = 2.67;
			if (line.equals("C+"))
				gpa = 2.33;
			if (line.equals("C"))
				gpa = 2;
			if (line.equals("C-"))
				gpa = 1.67;
			if (line.equals("D"))
				gpa = 1;
			if (line.equals("F"))
				gpa = 0;
			System.out.println(line + " : " + gpa);
			// code to find small grade
			if (small > gpa) {
				small = gpa;
				smallGrade = line;
			}
			// code to find big grade
			if (big < gpa) {
				big = gpa;
				bigGrade = line;

			}
			line=br.readLine();
		}
		System.out.println("Small grade  " + smallGrade + " : " + small);
		System.out.println("Big grade  " + bigGrade + " : " + big);

	}
}
