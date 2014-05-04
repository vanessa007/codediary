import java.util.Scanner;
public class LearnToAdd {
	public static void main(String[] args) {
		
		// Generate two integers randomly
		int firstNumber = (int) (Math.random() * 200); 
		int secondNumber = (int) (Math.random() * 200);
		
		// Ask for the sum of two integers from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sum of " + firstNumber + " and " + secondNumber + ": ");
		int studentAnswer = input.nextInt();
		
		// Tell the user if the answer is correct
		System.out.println(studentAnswer == firstNumber + secondNumber);
	}
}
