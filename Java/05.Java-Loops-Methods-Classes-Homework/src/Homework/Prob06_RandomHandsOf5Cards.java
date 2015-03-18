package Homework;

import java.util.Random;
import java.util.Scanner;

public class Prob06_RandomHandsOf5Cards {

	public static void main(String[] args) {
		// TODO Write a program to generate n random hands of 5 different cards
		// form a standard suit of 52 cards.

		Scanner input = new Scanner(System.in);
		int draws = input.nextInt();
		Random shuffle = new Random();

		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		char[] paint = { '\u2663', '\u2666', '\u2665', '\u2660' };

		String[] deck = new String[52];

		int all = 0;
		for (int f = 0; f < 13; f++) {
			for (int p = 0; p < 4; p++) {
				deck[all] = (faces[f] + paint[p]); // loading all cards in deck
													// array
				all++;
			}
		}

		for (int i = draws; draws > 0; draws--) { // prints n times a hand of
													// 5 random cards at the console

			for (int suit = 0; suit < 5; suit++) {

				System.out.printf("%s", deck[shuffle.nextInt(52)]);
			}
			System.out.println();
		}
	}

}
