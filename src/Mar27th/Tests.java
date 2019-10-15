package Mar27th;

import java.text.DecimalFormat;

public class Tests {
	private String firstName;
	private String lastName;
	private double marks[];
	private double averageScore;
	private char grade;

	public Tests(String aFirstName, String aLastName, double[] aMarks, double aAverageScore, char aGrade) {
		super();
		firstName = aFirstName;
		lastName = aLastName;
		marks = aMarks;
		averageScore = aAverageScore;
		grade = aGrade;
		// while creating the values only we are calculating the average and grade
		calculateAverage();
		findGrade();
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

	public double[] getMarks() {
		return marks;
	}

	public void setMarks(double[] aMarks) {
		marks = aMarks;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double aAverageScore) {
		averageScore = aAverageScore;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char aGrade) {
		grade = aGrade;
	}

	public double calculateAverage() {
		setAverageScore((marks[0] + marks[1] + marks[2] + marks[3] + marks[4] )/ 5);
		return (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5;
	}
	public char findGrade(){

		char res=' ';
		if(calculateAverage()>=90)
			res='A';
		else if(calculateAverage()>=80 && calculateAverage()<90)
			res='B';
		else if(calculateAverage()>=70 && calculateAverage()<80)
			res='C';
		else if(calculateAverage()>=60 && calculateAverage()<70)
			res='D';
		else
			res='F';
		setGrade(res);
		return res;

	}

	@Override
	public String toString() {
	    DecimalFormat decim = new DecimalFormat("0.00");
	    Double m1 = Double.parseDouble(decim.format(marks[0]));
	    Double m2 = Double.parseDouble(decim.format(marks[1]));
	    Double m3 = Double.parseDouble(decim.format(marks[2]));
	    Double m4 = Double.parseDouble(decim.format(marks[3]));
	    Double m5 = Double.parseDouble(decim.format(marks[4]));
		return firstName +"\t\t\t"+ lastName+"\t\t\t"+m1+"\t"+m2+"\t"+m3+"\t"+m4+"\t"+m5+"\t"+averageScore+"\t"+grade;
	}
	public static void main(String[] args) {
		System.out.println("First_Name\t\t Last_Name\t\tTest1\tTest2\tTest3\tTest4\tTest5\tAverage\tGrade");
		Tests[] arr = new Tests[10];
		
		double m1[]={85,83,77,91,76};
		arr[0]= new Tests("Jack","Jhonson",m1,0,' ');
		
		double m2[]={80,90,95,93,48};
		arr[1]= new Tests("Lisa","Aniston",m2,0,' ');
		

		double m3[]={78,81,11,90,73};
		arr[2]= new Tests("Andy","Cooper",m3,0,' ');
		
		double m4[]={92,83,30,69,87};
		arr[3]= new Tests("Ravi","Gupta",m4,0,' ');
		
		double m5[]={23,45,96,38,59};
		arr[4]= new Tests("Bonny","Blair",m5,0,' ');
		
		double m6[]={60,85,45,39,67};
		arr[5]= new Tests("Danny","Clark",m6,0,' ');
		
		double m7[]={77,31,52,74,83};
		arr[6]= new Tests("Samanth","Kennedy",m7,0,' ');
		
		double m8[]={93,94,89,77,97};
		arr[7]= new Tests("Robin","Bronson",m8,0,' ');

		double m9[]={79,85,28,93,82};
		arr[8]= new Tests("Sheila","Sunny",m9,0,' ');
		
		double m10[]={85,72,49,75,63};
		arr[9]= new Tests("Kiran","Smith",m10,0,' ');
		
		double average = 0;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			average+=arr[i].getAverageScore();
		}
		average/=10;
		System.out.println("Class Average : "+average);
	}	
}
