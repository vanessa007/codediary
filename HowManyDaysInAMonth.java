import javax.swing.JOptionPane;
public class HowManyDaysInAMonth {
	public static void main(String[] args) {
		
		// Input month and year
		String monthString = JOptionPane.showInputDialog("Enter the month: ");
		String yearString = JOptionPane.showInputDialog("Enter the year: ");
		
		// Parse month and year
		int month = Integer.parseInt(monthString);
		int year = Integer.parseInt(yearString);
		
		// 
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			switch (month) {
			case 1: System.out.println("Jan " + year + " has 31 days");
			break;
			case 3: System.out.println("Mar " + year + " has 31 days");
			break;
			case 5: System.out.println("May " + year + " has 31 days");
			break;
			case 7: System.out.println("Jul " + year + " has 31 days");
			break;
			case 8: System.out.println("Aug " + year + " has 31 days");
			break;
			case 10: System.out.println("Oct " + year + " has 31 days");
			break;
			case 12: System.out.println("Dec " + year + " has 31 days");
			break;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			switch (month) {
			case 4: System.out.println("Apr " + year + " has 30 days");
			break;
			case 6: System.out.println("Jun " + year + " has 30 days");
			break;
			case 9: System.out.println("Sep " + year + " has 30 days");
			break;
			case 11: System.out.println("Nov " + year + " has 30 days");
			break;
			}
		} else if (month == 2) {
			if (year % 4 == 0 && year % 100 != 0) {
				System.out.println("Feb " + year + " has 29 days");
			} else { System.out.println("Feb " + year + " has 28 days");
			}
			}
		}
	}
