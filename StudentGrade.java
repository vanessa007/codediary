import java.util.Scanner;
public class StudentGrade {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the number of students
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		// Prompt user to enter all the scores
		System.out.println("Enter " + numberOfStudents + " scores: ");
		
		// Create an array to store the scores
		int[] scores = new int[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			scores[i] = input.nextInt();
		}
		
		// Compare each score to best score - 10
		for (int i = 0; i < numberOfStudents; i++) {
			if (scores[i] >= best(scores) - 10) {
				System.out.println("Student " + i + ": score is " + scores[i] + " and grade is A");
			} else if (scores[i] >= best(scores) - 20) {
				System.out.println("Student " + i + ": score is " + scores[i] + " and grade is B");
			} else if (scores[i] >= best(scores) - 30) {
				System.out.println("Student " + i + ": score is " + scores[i] + " and grade is C");
			} else if (scores[i] >= best(scores) - 40) {
				System.out.println("Student " + i + ": score is " + scores[i] + " and grade is D");
			} else {
				System.out.println("Student " + i + ": score is " + scores[i] + " and grade is F");
			}
		}
		
		
		
	}
	
	public static int best(int[] list) {
		int best = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] > best) {
				best = list[i];
			}
		}
		return best;
	}
	

}
