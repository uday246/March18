package Mat18th;

import java.util.Scanner;

class Date {

	// Declaring instance variables

	private int day;

	private int month;

	private int year;

	// Parameterized constructor

	public Date(int day, int month, int year) {

		this.day = day;

		this.month = month;

		this.year = year;

	}

	// getters and setters

	public int getDay() {

		return day;

	}

	public void setDay(int day) {

		this.day = day;

	}

	public int getMonth() {

		return month;

	}

	public void setMonth(int month) {

		this.month = month;

	}

	public int getYear() {

		return year;

	}

	public void setYear(int year) {

		this.year = year;

	}

	// This method will calculate the difference between two dates

	public int daysTo(Date d) {

		int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int m1=0,m2=0;

		int nod1 = getYear(); //copy year into nod1

		int y1=nod1*365; //get all days of all years

		int nod2 =getMonth();

		for(int i=0;i<months.length;i++){
			m1=m1+months[i]; // get all days of all months
		}


		int nod3=getDay();

		int total1=nod3+m1+y1; //calculate total days in that date

		int nod4 =d.getYear();

		int y2=nod4*365; //get all days of all years

		int nod5 = d.getMonth();

		for(int i=0;i<months.length;i++){
			m2=m2+months[i]; // get all days of all months
		}


		int nod6=d.getDay();

		int total2=y2+m2+nod6; //calculate total days in that date

		int diff = 0;

		int leapy=0;

		if (nod1 > nod4) //check which date is maximum to find difference

		{

			diff =total1-total2; //calculate difference between to dates

			leapy=leapYears(nod1,nod4); // calling leapYears() method to get number of leap days between two dates

			//without leap adding leap year days

		}

		else if (nod1 < nod4) //calculate difference between to dates

		{

			diff = total2-total1; // calling leapYears() method to get number of leap days between two dates

			//without leap adding leap year days

			leapy=leapYears(nod1,nod4);

		}

		else{

			if(nod2>nod5){

				diff =total1-total2; //calculate difference between to dates

				//leapy=leapYears(nod1,nod4); // calling leapYears() method to get number of leap days between two dates

				//without leap adding leap year days

				//return diff;

			}

			else{

				diff =total2-total1; //calculate difference between to dates

				//leapy=leapYears(nod4,nod1); // calling leapYears() method to get number of leap days between two dates

				//without leap adding leap year days

				//return diff;

			}

		}

		return leapy+diff; // returns total diff days + total leap year days (which is 29th-Feb)

	}

	// This method will check how many leap years

	public int leapYears(int n1, int n2) // this method return number of leap
	// years between two dates

	// year values from two dates passed as parameter

	{

		int a = n2;

		int b = n1;

		int n = 0;

		if (a >= b)

		{

			while (a >= b) // checking one by one leap year

				// if first year value is greater than other then condition checked
				// as.....

			{

				if ((a % 100 == 0 && a % 400 == 0) || (a % 100 != 0 && a % 4 == 0))

					n++; // counting leap years

				a--;

			}

		} else

		{

			while (b > a) // if first year value is greater than other then
				// condition checked as.....

				if ((b % 100 == 0 && b % 400 == 0) || (b % 100 != 0 && b % 4 == 0))

					n++;

			b--;

		}

		return n;

	}

	// toString() method is used to display the contents of an object

	@Override

	public String toString() {

		return day + "/" + month + "/" + year;

	}

}

public class TestDateDriver {

	public static void main(String[] args) {

		// Declaring variables

		int month1, day1, year1, month2, day2, year2;

		/*
		 * 
		 * Creating an Scanner class object which is used to get the inputs
		 * 
		 * entered by the user
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		// Getting the input entered by the user

		System.out.print("Enter day of first date:");

		day1 = sc.nextInt();

		System.out.print("Enter month of first date:");

		month1 = sc.nextInt();

		System.out.print("Enter year of first date:");

		year1 = sc.nextInt();

		// Creating an Instance of Date class

		Date d1 = new Date(day1, month1, year1);

		// Getting the input entered by the user

		System.out.print("Enter day of second date:");

		day2 = sc.nextInt();

		System.out.print("Enter month of second date:");

		month2 = sc.nextInt();

		System.out.print("Enter year of second date:");

		year2 = sc.nextInt();

		// Creating an Instance of Date class

		Date d2 = new Date(day2, month2, year2);

		// Displaying the difference between two dates

		System.out.println("There are " + d1.daysTo(d2) + " days between " + d1.toString() + " and " + d2.toString());

	}

}