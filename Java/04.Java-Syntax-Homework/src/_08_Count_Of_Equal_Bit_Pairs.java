import java.util.Scanner;


public class _08_Count_Of_Equal_Bit_Pairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = input.nextInt();
		String bin = Integer.toBinaryString(num);
		int count = 0;
		char check = '\u0000';
		
		for (int i = 0; i< bin.length(); i++){
			if (bin.charAt(i) == check){
				count++;
			}
			check = bin.charAt(i);
		}
		System.out.println("There are " + count + " sequences of equal bits in the binary representation of this number.");

	}

}
