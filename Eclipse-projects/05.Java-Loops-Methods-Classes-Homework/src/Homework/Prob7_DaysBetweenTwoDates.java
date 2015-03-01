package Homework;

import java.util.Scanner;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class Prob7_DaysBetweenTwoDates {
	public static void main(String[] args) {
		// Write a program to calculate the difference between two dates in
		// number of days. The dates are entered at two consecutive lines in
		// format day-month-year. Days are in range [1…31]. Months are in range
		// [1…12]. Years are in range [1900…2100].

		Scanner input = new Scanner(System.in);

		String firstDate = input.next();
		String secondDate = input.next();

		//taking the values for days,months and years of each given date
		String[] firstDates = firstDate.split("-");
		String[] secondDates = secondDate.split("-");

		//Assigning the values to DateTime variable
		DateTime start = new DateTime(Integer.parseInt(firstDates[2]),  
				Integer.parseInt(firstDates[1]),
				Integer.parseInt(firstDates[0]), 0, 0);

		DateTime end = new DateTime(Integer.parseInt(secondDates[2]),
				Integer.parseInt(secondDates[1]),
				Integer.parseInt(secondDates[0]), 0, 0);

		//calculating day between the two dates
		long totalDays = Days.daysBetween(start, end).getDays();

		System.out.println(totalDays);
	}
}
