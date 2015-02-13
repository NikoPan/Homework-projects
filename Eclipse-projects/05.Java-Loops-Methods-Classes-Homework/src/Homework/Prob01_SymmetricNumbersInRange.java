package Homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.xml.stream.events.Characters;

public class Prob01_SymmetricNumbersInRange {
	// Write a program to generate and print all symmetric numbers in given
	// range [start…end] (0 ≤ start ≤ end ≤ 999). A number is symmetric if its
	// digits are symmetric toward its middle. For example, the numbers 101, 33,
	// 989 and 5 are symmetric, but 102, 34 and 997 are not symmetric.
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int startRange = input.nextInt();
		int endRange = input.nextInt();
		int lenght = endRange - startRange + 1;
		String[] secuence = new String[lenght];
		{
			while (endRange >= startRange) {
				for (int i = 0; i < secuence.length; i++) {
					secuence[i] = String.valueOf(startRange);
					startRange++;
				}
				for (String number : secuence) {
					if (Integer.valueOf(number) < 10) {
						System.out.print(number + " ");
						
					} else {
						int last = number.length() - 1;
						int first = 0;
						Boolean match = false;

						if (number.charAt(first) == number.charAt(last)) {
							match = true;
							last--;
							first++;
							
						} else {
							match = false;
							
						}
						if (match == true) {
							System.out.print(number + " ");
						}
					}
				}
			}

		}
	}
}