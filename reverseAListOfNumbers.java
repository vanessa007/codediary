import java.util.Scanner;
public class ReverseAListOfNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of integers: ");
		int numOfInt = input.nextInt();
		
		System.out.println("Enter " + numOfInt + " integers: ");
		int[] source = new int[numOfInt];
		for (int i = 0; i < numOfInt; i++) {
			source[i] = input.nextInt();
		}
		
		reverse(source);
	}
	
	public static void reverse(int[] list) {
		int[] reverse = new int[list.length];
		for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
			reverse[i] = list[j];
		}
		System.out.println("The reversed string is: ");
		for (int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i] + " ");
		}

	}

}
