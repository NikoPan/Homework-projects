package Homework;

import java.util.Scanner;
import java.util.*;

public class Prob01_SortArrayOfNumbers {

	public static void main(String[] args) {
		// TODO Write a program to enter a number n and n integer numbers and
		// sort and print them. Keep the numbers in array of integers: int[].

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());

		String[] line = input.nextLine().split(" ");

		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(line[i]);
		}

		Arrays.sort(numbers);

		for (int i : numbers) {
			System.out.print(i + " ");
		}
	}
}
