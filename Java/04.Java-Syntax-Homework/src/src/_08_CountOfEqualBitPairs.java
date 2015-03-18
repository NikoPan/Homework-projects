package src;

import java.util.Scanner;

/**
 * Created by Heisenberg on 16.12.2014 г..
 */
public class _08_CountOfEqualBitPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to count the bits '1'");

        int num = scan.nextInt();
        int counterOnes = 0;
        int counterZeros = 0;

        String numBin = Integer.toBinaryString(num);

        for (int i = 0; i < numBin.length(); i++) {
            if ((num & (3 << i)) >> i == 3) {
                counterOnes++;
            } else if ((num & (3 << i)) >> i == 0) {
                counterZeros++;
            }
        }
        System.out.printf("The number of ones in %s are: %d\n", num, counterOnes + counterZeros);
        System.out.printf("The number in binary format is: %s", String.format("%32s", numBin).replace(' ', '0'));
    }
}

