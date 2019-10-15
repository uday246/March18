package Mat16th;

import java.util.Scanner;

public class MonthDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date");
		String date = sc.nextLine();
		int month = Integer.parseInt(date.split("/")[0]);
		int year =  Integer.parseInt(date.split("/")[1]);
		int days = getDays(month, year);
		System.out.println(month + "/" + year + " has " + days + " days");
	}

	private static int getDays(int mm, int aYy) {
		int res = -1;
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

	private static boolean isLeap(int year) {
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
