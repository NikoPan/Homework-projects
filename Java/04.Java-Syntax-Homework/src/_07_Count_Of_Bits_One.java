import java.util.Scanner;


public class _07_Count_Of_Bits_One {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = input.nextInt();
		String bin = Integer.toBinaryString(num);
		int count = 0;
		
		for (int i = 0; i < bin.length(); i++){
			if (bin.charAt(i) == '1'){
				count++;
			}
		}
		System.out.println("There are total of " + count + " ones in this number's binary form.");

	}

}
