package mat25;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class TenThousandDaysOld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate dob = LocalDate.of(2000, Month.JANUARY, 1);
		System.out.println("I will be 10000 days old on" + dob.plusDays(10000));

	}
}
