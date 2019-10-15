package coll.Movies;



/****WRITE SOLUTION IN JAVA***

Write a program that will compute and display the final grades for students in a class. A student's final grade is determined from the scores obtained in the class exams. Each student in the class may be given a different number of exams as determined by the instructor. The final grade is determined by the average of the scores in all the exams given.

For each student, the program will input student id, name, the number of exams given and scores in each of the exams. The scores in each of the exams will vary from 0 to 100. Each exam will carry the same weight. The final grade will be computed by taking the average of the scores in all the exams given (i.e. by adding the scores in all the exams and dividing it with the number of exams given). The final grade will be assigned depending upon the percentage of total points in the exams given as follows:

A  90 to 100%

B  80 to 89%

C  70 to 79%

D  60 to 69%

F  0 to 59%

Create a class Student that provides the following:

·      Private instance variables for holding student id (int), name (String), exam scores (an int array).

·      A public constructor with parameters for initializing student id (int), name (String) and exam scores. The exam scores are passed as an array of int.

·      A public method for returning the final grade as a String ( "A", "B" etc).

·      Accessor (getter) methods for getting student id and name.

Write a class TestStudent containing the main method. The method main will do the following:

·      Prompt the user to enter the total number of students (say n).

·      Create an array of n references (for holding n Student object references). (The Student objects will be created in the next step).

·      Create n Student objects. Do this by setting up an n count loop. In each pass through the loop, do the following:

a. Ask the user to enter data for one student in a single dialog box.

b.   Separate data elements using a StringTokenizer object.

c.    Create a Student object initialized with data provided by the user and store its reference in the appropriate element of the array of student references created above.

·      Display the student results by grade type. First display all students with grade A, then all students with grade B etc.*/

import javax.swing.JOptionPane;

class Student

{

	private int id;

	private String name;

	private int[] exams;

	public Student(int id, String n, int[] ex)

	{

		// Below id refers to local variable.

		// this.id refers to the instance variable.

		this.id = id;

		name = n;

		// create exams array of same length as ex array

		exams = new int[ex.length];

		// copy contents from array ex to exams

		System.arraycopy(ex, 0, exams, 0, ex.length);

	}

	public String findGrade()

	{

		String grade;
		int sum=0;
		for(int i=0;i<exams.length;i++)
			sum+=exams[i];
		// enter code here for finding the final grade.
		sum=sum/exams.length;
		if(sum>=90 && sum<=100)
			grade="A";
		else if(sum>=80 && sum<=89)
			grade="B";
		else if(sum>=70 && sum<=79)
			grade="C";
		else if(sum>=60 && sum<=69)
			grade="D";
		else 
			grade="F";
		return grade;

	}

	public int getId()

	{

		return id;

	}

	public String getName()

	{

		return name;

	}

}

public class TestStudent

{

	public static void main(String[] args)

	{

		String in, name;

		int nStudents, id,nExams;

		int[] scores;

		in = JOptionPane.showInputDialog("Enter number of students");

		nStudents = Integer.parseInt(in);

		// Create an array of nStudents references

		Student[] st = new Student[nStudents];

		// Create nStudents objects

		for (int i = 0; i < st.length; i++)

		{

			// Input one student data

			in = JOptionPane.showInputDialog("Enter one student data");

			// Tokenize student data using StringTokenizer

			// Create Student object
			String str[] = in.split(",");
			 id = Integer.parseInt(str[0].trim());
			 name = str[1];
			 nExams = Integer.parseInt(str[2].trim());
			 scores= new int[nExams];
			 for(int j=0;j<nExams;j++)
				 scores[j] = Integer.parseInt(str[j+3].trim());
			st[i] = new Student(id, name, scores);

		}

		// Find student grades

		// Create an array out of 5 string references

		String[] out = new String[5];

		// Create 5 String objects. Initialize each with ""

		// and store their references in the above array of references.

		for (int i = 0; i < out.length; i++)

			out[i] = new String(""); // alternate form: out [i] = "";

		// The above two parts can be done with a single statement as below:

		// String [] out = new String [ ] {"", "", "", "", ""};

		// find student grades and accumulate output for each type of student.

		String grade;

		for (int i = 0; i < st.length; i++)

		{

			grade = st[i].findGrade();

			if (grade.equalsIgnoreCase("A"))

			{
				out[0]=out[0]+"\n"+st[i].getId()+" "+st[i].getName()+"("+grade+")";
				// accumulate output in out[0] for A students.

			}

			else if (grade.equalsIgnoreCase("B"))

			{
				out[1]=out[1]+"\n"+st[i].getId()+" "+st[i].getName()+"("+grade+")";
				// accumulate output in out[1] for B students.

			}

			else if (grade.equalsIgnoreCase("C"))

			{
				out[2]=out[2]+"\n"+st[i].getId()+" "+st[i].getName()+"("+grade+")";
				// accumulate output in out[2] for C students.

			}

			else if (grade.equalsIgnoreCase("D"))

			{
				out[3]=out[3]+"\n"+st[i].getId()+" "+st[i].getName()+"("+grade+")";

				// accumulate output in out[3] for D students.

			}

			else

			{
				out[4]=out[4]+"\n"+st[i].getId()+" "+st[i].getName()+"("+grade+")";
				// accumulate output in out[4] for F students.

			}

		}

		// Call diaplayResults to display grades

		displayResults(out);

	}

	public static void displayResults(String[] s)

	{

		// Create a String outAll initialized with an empty string.

		String outAll = "";

		// Accumulate elements of the received String array s into String
		// outAll.

		for (int i = 0; i < s.length; i++)

		{

			outAll = outAll + s[i];

		}

		JOptionPane.showMessageDialog(null, outAll);

	}

}