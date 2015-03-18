package Homework;

/*Write a method to convert from degrees to radians. 
 Write a method to convert from radians to degrees. 
 You are given a number n and n queries for conversion. 
 Each conversion query will consist of a number + space + measure. 
 Measures are "deg" and "rad". Convert all radians to degrees and all degrees to radians. 
 Print the results as n lines, each holding a number + space + measure. 
 Format all numbers with 6 digit after the decimal point. */

import java.util.Scanner;

public class Prob05_AngleUnitConverter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt(); // number of conversions

		double[] number = new double[n]; // values of the given queries
		String[] measure = new String[n]; // measure type

		for (int i = 0; i < n; i++) {
			number[i] = input.nextDouble(); // all values and measures goes in
											// arrays
			measure[i] = input.next();
		}
		for (int j = 0; j < n; j++) { // checking the type of conversion and
										// printing the calculated result
			if (measure[j].equals("rad")) {
				System.out.printf("%.6f deg\n", Math.toDegrees(number[j]));
			} else {
				double result = Math.toRadians(number[j]);
				Math.toDegrees(result);
				System.out.printf("%.6f rad\n", result);
			}
		}

	}
}
