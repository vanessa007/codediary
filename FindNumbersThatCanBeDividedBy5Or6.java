
public class FindNumbersThatCanBeDividedBy5Or6 {
	public static void main(String[] args) {
		
		int count = 0;
		final int NUMBERS_OF_INTEGERS_PER_LINE = 10; 
		
		// Check numbers from 100 to 1000
		for (int i = 100; i <= 1000; i++) {
			
			// Find numbers that can be divided by 5 and 6
			if (i % 5 == 0 && i % 6 == 0) {
				System.out.print(i + " ");
				count++;
				
				// Print 10 numbers each line
				if (count % NUMBERS_OF_INTEGERS_PER_LINE == 0) {
					System.out.println("");
				}
			}
		}
	}
}
