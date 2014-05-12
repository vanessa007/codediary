public class CalculateTuition {
	public static void main(String[] args) {
		double tuition = 10000.0;
		final double GROWTH_RATE = 0.05;
		
		// Calculate the tuition after 10 years
		for (int i = 1; i <= 10; i++) {
			tuition = tuition * (1 + GROWTH_RATE);
		}
		
		System.out.printf("The tuition after 10 years is %5.2f", tuition);
		System.out.println("");
		
		// Calculate the sum of four years' tuition after 10 years from now
		double sum = 0;
		for (int i = 1; i <= 4; i++) {
			tuition = tuition * (1 + GROWTH_RATE);
			sum += tuition;
		}
		
		System.out.printf("The sum of four years' tuition after 10 years from now is %5.2f", sum);
		
	}

}
