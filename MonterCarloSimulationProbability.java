
public class MonterCarloSimulationProbability {
	public static void main(String[] args) {
		
		final int NUMBER_OF_TRIALS = 1000000;
		int numberOfHits = 0;
		
		for (int i = 0; i <= NUMBER_OF_TRIALS; i++) {
			double x = Math.random() * 2 - 1;
			double y = Math.random() * 2 - 1;
			
			if (x <= 0 || (x >= 0 && y >= 0 && x + y <= 1)) {
				numberOfHits++;
			}
		}
		
		double probability = (double) numberOfHits / NUMBER_OF_TRIALS;
		
		System.out.printf("The probability of falling into the certain area is %4.4f", probability);
		
	}

}
