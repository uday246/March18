package May19;

class MonthDays {
	private int month;
	private int year;

	public MonthDays(int aMonth, int aYear) {
		setMonth(aMonth);
		setYear(aYear);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int aYear) {
		year = aYear;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int aMonth) {
		if (aMonth >= 1 && aMonth <= 12)
			month = aMonth;
	}

	public int getNumberOfDays() {
		int res = -1;
		int mm = month;
		int aYy = year;
		switch (mm) {
		case 1:
			res = 31;
			break;
		case 2:
			if (isLeap(aYy))
				res = 29;
			else
				res = 28;
			break;
		case 3:
			res = 31;
			break;
		case 4:
			res = 30;
			break;
		case 5:
			res = 31;
			break;
		case 6:
			res = 30;
			break;
		case 7:
			res = 31;
			break;
		case 8:
			res = 31;
			break;
		case 9:
			res = 30;
			break;
		case 10:
			res = 31;
			break;
		case 11:
			res = 30;
			break;
		case 12:
			res = 31;
			break;

		}
		return res;
	}

	private boolean isLeap(int year) {
		boolean leap = false;
		// if any year is divisable by 4 than there are many chances for leap
		// year except few
		if (year % 4 == 0) {
			// if it is divisable by 100 than it shoud also divisable by 400
			// like 2000 etc
			if (year % 100 == 0) {
				// year is divisible by 400, so the year is a leap year
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;
		return leap;
	}

}

public class TestMothDays {
	public static void main(String[] args) {
		MonthDays m1 = new MonthDays(2, 2000);
		MonthDays m2 = new MonthDays(2, 2015);
		System.out.println(m1.getNumberOfDays());
		System.out.println(m2.getNumberOfDays());

	}
}
