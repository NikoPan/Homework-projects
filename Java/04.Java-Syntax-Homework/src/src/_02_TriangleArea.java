package src;

import java.util.Scanner;

/**
 * Created by Heisenberg on 7.12.2014 г..
 */
public class _02_TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coordinates of the points in format X Y delimited by space");
        System.out.println("Enter the coordinates of the first point");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println("Enter the coordinates of the second point");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        System.out.println("Enter the coordinates of the third point");
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();

        double area;
        area = Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2);

        if (area == 0) {
            System.out.println("The three points doesn't form a triangle!");
        } else {
            System.out.printf("The area of the triangle is: %.2f",area);
        }
    }
}
