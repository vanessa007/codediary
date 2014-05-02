import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		int unitsDigit = number % 10;
		int restNumber = (int) number / 10;
		int tensDigit = restNumber % 10;
		int hundredsDigit = (int) restNumber / 10;
		int sumOfDigits = unitsDigit + tensDigit + hundredsDigit;
		System.out.println("The sum of digits is " + sumOfDigits);
	}

}
