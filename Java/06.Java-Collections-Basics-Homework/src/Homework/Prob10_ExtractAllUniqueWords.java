package Homework;

import java.util.Scanner;
import java.util.TreeSet;

public class Prob10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		// TODO At the first line at the console you are given a piece of text.
		// Extract all words from it and print them in alphabetical
		// order. Consider each non-letter character as word separator.

		Scanner input = new Scanner(System.in);
		String[] text = input.nextLine().trim().toLowerCase()
				.split("[^a-zA-Z]+");
		TreeSet<String> words = new TreeSet<String>();

		for (String word : text) {
			words.add(word);
		}
		for (String word : words) {
			System.out.println(word);
		}
	}
}
