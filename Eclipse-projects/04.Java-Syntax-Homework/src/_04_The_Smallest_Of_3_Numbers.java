import java.util.Scanner;


public class _04_The_Smallest_Of_3_Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = input.nextDouble();
		System.out.println("Enter b: ");
		double b = input.nextDouble();
		System.out.println("Enter c: ");
		double c = input.nextDouble();

		if (a < b){
			if (a < c){
				System.out.println("Smallest is: " + a);
			} else {
				System.out.println("Smallest is: " + b);
			}
		}
		else if (b < c){
			System.out.println("Smallest is: " + b);
		}
		else {
			System.out.println("Smallest is: " + c);
		}
		
	}

}
