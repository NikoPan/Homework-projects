import java.util.Scanner;

public class Pro5_DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Dec value = ");
		int decNumber = input.nextInt();

		String hex = Integer.toHexString(decNumber);
		input.close();

		System.out.println("Hex value = " + hex.toUpperCase());
	}

}
