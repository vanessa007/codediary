import java.util.Scanner;
public class NineHeadsAndTails {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 511: ");
		
		// Read a decimal number between 0 and 511
		int decimalNum = input.nextInt();
		
		// Create an array, each element is a digit of a binary number
		int[] binaryNum = new int[9];
		
		for (int i = 0; i < 9; i++) {
			if (decimalNum >= 1) {
				if (decimalNum % 2 == 0) {
					binaryNum[i] = 0;
					decimalNum = (int) decimalNum / 2;
				} else {
					binaryNum[i] = 1;
					decimalNum = (int) decimalNum / 2;
				}
			} else {
				binaryNum[i] = 0;
			}
		}
		
		// Generate an array of String from int[]binaryNum
		String [] headsAndTails = new String[9];
		
		int count = 0;
		for (int i = 0; i < 9; i++) {
			if (binaryNum[i] == 0) {
				headsAndTails[i] = "H";
			} else {
				headsAndTails[i] = "T";			
			}
			count++;
			System.out.print(headsAndTails[i] + " ");
			if (count % 3 == 0) {
				System.out.println();
			}
		}
	}
	

}