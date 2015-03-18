package Homework;

import java.util.Scanner;

public class Prob02_SequencesOfEqualStrings {
	public static void main(String[] args) {
		// TODO Write a program that enters an array of strings and finds in it
		// all sequences of equal elements.

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String[] line = input.nextLine().split("\\s+");

		if (line.length == 1) {
			System.out.println(line[0]);
		}
		for (int i = 0; i < line.length - 1; i++) {
			if (line[i].equals(line[i + 1])) {
				System.out.print(line[i] + " ");
			} else {
				System.out.println(line[i]);
			}
		}
		if (line.length != 1) {
			System.out.print(line[line.length - 1]);
		}
	}
}
