import java.util.Scanner;
public class LocateLargest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array: ");
		
		int row = input.nextInt();
		int column = input.nextInt();
		
		int[][] myArray = new int[row][column];
		
		System.out.println("Enter the numbers in the array: ");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				myArray[i][j] = input.nextInt();
			}
		}
		
		System.out.println("The location of the largest element is at (" + locateLargest(myArray)[0] + ", " + locateLargest(myArray)[1] + ")");
	}
	
	public static int[] locateLargest(int[][] array) {
		int[] location = new int[2];
		int biggestI = 0;
		int biggestJ = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] > array[biggestI][biggestJ]) {
					biggestI = i;
					biggestJ = j;
				}
			}
		}
		
		location[0] = biggestI;
		location[1] = biggestJ;
		
		return location;
	}

}
