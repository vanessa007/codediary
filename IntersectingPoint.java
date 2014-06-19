import java.util.*;
public class IntersectingPoint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter the first line by determining its ends
		System.out.println("Enter the endpoints of the first line segment:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Enter the second line by determining its ends
		System.out.println("Enter the endpoints of the first line segment:");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		// Linear equation 1
		double a = y1 - y2;
		double b = x2 - x1;
		double e = (x2 - x1) * y1 - (y2 - y1) * x1;
		
		// Linear equation 2
		double c = y3 - y4;
		double d = x4 - x3;
		double f = (x4 - x3) * y3 - (y4 - y3) * x3;
		
		LinearEquation myEquation = new LinearEquation(a, b, c, d, e, f);
		
		System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
		System.out.println("The intersecting point is (" + myEquation.getX() + ", " + myEquation.getY() + ")");
	}
	


}
