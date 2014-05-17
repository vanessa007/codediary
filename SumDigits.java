import java.util.Scanner;

public class SumDigits {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int value = input.nextInt();
		
		System.out.println("The sum of digits is " + sumDigits(value));
	}
	
	public static int sumDigits(int value) {
		int sum = 0;
		
		while (value != 0) {
			int remainder = value % 10;
			sum += remainder;
			value = value / 10;
		}
		
		return sum;
	}

		
}
