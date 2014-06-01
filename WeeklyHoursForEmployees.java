
public class WeeklyHoursForEmployees {
	public static void main(String[] args) {
		int[][] m = {
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{2, 4, 6, 2, 7, 3, 2},
				{1, 3, 6, 2, 3, 2, 2},
				{4, 3, 5, 2, 5, 2, 2},
				{5, 3, 1, 1, 8, 8, 2}};
		
		// Create a matrix weeklyHours, weeklyHours[0] is a list of employees, weeklyHours[1] is a list of work hours
		int[][] weeklyHours = new int[2][m.length];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				weeklyHours[0][i] = i;
				weeklyHours[1][i] += m[i][j];
			}
		}
		
		for (int i = 0; i < m[0].length; i++) {
			System.out.println("The Employee " + weeklyHours[0][i] + " worked " + weeklyHours[1][i] + " hours a week");
		}
		
		System.out.println("\nIn increasing order: \n");
		
		sort(weeklyHours);
	}
	
	public static void sort(int[][] m) {
		
		for (int i = 0; i < m[0].length - 1; i++) {
			int currentMin = m[1][i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < m[0].length; j++) {
				if (currentMin > m[1][j]) {
					currentMin = m[1][j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				// Swap the i-th element and current min
				m[1][currentMinIndex] = m[1][i];
				m[1][i] = currentMin;
				int temp = m[0][currentMinIndex];
				m[0][currentMinIndex] = m[0][i];
				m[0][i] = temp;
			}
		}
		
		for (int i = 0; i < m[0].length; i++) {
			System.out.println("The employee " + m[0][i] + " worked " + m[1][i] + " hours a week");
		}
		
	}
	

}
