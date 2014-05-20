
public class PalindromeAndPrime {
	public static void main(String[] args) {
		int count = 0; 
		for (int i = 2; count < 100; i++) {
			if (isPalindrome(i) && isPrime(i)) {
				System.out.printf("%8d", i);
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
	
	public static boolean isPalindrome(int n) {
		boolean isPalindrome = (n == reverse(n));
		return isPalindrome;
	}
	
	public static int reverse(int m) {
		
		int reverse = 0;
	    int remainder = 0;
	    
	    while (m > 0) {
	        remainder = m % 10;
	        reverse = reverse * 10 + remainder;
	        m = m / 10;
	    }
	        
	    return reverse;
	}
	
	public static boolean isPrime(int o) {
		
		for (int i = 2; i < o; i++) {
			if (o % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
