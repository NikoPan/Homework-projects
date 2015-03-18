import java.util.Scanner;

public class SumTwoNumbers {
	
        public static void main(String[] args) {
        	
                Scanner scanner = new Scanner(System.in);
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                int sum = first + second;
                System.out.println(sum);
                scanner.close();
        }
}