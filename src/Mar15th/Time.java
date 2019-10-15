package Mar15th;

public class Time {
int hours;
int minutes;
int seconds;
public void setTime(int hours,int minutes,int sec){
	this.hours = hours;
	this.minutes = minutes;
	this.seconds= sec;
}
public void write(){
System.out.println(hours+":"+minutes+":"+seconds);
}
// Comparing the times of both objects
public boolean equal(Time time){
	
	return hours==time.hours && minutes==time.minutes && seconds==time.seconds;
}
// converting 2 time objects data into seconds and comparing
public boolean lessThan(Time time){
	int total1 = (hours*60*60)+(minutes*60)+seconds;
	int total2 = (time.hours*60*60)+(time.minutes*60)+time.seconds;
return total1<total2;

}
public Time(int aHours, int aMinutes, int aSeconds) {
	super();
	hours = aHours;
	minutes = aMinutes;
	seconds = aSeconds;
}
public Time() {
}
public static void main(String[] args) {
	Time time = new Time(10, 20, 50);
	time.write();
	Time time2 = new Time(10, 21, 50);
	System.out.println(time.equal(time2));
	System.out.println(time.lessThan(time2));
	
}
}
