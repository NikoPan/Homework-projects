package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob06_CountSpecifiedWord {
	public static void main(String[] args) {
		// TODO Write a program to find how many times a word appears in given
		// text. The text is given at the first input line. The
		// target word is given at the second input line. Please ignore the
		// character casing. Consider that any non-letter character is a word
		// separator.

		Scanner input = new Scanner(System.in);
		String[] sentence = input.nextLine().split("\\W+");
		String word = input.nextLine();
		int counter = 0;

		//due to lowercase as input the the words from sentence are cast to lowercase too
		for (int i = 0; i < sentence.length; i++) {
			if (sentence[i].toLowerCase().equals(word)) {
				counter++;
			}
		}
		System.out.println(counter);

	}
}
