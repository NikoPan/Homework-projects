package src;

import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by Heisenberg on 16.12.2014 г..
 */
public class _06_FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = scan.nextInt();
        System.out.println("Enter a floating point number");
        double b = scan.nextDouble();
        System.out.println("Enter a floating point number");
        double c = scan.nextDouble();

        String numHex = Integer.toHexString(a);
        String numBin = Integer.toBinaryString(a);

        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", numHex.toUpperCase(), String.format("%10s",numBin).replace(' ','0'), b, c);

    }
}
