package BitRotation;

import java.util.Scanner;

public class BitRotation_Broken {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte number = Byte.parseByte(input.nextLine());
        byte rotations = Byte.parseByte(input.nextLine());

        for (int i = 0; i < rotations; i++) {
            String direction = input.nextLine();

            if (direction == "right") {
                int rightMostBit = number & 1;
                number >>= 1;
                number |= rightMostBit << 6;
            } else if (direction == "left") {
                int leftMostBit = (number >> 6) & 1;
                number <<= 1;
                number |= leftMostBit;
            }
        }

        System.out.println(number);
    }
}
