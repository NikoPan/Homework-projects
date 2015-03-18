import java.util.Scanner;

public class Pro02_TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Triangle Area \nx(A) = ");
		int xA = input.nextInt();
		System.out.print("y(A) = ");
		int yA = input.nextInt();
		System.out.print("x(B) = ");
		int xB = input.nextInt();
		System.out.print("y(B) = ");
		int yB = input.nextInt();
		System.out.print("y(C) = ");
		int xC = input.nextInt();
		System.out.print("y(C) = ");
		int yC = input.nextInt();

		input.close();

		int area = Math.abs(xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB)) / 2;
		System.out.printf("Area = " + area);

	}

}
