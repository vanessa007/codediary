
public class CoinProblem {
	
	public static void main(String[] args) {
		
		double[] a = {0.5,0.5};
		System.out.println("The probability is " + p(2, 1, a));

	}
	
	// In m coins, there are n heads;
	
	public static double p(int m, int n, double[] a) {
		if(m==0&&n==0){
			return 1;
		}
		if(m==0){
			return 0;
		}
		double probability = 0.0;
		probability = p(m-1, n-1, a) * a[m-1] + p(m-1, n, a) * (1 - a[m-1]);
		return probability;
	}

}
