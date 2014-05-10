import java.util.Scanner;
public class NegativePositveZeroAndAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Read an initial data
		int positive = 0;
		int negative = 0;
		System.out.println("Enter an int value, the program exits if the input is 0: ");
		int num = input.nextInt();
		if (num > 0) {
			positive = 1;
		} else if (num < 0) {
			negative = 1;
		}
		
		// Keep reading data until the num is 0
		
		int sum = num;
		int count = 0;
		while (num != 0) {
			System.out.println("Enter an int value, the program exits if the input is 0: ");
			num = input.nextInt();
			sum += num;
			count++;
			if (num > 0) {
				positive++;
			} else if (num < 0) {
				negative++;
			}
		}
		
		// Calculate the average number
		double average = (double) sum / count;
		
		// Print results
		System.out.println("The number of positives is " + positive);
		System.out.println("The number of negative is " + negative);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + average);
	}

}
