package Homework;

import java.io.BufferedReader;
import java.io.FileReader;

public class Prob8_SumNumbersFromText {
	public static void main(String[] args) {

		// TODO Write a program to read a text file "Input.txt" holding a
		// sequence of
		// integer numbers, each at a separate line. Print the sum of the
		// numbers at the console. Ensure you close correctly the file in case
		// of exception or in case of normal execution. In case of exception
		// (e.g. the file is missing), print "Error" as a result.

		BufferedReader reader;
		int sum = 0;

		try {
			reader = new BufferedReader(new FileReader("src/input.txt"));
			String text = null;
			
			//reads every line from the .txt file as integer and adds it to the total sum
			while ((text = reader.readLine()) != null) {
				
				int number = Integer.parseInt(text);
				sum += number;
			}
			System.out.println(sum);
		
			//if file is missing type message "Error"
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
