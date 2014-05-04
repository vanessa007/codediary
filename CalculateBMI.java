import java.util.Scanner;
public class CalculateBMI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		double weightPounds = input.nextDouble();
		
		System.out.println("Enter two numbers x and y, if your height is x feet and y inches: ");
		double heightFeet = input.nextDouble();
		double heightInches = input.nextDouble();
		
		double weightKilograms = weightPounds * 0.45;
		double heightMeters = heightFeet * 0.3048 + heightInches * 0.0254;
		double BMI = weightKilograms / (heightMeters * heightMeters);
		
		System.out.printf("Your BMI is %4.2f \n", BMI);
		
		if (BMI < 16) {
			System.out.println("You are seriously underweight");
		} else if (BMI < 18) {
			System.out.println("You are underweight");
		} else if (BMI < 24) {
			System.out.println("You are normal weight");
		} else if (BMI < 29) {
			System.out.println("You are overweight");
		} else if (BMI < 35) {
			System.out.println("You are seriously overweight");
			}
		}
	}
