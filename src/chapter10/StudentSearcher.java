package chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentSearcher {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the student list size: ");

		int size = scan.nextInt();

		Student s[] = new Student[size];

		String fileName = "D:\\studentsdata.txt";

		File file = new File(fileName);

		Scanner read = new Scanner(file);

		int lineCount = 0;

		while (read.hasNextLine()) {

			int id = read.nextInt();

			String fName = read.next();

			String lName = read.next();

			double GPA = read.nextDouble();

			s[lineCount++] = new Student(id, fName, lName, GPA);

		}

		System.out.println("Student data successfully");

		System.out.println("Enter the required student ID(-1 to quit): ");

		int searchID = scan.nextInt();

		while (searchID != -1) {

			Student matchStudent = getSearchStudent(s, searchID);

			if (matchStudent != null) {

				System.out.println("Student located with ID " + searchID);

				System.out.println("Student GPA: " + matchStudent.getGpa());

			} else {

				System.out.println("Student not located with ID " + searchID);

			}

			System.out.println("Enter the required student ID(-1 to quit): ");

			searchID = scan.nextInt();

		}

		read.close();

		scan.close();

	}

	public static Student getSearchStudent(Student s[], int ID) {

		for (int i = 0; i < s.length; i++) {

			if (s[i].getID() == ID) {
				// *********Getting error

				return s[i];

			}

		}

		return null;

	}

}
class Student{
	private int ID;
	private String firstName;
	private String lastName;
	private double gpa;
	public int getID() {
		return ID;
	}
	public void setID(int aID) {
		ID = aID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String aFirstName) {
		firstName = aFirstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String aLastName) {
		lastName = aLastName;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double aGpa) {
		gpa = aGpa;
	}
	public Student(int aID, String aFirstName, String aLastName, double aGpa) {
		super();
		ID = aID;
		firstName = aFirstName;
		lastName = aLastName;
		gpa = aGpa;
	}
	
}