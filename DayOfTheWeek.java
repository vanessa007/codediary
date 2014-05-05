import java.util.Scanner;
public class DayOfTheWeek {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter year (e.g., 2008): ");
		int year = input.nextInt();
		
		System.out.println("Enter month (1 - 12): ");
		int month = input.nextInt();
		
		System.out.println("Enter the day of the month (1 - 31): ");
		int day = input.nextInt();
		
		if (month == 1) {
			month = 13;
			year -= 1;
		}
		
		if (month == 2) {
			month = 14;
			year -= 1;
		}
		
		int result = (day + 26 * (month + 1) / 10 + year % 100 + (year % 100) / 4 + year / 100 / 4 + 5 * year / 100) % 7;
		
		switch (result) {
		case 0: System.out.println("It's Saturday!");
		break;
		case 1: System.out.println("It's Sunday!");
		break;
		case 2: System.out.println("It's Monday!");
		break;
		case 3: System.out.println("It's Tuesday!");
		break;
		case 4: System.out.println("It's Wednesday!");
		break;
		case 5: System.out.println("It's Thursday!");
		break;
		case 6: System.out.println("It's Friday!");
		}
	}
}
