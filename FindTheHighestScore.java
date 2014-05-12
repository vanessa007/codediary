import java.util.Scanner;

public class FindTheHighestScore {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Read the number of students
    System.out.print("Enter the number of students: ");
    int numOfStudents = input.nextInt();

    // Read the first student's name and score
    System.out.print("Enter a student name: ");
    String student = input.next();
    System.out.print("Enter a student score: ");
    double score = input.nextDouble();

    // Read next students' names and scores
    for (int i = 0; i < numOfStudents - 1; i++) {
      System.out.print("Enter a student name: ");
      String nextStudent = input.next();
      System.out.print("Enter a student score: ");
      double nextScore = input.nextDouble();

      // Record the student's name with the highest score
      if (nextScore > score) {
        student = nextStudent;
        score = nextScore;
      }
    }

    System.out.println("Top student " +
      student + "'s score is " + score);
  }
}
