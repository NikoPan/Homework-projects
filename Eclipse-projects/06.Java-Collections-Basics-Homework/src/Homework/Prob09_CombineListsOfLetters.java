package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob09_CombineListsOfLetters {

	public static void main(String[] args) {
		// TODO Write a program that reads two lists of letters l1 and l2 and
		// combines them: appends all letters c from l2 to the end
		// of l1, but only when c does not appear in l1. Print the obtained
		// combined list.
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String[] l1 = input.nextLine().trim().split("\\s+");
		String[] l2 = input.nextLine().trim().split("\\s+");
		ArrayList<Character> firstArray = new ArrayList<Character>();
		ArrayList<Character> secondArray = new ArrayList<Character>();
		
		for (String letter : l1) {
			firstArray.add(letter.charAt(0));
		}
		for (String letter : l2) {
			secondArray.add(letter.charAt(0));
		}
		secondArray.removeAll(firstArray);
		firstArray.addAll(secondArray);
		for (Character letter : firstArray) {
			System.out.print(letter + " ");
		}
	}
}
