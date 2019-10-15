package May19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

class Grade{
	private int score;

	public Grade(int aScore) {
		super();
		score = aScore;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int aScore) {
		score = aScore;
	}

	
	
}
public class TestGrades {
public static void main(String[] args) {
	Grade [] grades=new Grade[10];
	createGrades(grades);
	printGrades(grades);
	Grade maxScore=findMaxScore(grades);
	System.out.println("The maximum score is: "+maxScore.getScore());
	sortScore(grades);
	System.out.println("After Sorting: ");
	printGrades(grades);
}

private static void sortScore(Grade[] grades) {
	Arrays.sort(grades,new Comparator<Grade>() {

		@Override
		public int compare(Grade g1, Grade g2) {
			return new Integer(g1.getScore()).compareTo(g2.getScore());
		}
		
	});
}

private static Grade findMaxScore(Grade[] grades) {
	int index=0,max=grades[0].getScore();
	for(int i=1;i<grades.length;i++){
		if(grades[i].getScore()>max){
			max=grades[i].getScore();
			index=i;
		}
	}
	return grades[index];
}

private static void printGrades(Grade[] grades) {
	for(int i=0;i<grades.length;i++)
		System.out.print(grades[i].getScore()+" ");
	System.out.println();
}

private static void createGrades(Grade[] grades) {
	Random r = new Random();
	for(int i=0;i<10;i++){
		grades[i]=new Grade(r.nextInt(40)+60);
	}
}
}
