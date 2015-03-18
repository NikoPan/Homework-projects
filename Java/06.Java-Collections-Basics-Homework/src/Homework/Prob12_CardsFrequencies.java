package Homework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Prob12_CardsFrequencies {

	public static void main(String[] args) {
		// TODO We are given a sequence of N playing cards from a standard deck.
		// The input consists of several cards (face + suit),
		// separated by a space. Write a program to calculate and print at the
		// console the frequency of each card face in
		// format "card_face -> frequency". The frequency is calculated by the
		// formula appearances / N and is expressed in
		// percentages with exactly 2 digits after the decimal point. The card
		// faces with their frequency should be printed in
		// the order of the card face's first appearance in the input. The same
		// card can appear multiple times in the input, but
		// it's face should be listed only once in the output.

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String[] sequence = input.nextLine().split("\\s+");
		LinkedHashMap<String, Integer> frequency = new LinkedHashMap<String, Integer>();
		double total = sequence.length;
		
		for (String card : sequence) {
			String face = card.substring(0, card.length() - 1);
			if (frequency.containsKey(face)) {
				frequency.put(face, frequency.get(face) + 1);
			} else {
				frequency.put(face, 1);
			}
		}
		for (String card : frequency.keySet()) {
			double percent = frequency.get(card) / total * 100;
			System.out.printf("%S -> %.2f%%\n", card, percent);
		}
	}
}
