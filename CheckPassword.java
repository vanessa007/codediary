import java.util.Scanner;
import java.lang.*;

public class CheckPassword {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your password: ");
		String s = input.nextLine();
		
		StringBuilder sb = new StringBuilder(s);
		
		if (check(sb)) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
		}
	}
	
	public static boolean check(StringBuilder sb) {
		
		if (sb.length() != 8) return false;
		
		for (int i = 0; i < sb.length(); i++) {
			if (!Character.isLetterOrDigit(sb.charAt(i))) {
				return false;
			}
		}
		
		int countNum = 0;
		
		for (int i = 0; i < sb.length(); i++) {
			if (Character.isDigit(sb.charAt(i))) {
				countNum++;
			}
		}
		
		if (countNum < 2) return false;
		
		return true;
	}

}
