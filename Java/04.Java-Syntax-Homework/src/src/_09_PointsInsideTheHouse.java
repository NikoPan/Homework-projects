package src;

import java.util.Scanner;

/**
 * Created by Heisenberg on 17.12.2014 г..
 */
public class _09_PointsInsideTheHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter point coordinates in format X Y delimited by space");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        checkPoint(x, y);
        main(args);
    }

    static void checkPoint(double x, double y) {
        if (((17.5 - 12.5) * (y - 8.5) - (3.5 - 8.5) * (x - 12.5)) >= 0 & ((22.5 - 17.5) * (y - 3.5) - (8.5 - 3.5) * (x - 17.5)) >= 0 & y <= 8.5) {
            System.out.println("Inside\n");
        } else if ((x >= 12.5 & x <= 17.5) & (y >= 8.5 & y <= 13.5)) {
            System.out.println("Inside\n");
        } else if ((x >= 20 & x <= 22.5) & (y >= 8.5 & y <= 13.5)) {
            System.out.println("Inside\n");
        } else {
            System.out.println("Outside\n");
        }
    }
}
