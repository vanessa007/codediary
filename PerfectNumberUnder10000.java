
public class PerfectNumberUnder10000 {
	public static void main(String[] args) {
		
		
		for (int num = 6; num <= 10000; num++) {
			
			int sum = 0;
			
			for (int i = num; i >= 1; i--) {
				if (num % i == 0) {
					sum += i;
				}
			}
					
			if (sum == num * 2) {
				System.out.println(num);
			}
		}

	}
	
}
