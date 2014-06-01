import java.util.Scanner;
public class NearestPointsIn3DSpace {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of points: ");
		int numOfPoints = input.nextInt();
		
		// Create an array to store points
		double[][] points = new double[numOfPoints][3];
		System.out.println("Enter " + numOfPoints + " points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < 3; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		// Assume the nearest points are p1 and p2
		int p1 = 0;
		int p2 = 1;
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p1][2], 
										  points[p2][0], points[p2][1], points[p2][2]);
		
		// Update p1 and p2 when there's a shorter distance
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], points[i][2],
						points[j][0], points[j][1], points[j][2]);
				if (distance < shortestDistance) {
					p1 = i;
					p2 = j;
					shortestDistance = distance;
					}
				}
		}
		
	    System.out.println("The nearest points are (" + points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2] + ") and (" + points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2] + ")");
		
	}
	
	public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - x1) * (z2 - x1));
	}

}
