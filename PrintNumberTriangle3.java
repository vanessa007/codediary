
public class PrintNumberTriangle3 {
	public static void main(String[] args) {
		
		for (int row = 1; row <= 6; row++) {
			
			for (int column = 1; column <= 6; column++) {
				
				if (row + column <= 6) {
					System.out.print("  ");
				} else {
					System.out.print(7 - column + " ");
				}
			}
			
			System.out.println("");
		}
		
		
		
		
		
	}

}
