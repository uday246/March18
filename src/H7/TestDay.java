package H7;
interface DayOfTheWeek{
	public String getDay();
	public void setDay(int aDay);
	public void print();
	public String getNextDay();
	public String getPrevious();
	public String addDays(int days);
}
class Day implements DayOfTheWeek {
	int day=0;

	public String getDay() {
		String res="";
		switch(day){
		case 1:
			res ="Monday";
			break;
		case 2:
			res ="Tuesday";
			break;
		case 3:
			res ="Wednesday";
			break;
		case 4:
			res ="Thursday";
			break;
		case 5:
			res ="Friday";
			break;
		case 6:
			res ="Saturday";
			break;
		case 7:
			res ="Sunday";
			break;

		}
		return res;
	}
	// taking weekdays 1 as monday till 7 as sunday
	public String getDay(int day) {
		String res="";
		switch(day){
		case 1:
			res ="Monday";
			break;
		case 2:
			res ="Tuesday";
			break;
		case 3:
			res ="Wednesday";
			break;
		case 4:
			res ="Thursday";
			break;
		case 5:
			res ="Friday";
			break;
		case 6:
			res ="Saturday";
			break;
		case 7:
			res ="Sunday";
			break;

		}
		return res;
	}
	public void setDay(int aDay) {
		day = aDay;
	}
	public void print(){
		System.out.println(getDay());
	}
	public String getNextDay(){
		return getDay((day+1)%8);
	}
	public String getPrevious(){
		
		int temp =day-1;
		//for monday previous day is sunday so making temp =7
		if(temp<1)
			temp=7;
		return getDay(temp);
	}
	public String addDays(int days){
		// to limit the day range with in 7 peforming % operation
		int temp = day+days;
		return getDay(temp%8);
	}

}
public class TestDay{
	public static void main(String[] args) {
		Day d = new Day();
		d.setDay(1);
		System.out.println("Current Day : "+d.getDay());
		System.out.println("Next Day : "+d.getNextDay());
		System.out.println("Previous Day : "+d.getPrevious());
		System.out.println("Adding 4 days : "+d.addDays(4));
		
	}
}
