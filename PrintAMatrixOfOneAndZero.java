import java.util.Scanner;

public class PrintAMatrixOfOneAndZero {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Prompt use to enter an integer
		System.out.println("Enter an integer: ");
		
		int n = input.nextInt();
		
		printMatrix(n);
		
	}
	
	public static void printMatrix(int n) {
		
		// Go through every row
		for (int i = 1; i <= n; i++) {
			
			// Go through every column
			for (int j = 1; j <= n; j++) {
				
				int randomNum = (int)(Math.random() * 2);
				System.out.print("  " + randomNum + "  ");
			}
			
			System.out.println();
		}
	}

}
