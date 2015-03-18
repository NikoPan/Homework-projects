package src;

import java.util.Scanner;

/**
 * Created by Heisenberg on 16.12.2014 г..
 */
public class _07_CountOfBitsOne {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the number to count the bits '1'");

        int num = scan.nextInt();
        int counter = 0;

        String numBin = Integer.toBinaryString(num);

        for (int i = 0; i < numBin.length(); i++) {
            if ((num&(1<<i))!=0) {
                counter++;
            }
        }
        System.out.printf("The number of ones in %s are: %s\n", num, counter);
        System.out.printf("The number in binary format is: %s",String.format("%32s",numBin).replace(' ','0'));
    }
}
