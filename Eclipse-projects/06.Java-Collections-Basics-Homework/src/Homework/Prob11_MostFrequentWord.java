package Homework;

import java.util.Scanner;
import java.util.TreeMap;

public class Prob11_MostFrequentWord {

	public static void main(String[] args) {
		// TODO Write a program to find the most frequent word in a text and
		// print it, as well as how many times it appears in
		// format "word -> count". Consider any non-letter character as a word
		// separator. Ignore the character casing. If
		// several words have the same maximal frequency, print all of them in
		// alphabetical order.
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		String[] text = input.nextLine().trim().toLowerCase()
				.split("[^a-zA-Z]+");
		TreeMap<String, Integer> wordCount = new TreeMap<String, Integer>();
		int maximum = 0;
		
		for (int i = 0; i < text.length; i++) {
			String current = text[i];
			int counter = 0;
			for (String word : text) {
				if (current.equals(word)) {
					counter++;
				}
			}
			if (counter > maximum) {
				maximum = counter;
			}
			wordCount.put(current, counter);
		}
		for (String word : wordCount.keySet()) {
			if (wordCount.get(word) == maximum) {
				System.out.println(word + " -> " + wordCount.get(word)
						+ " times");
			}
		}
	}
}