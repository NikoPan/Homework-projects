package Homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob07_CountSubstringOccurrences {

	public static void main(String[] args) {
		// TODO Write a program to find how many times given string appears in
		// given text as substring.

		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String word = input.nextLine();
		Pattern search = Pattern.compile(word);
		Matcher match = search.matcher(sentence);
		int counter = 0;

		while (match.find()) {
			int index = match.start();
			match.region(index + 1, sentence.length());
			counter++;
		}
		System.out.println(counter);
	}
}
