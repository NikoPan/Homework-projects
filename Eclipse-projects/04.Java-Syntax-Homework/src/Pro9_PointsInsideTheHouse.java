import java.util.Scanner;

public class Pro9_PointsInsideTheHouse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();

		input.close();

		double x1 = 12.5;
		double y1 = 8.5;
		double x2 = 17.5;
		double y2 = 3.5;
		double x3 = 22.5;
		double y3 = 8.5;

		double areaABC = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2;
		double areaPAB = Math.abs(x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2)) / 2;
		double areaPAC = Math.abs(x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y)) / 2;
		double areaPBC = Math.abs(x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2)) / 2;

		if ((areaABC >= areaPAB + areaPAC + areaPBC)
				|| ((x >= 12.5 && y >= 8.5 && x <= 22.5 && y <= 13.5) && !(x > 17.5
						&& y > 8.5 && y < 13.5 && x < 20))) {
			System.out.printf("Inside");
		}
		else{
			System.out.println("Outside");

		}

		// int area = Math.abs(xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB))
		// / 2;
		// System.out.printf("Inside" + area);

	}

}
