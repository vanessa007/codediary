import java.util.Scanner;

public class CheckSubstring {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first string: ");
    String first = input.nextLine();
    System.out.print("Enter the second string: ");
    String second = input.nextLine();

    if (isSubstring(first, second)) {
      System.out.println(first + " is a substring of " + second);
    }
    else {
      System.out.println(first + " is not a substring of " + second);
    }
  }

  public static boolean isSubstring(String first, String second) {
    int remainingLength = second.length();
    int startingIndex = 0;
    
    toWhile: while (first.length() <= remainingLength) {
        for (int i = 0; i < first.length(); i++) {
          if (first.charAt(i) != second.charAt(startingIndex+i)) {
            startingIndex++;
            remainingLength--;
            continue toWhile;
          }
        }

        return true;
      }

      return false;
    }
}
