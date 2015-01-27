import java.util.Scanner;

public class Pro03_PointsInsideFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float x = input.nextFloat();
		float y = input.nextFloat();

		input.close();

		if ((x >= 12.5 && y >= 6 && y <= 13.5 && x <= 22.5)
				&& !(x > 17.5 && y > 8.5 && y < 13.5 && x < 20)) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}
}
