import java.util.Scanner;

public class MyTriangle {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of side1: ");
		double side1 = input.nextDouble();
		
		System.out.println("Enter the length of side2: ");
		double side2 = input.nextDouble();
		
		System.out.println("Enter the length of side3: ");
		double side3 = input.nextDouble();
		
		if (isValid(side1, side2, side3)) {
			System.out.println("The area is " + area(side1, side2, side3));
		} else {
			System.out.println("This is not a triangle");
		}
	}
	
	public static boolean isValid(double side1, double side2, double side3) {
		
		boolean isValid = (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
		return isValid;
		
	}
	
	public static double area(double side1, double side2, double side3) {
		
		double s = (side1 + side2 +side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		return area;
	}

}
