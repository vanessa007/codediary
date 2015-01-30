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
		for(int i=0;i<n.length();i++){
			if(i==3||i==6){
				if(n.charAt(i)!='-'){
					return false;
				}
			}else if(!Character.isDigit(n.charAt(i)){
					return false;
				}
			}
		}
		return true;
	}
}
