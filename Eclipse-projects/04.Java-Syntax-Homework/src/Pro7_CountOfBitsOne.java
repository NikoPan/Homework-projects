import java.util.Scanner;

public class Pro7_CountOfBitsOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int counter = Integer.bitCount(n);
		input.close();

		System.out.println(counter);
	}
}
