package Homework;

import java.util.Scanner;

public class Prob02_Generate3LetterWords {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String letters = input.nextLine();
		input.close();
		char[] ch = letters.toCharArray();
		
		for (int i = 0; i < ch.length; i++)
			  for (int j = 0; j < ch.length; j++)
			    for (int k = 0; k < ch.length; k++)
			            System.out.format("%c%c%c ", ch[i], ch[j], ch[k]);
		}	
}
