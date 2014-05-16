
public class PrintTheLeapYears {
	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 2001; i <= 2100; i++) {
			
			if ((i % 4 == 0 && i % 100 != 0) || (i % 100 == 0)){
				System.out.print(i + " ");
				count++;
				if (count % 10 == 0) {
					System.out.print("\n");
				}
			}
		}
		
	}

}
