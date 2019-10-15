package Mat16th;

import java.util.Scanner;

public class DateFormat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a date in the form of mm/dd/yyyy");
		String date = sc.nextLine();
		String arr[] = date.split("/");
		int mm = Integer.parseInt(arr[0]);
		int dd = Integer.parseInt(arr[1]);
		int yy = Integer.parseInt(arr[2]);

		String month = getMonth(mm);
		int days = validateDate(mm, yy);
		if (month.equalsIgnoreCase("Invalid") || dd < 1 || dd > days) {
			System.out.println("Invalid date");
		} else {
			System.out.println("The date is " + month + "," + dd + " " + yy);
		}
	}

	private static int validateDate(int mm, int aYy) {
		int res = -1;
		switch (mm) {
		case 1:
			res = 31;
			break;
		case 2:
			if (isLeap(aYy))
				res = 28;
			else
				res = 29;
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

	private static String getMonth(int mm) {
		String res = "Invalid";
		switch (mm) {
		case 1:
			res = "January";
			break;
		case 2:
			res = "February";
			break;
		case 3:
			res = "March";
			break;
		case 4:
			res = "April";
			break;
		case 5:
			res = "May";
			break;
		case 6:
			res = "Jun";
			break;
		case 7:
			res = "July";
			break;
		case 8:
			res = "August";
			break;
		case 9:
			res = "September";
			break;
		case 10:
			res = "October";
			break;
		case 11:
			res = "November";
			break;
		case 12:
			res = "December";
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
