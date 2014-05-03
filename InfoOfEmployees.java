import javax.swing.JOptionPane;
public class InfoOfEmployees {
	public static void main(String[] args) {
		
		// Get the name of the employee
		String employeeName = JOptionPane.showInputDialog(
				"Enter employee's name: ");
		
		// Get number of hours worked in a week
		String numberOfHoursString = JOptionPane.showInputDialog(
				"Enter number of hours worked in a week: ");
		// Parse the string and convert it to integer
		int numbersOfHours = Integer.parseInt(numberOfHoursString);
		
		// Get the hourly rate
		String hourlyPayRateString = JOptionPane.showInputDialog(
				"Enter hourly pay rate: ");
		// Parse the string and convert it to double
		double hourlyPayRate = Double.parseDouble(hourlyPayRateString);
		
		// Get the federal tax rate
		String federalTaxString = JOptionPane.showInputDialog(
				"Enter federal tax withholding rate: ");
		// Parse the string and convert it to double
		double federalTax = Double.parseDouble(federalTaxString);
		
		// Get the state tax rate
		String stateTaxString = JOptionPane.showInputDialog(
				"Enter state tax withholding rate: ");
		// Parse the string and convert it to double
		double stateTax = Double.parseDouble(stateTaxString);
		
		// Calculate gross pay
		double grossPay = numbersOfHours * hourlyPayRate;
		
		// Print name, hours of working, pay rate and gross pay
		System.out.println("Employee's Name: " + employeeName);
		System.out.println("Hours Worked: " + numbersOfHours);
		System.out.println("Pay Rate: $" + hourlyPayRate);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions:");
		
		// Federal withholding
		double federalWithholding = (int)(grossPay * 100 * federalTax) / 100.0;
		
		// State withholding
		double stateWithholding = (int)(grossPay * 100 * stateTax) / 100.0;
		
		// Print federal withholding, state withholding and total deduction
		System.out.println("  Federal Withholding (" + (int)(100 * federalTax) / 1.0 + "%): $" + federalWithholding);
		System.out.println("  State Withholding (" + (int)(100 * stateTax) / 1.0 + "%): $" + stateWithholding);
		System.out.println("  Total Deduction: $" + (federalWithholding + stateWithholding));
		
		// Calculate net pay
		double netPay = grossPay - federalWithholding - stateWithholding;
		
		// Print net pay
		System.out.println("Net Pay: $" + netPay);
	}

}
