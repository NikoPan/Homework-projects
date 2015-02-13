package Homework;

import java.util.Scanner;

public class Prob05_CountAllWords {
	public static void main(String[] args) {
		// TODO Write a program to count the number of words in given sentence.
		// Use any non-letter character as word separator.
		Scanner input = new Scanner(System.in);
		String[] text = input.nextLine().split("\\W+");

		System.out.println(text.length);
	}
}
