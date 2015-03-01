import java.util.Scanner;


public class _06_Formatting_Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		float b = input.nextFloat();
		System.out.println("Enter c: ");
		float c = input.nextFloat();
		
		System.out.printf("|%-10X", a);
		System.out.printf(String.format("|%10s|", Integer.toBinaryString(a)).replace(" ", "0"));
		System.out.printf("%10.2f|", b);
		System.out.printf("%-10.3f|", c);

	}

}
