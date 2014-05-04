import java.util.Scanner;
public class CheckISBN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first 9 numbers of your ISBN: ");
		
		long isbn = input.nextLong();
		
		int nine = (int) (isbn % 10);
		int eight = (int) (isbn / 10 % 10);
		int seven = (int) (isbn / 100 % 10);
		int six = (int) (isbn / 1000 % 10);
		int five = (int) (isbn / 10000 % 10);
		int four = (int) (isbn / 100000 % 10);
		int three = (int) (isbn / 1000000 % 10);
		int two = (int) (isbn / 10000000 % 10);
		int one = (int) (isbn / 100000000 % 10);
		
		int ten = (one * 1 + two * 2 + three * 3 + four * 4 + five * 5 +six * 6 +seven * 7 + eight * 8 + nine * 9) % 11;
		
		System.out.println("Your ISBN is: " + isbn + ten);
	}

}
