
public class ApproximationOfPI {
	public static void main(String[]args) {
		
		// The sum of part1
		double pi = 0.0;
		for (int i = 1; i <= 200000; i++) {
			double num = (double) 4 / (2 * i - 1);
			pi = (i % 2 != 0)? pi + num : pi - num;
		}
		
		// Print PI
		System.out.printf("PI is appoximately %2.5f", pi);
	}
}

