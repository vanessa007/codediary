import java.util.Scanner;
import java.lang.String;

public class CheckSSN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter SSN number: ");
		String ssn = input.nextLine();
		
		if (ssn.length() != 11) {
			System.out.println("Invalid SSN");
		} else if (!check(ssn)) {
			System.out.println("Invalid SSN");
		} else {
			System.out.println("Valid SSN");
		}
	}
	
	public static boolean check(String n) {
		if (!n.substring(3, 4).equals("-")) {
			return false;
		}
		if (!n.substring(6, 7).equals("-")) {
			return false;
		}
		if (!Character.isDigit(n.charAt(0))) {
			return false;
		}
		if (!Character.isDigit(n.charAt(1))) {
			return false;
		}
		if (!Character.isDigit(n.charAt(2))) {
			return false;
		}
		if (!Character.isDigit(n.charAt(4))) {
			return false;
		}
		if (!Character.isDigit(n.charAt(5))) {
			return false;
		}
		if (!Character.isDigit(n.charAt(7))) {
			return false;
		}
		if (!Character.isDigit(n.charAt(8))) {
			return false;
		}
		if (!Character.isDigit(n.charAt(9))) {
			return false;
		}
		if (!Character.isDigit(n.charAt(10))) {
			return false;
		}
		return true;
	}
}
