import java.util.Scanner;
public class AdditionQuizLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int NUMBER_OF_QUESTIONS = 10;
		
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		
		while (count < NUMBER_OF_QUESTIONS) {
			// Generate two random numbers between 1 and 15
			int n1 = (int) (Math.random() * 16);
			int n2 = (int) (Math.random() * 16);
			
			// Print the questions
			System.out.println(n1 + " + " + n2 + " =");
			
			// Read answer from user
			int answer1 = input.nextInt();
			
			// Check if the answer is correct
			if (answer1 == n1 + n2) {
				System.out.println("You're correct!");
				correctCount++;
			} else {
				System.out.println("The answer is " + (n1 + n2));
			}
			
			count++;
		}
		
		long endTime = System.currentTimeMillis();
		int testTimeInSeconds = (int) (endTime - startTime) / 1000;
		
		System.out.println("Correct count is " + correctCount);
		System.out.println("Test time is " + testTimeInSeconds + " seconds");
	}
}
