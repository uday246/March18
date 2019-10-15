package Mat18th;

public class StudentsGrade {
	static int grades[][] = { { 76, 82, 91, 100, 97, 77, 63, 88, 54, 72 }, 
			{ 85, 81, 96, 94, 98, 74, 71, 80, 62, 69 },
			{ 80, 90, 92, 95, 92, 80, 65, 87, 61, 77 } };
	static String names[] = { "Nick", "John", "Amy", "Ron","Bob", "Jill", "Jane", "Joe", "Ryan", "Mike" };

	public static void main(String[] args) {
		System.out.println("Highest Marks in all exams : "+getHighestScoreInAllExams());
		System.out.println("Highest marks in exam-2 : "+getHighestScoreExam2());
		System.out.println("Class avg for exam-3 : "+getClassAvgForExam3());
		System.out.println("Lowest avg for all exams : "+getLowerAvgForAllExams());
		System.out.println("Highest marks person name : "+getNameOfStudentWhoHadHighestScoreInAllExams());
		System.out.println("Highest marks in exam2 : "+getNameOfStudentWhoHadHighestScoreExam2());
		System.out.println("Lowest avg student name : "+getNameOfStudentWhoLowerAvgForAllExams());

	}

	public static int getHighestScoreInAllExams() {
		int highest = 0;
		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				if(grades[i][j]>highest)
					highest = grades[i][j];
			}
				
		}
		return highest;
	}

	public static int getHighestScoreExam2() {
		int highest=0;
		for(int j=0;j<10;j++){
			if(grades[1][j]>highest)
				highest = grades[1][j];
		}
		return highest;
	}

	public static double getClassAvgForExam3() {
		double sum=0;
		for(int j=0;j<10;j++){
				sum += grades[2][j];
		}
		return sum/10;
	}

	public static double getLowerAvgForAllExams() {
		
		double lowest = 100,sum=0,avg;
		for(int i=0;i<10;i++){
			sum=0;
			for(int j=0;j<3;j++){
				sum +=grades[j][i];	
			}
			avg = sum/3;
			//System.out.println(avg);
			if(lowest>avg)
				lowest = avg;
				
		}
		return lowest;
	}

	public static String getNameOfStudentWhoHadHighestScoreInAllExams() {
		int highest = 0,index=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				if(grades[i][j]>highest)
				{
					highest = grades[i][j];
					index=j;
				}
				
			}
				
		}
		return names[index];
	}
// returning the name from the 1D string array
	public static String getNameOfStudentWhoHadHighestScoreExam2() {
		int highest=0,index=0;
		for(int j=0;j<10;j++){
			if(grades[1][j]>highest)
			{
				highest = grades[1][j];
				index  = j;
			}
		}
		return names[index];
	}

	public static String getNameOfStudentWhoLowerAvgForAllExams() {
		double lowest = 100,sum=0,avg;
				int index=0;
				for(int i=0;i<10;i++){
					sum=0;
					for(int j=0;j<3;j++){
						sum +=grades[j][i];	
					}
					avg = sum/3;
					if(lowest>avg){
						lowest = avg;
						index = i;
					}
						
				}
		return names[index];
	}
}
