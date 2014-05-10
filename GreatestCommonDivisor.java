import java.util.Scanner;
public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int gcd = 1;
		int k = 1; // possible gcd
		while (k <= num1 && k <= num2) {
			if (num1 % k == 0 && num2 % k == 0) {
				gcd = k;
			}
			k++;
		}
		
		System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is " + gcd + ".");
	}

}
