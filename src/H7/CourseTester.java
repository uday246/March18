package H7;

class Course {
String courseName;
String[] students = new String[100];
int numberOfStudents;
// Constructor setting the course name and setting 0 to the number of students initially
public Course(String courseName){
	this.courseName = courseName;
	numberOfStudents = 0;
}
// adding the received student to array and increasing the number of students by 1
public void addStudent(String name){
	students[numberOfStudents++] = name;
}
public int getNumberOfStudent(){
	return numberOfStudents;
}
public String getCourseName(){
	return courseName;
}
@Override
public String toString() {
	return "Course : "+ courseName + ",Number of students registered : "+numberOfStudents;
}

}
public class CourseTester{
	public static void main(String[] args) {
		Course cs1 = new Course("ICS 241-01 Object Programming");
		System.out.println(cs1);
		cs1.addStudent("Michael");
		System.out.println(cs1);
		System.out.println(cs1.getNumberOfStudent());
		System.out.println(cs1.getCourseName());
		
	}
}