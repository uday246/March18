package visitor2;
class Student{
	private int scores[];

	public Student(int[] aScores) {
		super();
		scores = aScores;
	}
	// calculates the avg
	public double calculateAvg(){
		double sum=0;
		for(int i:scores)
			sum+=i;
		
		return sum/5;
	}
	// shows student info
	public void show(){
		double avg=calculateAvg();
		System.out.println("Average : "+avg);
		if(avg>60)
			System.out.println("Grade : Pass");
		else
			System.out.println("Grade : Fail");
			
	}
}
public class StudentTester {
public static void main(String[] args) {
	Student s = new Student(new int[]{50,70,80,90,95});
	s.show();
}
}
