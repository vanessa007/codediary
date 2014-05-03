import java.util.Scanner;
public class ASCIIToChar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code: ");
		int code = input.nextInt();
		char result = (char) code;
		System.out.println("The character for ASCII code " + code + " is " + result);
	}

}
