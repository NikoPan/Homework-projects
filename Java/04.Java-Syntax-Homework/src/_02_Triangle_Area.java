import java.util.Scanner;


public class _02_Triangle_Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter coordinates for a: ");
		int aX = input.nextInt();
		int aY = input.nextInt();
		System.out.println("Enter coordinates for b: ");
		int bX = input.nextInt();
		int bY = input.nextInt();
		System.out.println("Enter coordinates for c: ");
		int cX = input.nextInt();
		int cY = input.nextInt();
		
		int area = Math.abs(aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
		System.out.println("Area of triangle is: " + area);
		
		
		
	}

}
