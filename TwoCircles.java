import java.util.Scanner;
public class TwoCircles {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter circle1's certer x-, y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		
		System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();

		double distance = Math.pow((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)), 0.5);
		
		if (r1 < r2) {
			double temp = r1;
			r1 = r2;
			r2 = temp;
		}
		
		if (distance <= (r1 - r2)) {
			System.out.println("A circle is inside another circle");
		} else if (distance <= r1 + r2) {
			System.out.println("A circle overlaps another circle");
		} else {
			System.out.println("A circle does not overlap another circle");
		}
	}

}
