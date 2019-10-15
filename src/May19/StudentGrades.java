package May19;

import java.util.Scanner;

public class StudentGrades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int n = sc.nextInt();
		double scores[] = new double[n];
		System.out.println("Enter " + n + " scores: ");
		double best = -1;
		for (int i = 0; i < n; i++) {
			scores[i] = sc.nextDouble();
			if (best < scores[i])
				best = scores[i];
		}
		for (int i = 0; i < n; i++) {
			System.out
					.println("Student " + i + " scores is " + scores[i] + " and grade is " + getGrade(scores[i], best));
		}
	}

	private static String getGrade(double d, double best) {
		if (d >= best - 10)
			return "A";
		if (d >= best - 20)
			return "B";
		if (d >= best - 30)
			return "C";
		if (d >= best - 40)
			return "D";

		return "F";

	}
}
