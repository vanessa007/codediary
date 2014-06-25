import java.util.*;
public class RepeatedTimes {
  public static void main(String[] args) {
    // Enter the string
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String string = input.nextLine();

    // Prompt the user to enter a character
    System.out.print("Enter a character: ");
    char ch = input.nextLine().charAt(0);

    int count = count(string, ch);
    System.out.println(count);
  }

  public static int count(String string, char ch) {
    int count = 0;
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == ch) {
        count++;
      }
    }
    return count;
  }
}
