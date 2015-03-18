package src;

import java.util.*;

/**
 * Created by Heisenberg on 15.12.2014 г..
 */
public class _04_TheSmallestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of elements to compare number");
        int numElem = scan.nextInt();
        List<Double> list = new ArrayList<Double>();


        System.out.println("Input the numbers");
        for (int i = 0; i < numElem; i++) {
            list.add(scan.nextDouble());
        }

        System.out.printf("The maximum number in the list is: %.0f",Collections.max(list));

    }
}
