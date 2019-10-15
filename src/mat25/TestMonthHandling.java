package mat25;

import java.time.LocalDate;
import java.time.Month;

public class TestMonthHandling {
public static void main(String[] args) {
	LocalDate jan31=LocalDate.of(2018,Month.JANUARY,31);
	LocalDate dec31=LocalDate.of(2018,Month.DECEMBER,31);
	System.out.println("When 1 month is added :");
	System.out.println("Date 1 : "+jan31.plusMonths(1));
	System.out.println("Date 2 : "+dec31.plusMonths(1));

	System.out.println("When 2 months is added :");
	System.out.println("Date 1 : "+jan31.plusMonths(2));
	System.out.println("Date 2 : "+dec31.plusMonths(2));

	System.out.println("When 3 months is added :");
	System.out.println("Date 1 : "+jan31.plusMonths(3));
	System.out.println("Date 2 : "+dec31.plusMonths(3));

}
}
