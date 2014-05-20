import java.util.Scanner;

public class PrintNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = input.nextInt();
		
		displayPattern(n);
		
	}
	
	public static void displayPattern(int n) {
		
		// Go through every row
		for (int i = 1; i <= n; i++) {
			
			// Go through every column
			for (int j = 1; j <= n; j++) {
				
				// Print spaces
				if (j <= n - i) {
					System.out.print("    ");
				
				// Print numbers
				} else {
					System.out.printf("%-4d", (n - j + 1));
				}
			}
			
			System.out.println();
		}
		
	}

	
}
