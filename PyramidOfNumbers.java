
public class PyramidOfNumbers {
	public static void main(String[] args) {
		
		final int ROWS = 8;
		final int COLUMNS = 2 * ROWS - 1;
		
		for (int row = 1; row <= ROWS; row++) {
			
			for (int column = 1; column <=15; column++) {
				
				if (row + column >= (ROWS + 1) && column - row <= (ROWS - 1)) {
					
					if (column <= ROWS) {
						int numLeft = (int) Math.pow(2, (column + row - (ROWS + 1)));
						System.out.printf("%6d", numLeft);
					} else {
						int numRight = (int) Math.pow(2, ((ROWS - 1) - column + row));
						System.out.printf("%6d", numRight);
					}
				} else {
					System.out.print("      ");
				}
				
			}
			
			System.out.println("");
		}
	}
}
