package Homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob08_ExtractEmails {

	public static void main(String[] args) {
		// TODO Write a program to extract all email addresses from given text.
		// The text comes at the first input line. Print the
		// emails in the output, each at a separate line. Emails are considered
		// to be in format <user>@<host>,

		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		Pattern search = Pattern
				.compile("(\\w+\\d*\\.*\\-*\\_*)+\\@+(\\w+\\.+\\w+\\.*\\w*)+");
		Matcher match = search.matcher(text);

		while (match.find()) {
			System.out.print(match.group());
			System.out.println();
		}	
	}
}
