
public class ApproximationOfE {
	public static void main(String[] args) {
		
		double e = 1;
		double num = 1;
		
		for (int i = 1; i <= 200000; i++) {
			num = num / i;
			e += num;
		}

		System.out.println(e);
			
		
	}

}
