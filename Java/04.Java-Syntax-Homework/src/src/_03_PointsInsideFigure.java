package src;

import java.util.Scanner;

/**
 * Created by Heisenberg on 10.12.2014 г..
 */
public class _03_PointsInsideFigure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter point coordinates in format X Y delimited by space");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        checkPoint(x, y);
        main(args);
    }

    static void checkPoint(double x, double y) {
        if ((x >= 12.5 & x <= 22.5) & (y >= 6 & y <= 13.5)) {
            System.out.println("Inside");
        } else if ((x >= 12.5 & x <= 17.5) & (y >= 8.5 & y <= 13.5)) {
            System.out.println("Inside");
        } else if ((x >= 20 & x <= 22.5) & (y >= 8.5 & y <= 13.5)) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}

