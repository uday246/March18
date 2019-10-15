package Programming;

import java.util.Scanner;

class Activity {
	String name;
	int startTime;
	int endTime;

	public Activity(String aName, int aStartTime, int aEndTime) {
		super();
		name = aName;
		// checks for valid start and end times
		if (aStartTime < aEndTime && aStartTime >= 0 & aStartTime <= 23 && aEndTime >= 0 && aEndTime <= 23) {
			startTime = aStartTime;
			endTime = aEndTime;
		} else {
			System.out.println("Invalid Timings");
		}
	}

	public Activity() {
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getStartTime() {
		return startTime;
	}
// checks for valid times
	public void setStartTime(int aStartTime) {
		if (startTime < endTime && startTime >= 0 & startTime <= 23 && endTime >= 0 && endTime <= 23) {
			startTime = aStartTime;
		} 
		else {
			System.out.println("Invalid Time");
		}
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int aEndTime) {
		if (startTime < endTime && startTime >= 0 & startTime <= 23 && endTime >= 0 && endTime <= 23) {
			endTime = aEndTime;
		}
		else {
			System.out.println("Invalid Time");
		}

	}
	public String toString(){
		return getName()+" "+getStartTime()+" "+getEndTime();
	}

}

class DaySchedule {

	Activity activities[] = new Activity[15];
	int size=0;
	public Activity[] getActivities() {
		return activities;
	}
	public DaySchedule(){

	}
	public void setActivities(Activity[] aActivities) {
		activities = aActivities;
	}

	public DaySchedule(Activity[] aActivities) {
		super();
		activities = aActivities;
	}
	// adds activity to the array
	public void addActivity(Activity act){
		// checks it is valid and assuming array size is 16
		if(isValid(act) && size<16){
			activities[size++] = act;
		}
		else{
			System.out.println("The activity to be added conflicts with an existing activity.  This activity will not be added");
		}
		printActivities();
	}
	// this method will remove activity from the array
	public void removeActivity(String name){
		boolean flag = true;
		for(int i=0;i<size;i++){
			if(name.equals(activities[i].getName())){
				removeAct(i);
				flag = false;
			}
		}
		if(flag){
			System.out.println("Enterd Activity does not exist");
		}
		else{
			printActivities();
		}
		
		
	}
	// it will remove the activity from the array and creates space to add other activities
	private void removeAct(int aI) {
		for(int i=aI;i<size-1;i++){
			// moves all activities right side to create if it removed in the middle
			activities[i]=activities[i+1];
		}
		activities[--size]=null;
	}
// this method will check whether the activityis conflicting with any other activities
	private boolean isValid(Activity a) {
		if(a.getStartTime()==0 && a.getEndTime()==0)
			return false;

		for(int i=0;i<size;i++){
			if(a.getStartTime()>= activities[i].getStartTime() && a.getStartTime()<=activities[i].getEndTime()
					|| 	activities[i].getStartTime()>= a.getStartTime() && activities[i].getStartTime()<=a.getEndTime()	
					){
				return false;
			}
		}
		return true;
	}
	// this method using to print the all the activities
	public void printActivities(){
		for(int i=0;i<size;i++){
			System.out.println(activities[i]);
		}
	}

}
public class DayScheduleFrontEnd{
	public static void main(String[] args) {
		DaySchedule daySchedule = new DaySchedule();
		Scanner sc = new Scanner(System.in);
		String name="";
		int start=0;
		int end=0;
		int ch=0;
		boolean flag = true;
		while(flag){
			System.out.println("Welcome to the day planner system");
			System.out.println("Enter 1 to add an activity");
			System.out.println("Enter 2 to remove an activity");
			System.out.println("Enter 9 to quit");

			ch  = sc.nextInt();
			sc.nextLine();
			switch(ch){
			case 1: 
				System.out.println("Enter the activity's name");
				name = sc.nextLine();
				System.out.println("Enter its start hour in military time");
				start = sc.nextInt();
				System.out.println("Enter its end hour in military time");
				end = sc.nextInt();
				sc.nextLine();
				Activity a = new Activity(name, start, end);
				daySchedule.addActivity(a);
				break;
			case 2:
				System.out.println("Enter the activity's name");
				name = sc.nextLine();
				daySchedule.removeActivity(name);
				break;
			case 9:
				flag = false;
				daySchedule.printActivities();
				System.out.println("Good bye");
				break;
			}
		}
		sc.close();
	}
}
