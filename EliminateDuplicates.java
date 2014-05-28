import java.util.Scanner;
public class EliminateDuplicates {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		
		int[] list = new int[10];
		boolean[] isDuplicated = new boolean[10];
		
		for (int i = 0; i < 10; i++) {
			list[i] = input.nextInt();
			isDuplicated[i] = false;
			for (int j = 0; j < 10; j ++) {
				if (list[i] == list[j] && i != j) {
					isDuplicated[j] = true;
				}
			}
		}

		System.out.print("The distinct numbers are: ");
		
		for (int i = 0; i < 10; i++) {
			if (!isDuplicated[i]) {
				System.out.print(list[i] + " ");
		}
			
	}
}
}
