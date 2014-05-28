import java.util.Scanner;
public class GcdOfUnspecifiedNumberOfIntegers {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] list = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a number: ");
			list[i] = input.nextInt();
		}
		
		gcd(list);
	}
	
	// Get the gcd of multiple integers
	public static void gcd(int...numbers) {
		int gcd = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			gcd = gcdOfTwo(gcd, numbers[i]);
		}
		
	System.out.println("The gcd is: " + gcd);

	}
	
	// Get the gcd of two integers
	public static int gcdOfTwo(int a, int b) {
		int gcdOfTwo = 1;
		int possibleGcd = 1;
		
		while (possibleGcd <= a && possibleGcd <= b) {
			if (a % possibleGcd == 0 && b % possibleGcd == 0) {
				gcdOfTwo = possibleGcd;
			}
			possibleGcd++;
		}
		
		return gcdOfTwo;
	}

}
