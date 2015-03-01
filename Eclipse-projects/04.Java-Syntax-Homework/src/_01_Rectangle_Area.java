import java.util.Scanner;


public class _01_Rectangle_Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sides: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int area = a * b;
		System.out.println("The area is: " + area);

	}

}
