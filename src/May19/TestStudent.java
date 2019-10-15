package May19;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class Student {
	private String name;
	private String ID;
	private String className;
	private double grade[];
	private double average;

	public Student(String aName, String aID, String aClassName, double[] aGrade, double aAverage) {
		super();
		name = aName;
		ID = aID;
		className = aClassName;
		grade = aGrade;
		average = aAverage;
	}

	public String toString() {
		return "Student Number: " + ID + "\nStudent Name:" + name + "\nClass: " + className + "\nGrade 1:" + grade[0]
				+ "\nGrade 2:" + grade[1] + "\nGrade 3:" + grade[2] + "\nGrade 4:" + grade[3] + "\nGrade 5:" + grade[4]
				+ "\nAverage:" + average + "\n\n";
	}
}

public class TestStudent {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		String name = sc.nextLine();
		System.out.println("Enter student class name");
		String className = sc.nextLine();

		System.out.println("Enter student number");
		String ID = sc.nextLine();

		System.out.println("Enter 5 grades ");
		double g1 = sc.nextDouble();
		double g2 = sc.nextDouble();
		double g3 = sc.nextDouble();
		double g4 = sc.nextDouble();
		double g5 = sc.nextDouble();
		double avg = (g1 + g2 + g3 + g4 + g5) / 5;
		double arr[] = { g1, g2, g3, g4, g5 };
		Student s = new Student(name, ID, className, arr, avg);
		writeToFile(s);

	}

	private static void writeToFile(Student s) throws Exception {
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt", true));
		pw.println(s);
		System.out.println(s);
		pw.close();
	}
}
