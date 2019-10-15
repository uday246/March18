package mat55;

import java.util.Scanner;

public class Student {

	private String Word;
	private int Grade;

	public void setWord(String Word) {
		this.Word = Word;
	}

	public void setGrade(int Grade) {
		this.Grade = Grade;
	}

	public String getWord() {
		return Word;
	}

	public int getGrade() {
		return Grade;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Student First = new Student();
		Student Second = new Student();

		System.out.println("Enter a name:");
		String Word = input.nextLine();
		First.setWord(Word);

		System.out.println("Enter a grade:");
		int Grade = input.nextInt();
		First.setGrade(Grade);

		System.out.println("Enter a second name:");
		String Word2 = input.nextLine();
		input.nextLine();
		Second.setWord(Word2);

		System.out.println("Enter a grade:");
		int Grade2 = input.nextInt();
		Second.setGrade(Grade2);

		System.out.println("Pick a name, so I can add points to their grade");
		input.nextLine();
		String Name = input.nextLine();

		if (Name.equalsIgnoreCase(Word)) {
			System.out.println("How many points do you want to add?");
			int add = input.nextInt();

			Grade += add;
			First.setGrade(Grade);

			System.out.printf("The new grade is %d", First.getGrade());
		}

		else {
			System.out.println("How many points do you want to add?");
			int adding = input.nextInt();

			Grade2 += adding;
			Second.setGrade(Grade2);

			System.out.printf("The new grade is %d", Second.getGrade());
		}

		input.close();
	}
}
