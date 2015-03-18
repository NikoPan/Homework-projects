import java.util.Scanner;


public class _05_Decimal_To_Hexadecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input: ");
		int num = input.nextInt();
		String hex = Integer.toHexString(num).toUpperCase();
		System.out.println("Output: " + hex);
		
	}

}
