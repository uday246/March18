
class Date {
	int month;
	int day;
	public Date(int aMonth, int aDay) {
		super();
		month = aMonth;
		day = aDay;
	}

	public int absoluteDate(){
		// storing the number of days so that it will easy for us to get the exact day, for feb I am taking 28 days here
		int arr[] = {0,31,59,90,120,151,181,212,243,273,304,334};
		return arr[month-1]+day;
	}
}

public class TestDateDriver{
	public static void main(String[] args) {
		Date d = new Date(1,1);
		System.out.println(d.absoluteDate());
		d = new Date(1,4);
		System.out.println(d.absoluteDate());

		d = new Date(2,1);
		System.out.println(d.absoluteDate());
		d = new Date(3,10);
		System.out.println(d.absoluteDate());
		d = new Date(9,19);
		System.out.println(d.absoluteDate());
		d = new Date(12,31);
		System.out.println(d.absoluteDate());

	}
}