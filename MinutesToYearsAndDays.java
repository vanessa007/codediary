import java.util.Scanner;
public class MinutesToYearsAndDays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		long totalMinutes = input.nextLong();
		long totalHours = totalMinutes / 60;
		int totalDays = (int) totalHours / 24;
		int years = totalDays / 365;
		int days = totalDays % 365;
		System.out.println(totalMinutes + " minutes is approximately " + years + " years " + days + " days.");		
	}
}
