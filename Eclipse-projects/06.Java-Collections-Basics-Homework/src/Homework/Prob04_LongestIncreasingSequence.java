package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob04_LongestIncreasingSequence {

	public static void main(String[] args) {
		// TODO Write a program to find all increasing sequences inside an array
		// of integers. Print the sequences in the order of their
		// appearance in the input array, each at a single line.
		// Separate the sequence elements by a space. Find also the longest
		// increasing sequence and print it at the last line. If
		// several sequences have the same longest length, print the leftmost of
		// them.

		Scanner input = new Scanner(System.in);
		String[] line = input.nextLine().split(" ");
		int[] numbers = new int[line.length];
		int counter = 0;
		int longest = 1;
		int index = 0;
		int position = (index - (counter - 1));


		for (int i = 0; i < line.length; i++) {
			numbers[i] = Integer.parseInt(line[i]);
		}

		//the first number in the sequence is always printed first
		System.out.print(numbers[0] + " ");

		//increasing check
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[i - 1]) {
				System.out.print(numbers[i] + " ");
				longest++;
			} 
			//if there is no ascension we print the next first number sequence  
			else {
				System.out.println();
				System.out.print(numbers[i] + " ");
				longest = 1;
			}
			//counter takes the highest value of longest
			if (longest > counter) {
				counter = longest;
				index = i;
			}
		}

		System.out.println();
		System.out.print("Longest: ");
		
		if (counter > 1) {
			
			for (int y = 0; y < counter; y++) {
				System.out.print(numbers[position] + " ");
				position++;
			}
		} else {
			System.out.print(numbers[0]);
		}
	}
}
