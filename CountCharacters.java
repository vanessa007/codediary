import java.util.Scanner;

public class CountCharacters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String string = input.nextLine();
		
		for (int i = 0; i < 10; i++) {
			if (count(string)[i] != 0) {
				System.out.println(i + ": " + count(string)[i]);
			}
		}
	}
	
	public static int[] count(String s) {
		int[] countArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				countArray[Integer.parseInt(Character.toString(s.charAt(i)))]++;
			}
		}
		return countArray;
	}

	
}
