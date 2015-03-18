package Homework;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Prob03_FullHouse {
	public static void main(String[] args) {

		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		char[] paint = { '\u2663', '\u2666', '\u2665', '\u2660' };

		String[] deck = new String[52];

		int all = 0;
		for (int f = 0; f < 13; f++) {
			for (int p = 0; p < 4; p++) {
				deck[all] = (faces[f] + paint[p]);   //loading all cards in deck array
				all++;
			}
		}
		int counter = 0;

		for (int n = 0; n < 13; n++) {  			//Logic
			
			for (int a = n * 4; a < (n * 4 + 4); a++) {
				for (int b = a + 1; b < (n * 4 + 4); b++) {
					for (int c = b + 1; c < (n * 4 + 4); c++) {

						for (int m = 0; m < 13; m++) {
							
							if (n != m) {
								
								for (int d = m * 4; d < (m * 4 + 4); d++) {
									for (int e = d + 1; e < (m * 4 + 4); e++) {
										
										System.out.printf("(%s%s%s%s%s) ",
												deck[a], deck[b], deck[c],
												deck[d], deck[e]);
										counter++;
									}
								}
							}
						}

					}
				}
			}
		}
		System.out.println("\n" + counter + " full houses");
	}
}