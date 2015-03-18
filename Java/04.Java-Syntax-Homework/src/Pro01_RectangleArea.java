import java.util.Scanner;

public class Pro01_RectangleArea {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Rectangle Area \na = ");
		int a = input.nextInt();
		System.out.print("b = ");
		int b = input.nextInt();
		input.close();

		int area = a * b;
		System.out.println("Area = " + area);
	}

}
