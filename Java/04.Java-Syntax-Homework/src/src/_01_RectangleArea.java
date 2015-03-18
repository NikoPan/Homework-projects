package src;


import java.util.Scanner;

/**
 * Created by Heisenberg on 7.12.2014 г..
 */
public class _01_RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the height and width of the rectangle separated with space (example: 2.5 3.6)");
        String str = scan.nextLine();
        double height = 0;
        double width = 0;
        double area = 1;
        str.split(" ");
        for (String s : str.split(" ")) {
            if (tryParse(s) == true) {
                area = area * Double.parseDouble(s);
            }
        }
        System.out.printf("The area of the rectangle is: %.2f\n", area);
    }

    static boolean tryParse(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}

