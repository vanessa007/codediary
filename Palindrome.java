import java.util.Scanner;
public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		
		int number = input.nextInt();
		
		System.out.println(checkIntegerPalindrome(number));
		System.out.println(reverse(number));
		
	}
	
	public static String checkIntegerPalindrome(int number) {
		
		if (number == reverse(number)) {
			return "The number is palindrome";
			} else {
			return "The number is not palindrome";	
	        }
	    
	}

	public static int reverse(int number) {
		
		int reverse = 0;
	    int remainder = 0;
	    
	    while (number > 0) {
	        remainder = number % 10;
	        reverse = reverse * 10 + remainder;
	        number = number / 10;
	    }
	        
	    return reverse;
	    
	}

}
