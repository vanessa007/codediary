
public class SumMatrix {
	public static void main(String[] args) {
		
		int[][] m = {
				{1, 2, 3, 4}, 
				{5, 6, 7, 8}, 
				{9, 10, 11, 12},
				{13, 14, 15, 16}};
		
		int sum = sumMatrix(m);
		
		System.out.println("Sum of the matrix is " + sum);
		
		}
	
	public static int sumMatrix(int[][] m) {
		
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				sum += m[i][j];
			}
		}
		
		return sum;
	}

}
