
public class SumMajorDiagonal {
	public static void main(String[] args) {
		int[][] m = {
				{1, 2, 3, 4}, 
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}};
		
		int sum = sumMajorDiagonal(m);
		
		System.out.println("Sum of the elements in the major diagonal is " + sum);
		}
	
	public static int sumMajorDiagonal(int[][] m) {
		
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (i == j) {
					sum += m[i][j];
				}
			}
		}
		
		return sum;
	}

}
