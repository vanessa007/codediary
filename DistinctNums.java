import java.util.Scanner;
public class DistinctNums {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 10 numbers: ");
		
		int[] numbers = new int[10];
		boolean[] isDistict = new boolean[10];

		// Check if a certain number appears for the first time
		for(int i = 0; i < 10; i++) {
		    numbers[i] = input.nextInt();
		    isDistict[i] = true;
		    for(int j = 0; j < 10; j++) {
		        if(numbers[i] == numbers[j] && i != j) {
		        	isDistict[i] = false;
		        }
		    }
		}

		System.out.println("The distict numbers are: ");
		for(int i = 0; i < 10; i++) {
		    if(isDistict[i]) {
		        System.out.print(numbers[i] + " ");
		    }
		}
	}	
}
