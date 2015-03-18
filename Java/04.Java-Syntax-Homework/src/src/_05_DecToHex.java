package src;

import java.util.Scanner;

/**
 * Created by Heisenberg on 15.12.2014 г..
 */
public class _05_DecToHex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the decimal number");

        int numberDec = scan.nextInt();

        String numberHex = Integer.toHexString(numberDec);

        System.out.printf("The number in hexadecimal is %s",numberHex.toUpperCase());


    }
}
