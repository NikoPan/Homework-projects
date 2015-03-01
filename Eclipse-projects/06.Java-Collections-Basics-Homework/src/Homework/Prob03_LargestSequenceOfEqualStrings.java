package Homework;

import java.util.Scanner;

public class Prob03_LargestSequenceOfEqualStrings {
	public static void main(String[] args) {
		// TODO Write a program that enters an array of strings and finds in it
		// the largest sequence of equal elements.

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String[] line = input.nextLine().split("\\s+");
		int counter = 1;
		int maximum = 1;
		int index = 0;

		for (int i = 0; i < line.length - 1; i++) {
			if (line[i].equals(line[i + 1])) {
				counter++;
			} else {
				counter = 1;
			}
			if (counter > maximum) {
				maximum = counter;
				index = i;
			}
		}
		for (int i = 0; i < maximum; i++) {
			System.out.print(line[index] + " ");
		}
	}
}