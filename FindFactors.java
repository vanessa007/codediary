import java.util.Scanner;
public class FindFactors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to input an integer
		System.out.println("Enter an integer: ");
		
		// Read the integer from user
		int num = input.nextInt();
		int factor = 2;
		
		while (factor <= num) {
			if (num % factor == 0) {
				num = num / factor;
				System.out.println(factor);
			} else {
				factor++;
			}
		}	
	
	}

}
