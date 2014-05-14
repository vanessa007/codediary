import java.util.Scanner;
public class LoanAmountAndMonthlyPayment {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter loan amount, number of years and annual interest rate
		System.out.println("Loan amount: ");
		int loanAmount = input.nextInt();
		System.out.println("Number of years: ");
		int numberOfYears = input.nextInt();
		System.out.println("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		
		// Calculate monthly payment and total payment
		double monthlyInterestRate = annualInterestRate / 12;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		// Print monthly payment and total payment
		System.out.printf("\nMonthly Payment: %4.2f \n", monthlyPayment);
		System.out.printf("Total Payment: %4.2f \n\n", totalPayment);
		
		// Print a list of each payment
		double balance = loanAmount;
		
		// Print title
		System.out.println("Payment#      Interest      Principal      Balance");
		
		for (int i = 1; i <= numberOfYears * 12; i++) {
			double interest = monthlyInterestRate * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%4d", i);
			System.out.print("         ");
			System.out.printf("%7.2f", interest);
			System.out.print("        ");
			System.out.printf("%4.2f", principal);
			System.out.print("        ");
			System.out.printf("%8.2f", balance);
			System.out.println("");
			}
		}
		
	}
