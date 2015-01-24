import java.util.Scanner;

public class Pro6_FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();

		String hexA = Integer.toHexString(a);
		String binA = Integer.toBinaryString(a);

		System.out.printf("|%-10s|%010d|%10.2f|%-10.3f| ", hexA.toUpperCase(),
				Integer.parseInt(binA), b, c);
	}

}
