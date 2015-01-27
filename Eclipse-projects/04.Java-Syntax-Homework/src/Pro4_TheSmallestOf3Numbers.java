import java.util.Scanner;

public class Pro4_TheSmallestOf3Numbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();

		input.close();

		float smallest = 0;

		if (a <= b && a <= c) {
			smallest = a;
		}
		if (b <= a && b <= c) {
			smallest = b;
		}
		if (c <= a && c <= a) {
			smallest = c;
		}
		if (smallest % 1 == 0) {
			System.out.println((int) smallest);
		} else {
			System.out.println(smallest);

		}
	}

}