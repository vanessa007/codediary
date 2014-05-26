import java.util.Scanner;
public class CountNumbersInAnArray {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a list of number (1 - 100) and end it with an 0: ");
		
		int[] myList = new int[100];
		for (int i = 0; i < 100; i++) {
			myList[i] = input.nextInt();
			if (myList[i] == 0) break;
		}
		
		int[] countNum = new int[100];
		
		System.out.println("You list is: ");
		printNum(myList);
		System.out.println();
		printCount(myList, countNum);
	}
	
	public static void printNum(int[] list) {
		int count = 0;
		for (int i = 0; i < 100; i++) {
			if (list[i] != 0) {
				System.out.print(list[i] + " ");
				count++;
				if (count % 10 == 0) {
					System.out.println();
					}
				}
			}
		}
	
	public static void printCount(int[] list1, int[] list2) {
		for (int i = 0; i < 100; i++) {
			list2[list1[i]]++;
		}
		
		System.out.println("Number Times");
		
		for (int i = 1; i < 100; i++) {
			if (list2[i] > 0) {
				System.out.println(i + "       " + list2[i]);
			}
		}
		
		
	}

}
