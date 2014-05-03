import java.util.Scanner;
public class TimezoneProblem {
	public static void main(String[] args) {
		long totalMillis = System.currentTimeMillis();
		
		// Get total seconds
		long totalSeconds = totalMillis / 1000;
		
		// Get total minutes
		long totalMinutes = totalSeconds / 60;
		
		// Get remain seconds
		int seconds = (int) totalSeconds % 60;
		
		// Get total hours
		long totalHours = totalMinutes / 60;
		
		// Get remain minutes
		int minutes = (int) totalMinutes % 60;
		
		// Get remain hours
		int hours = (int) totalHours % 24;
		
		// Print current time
		System.out.println(hours + ":" + minutes + ":" + seconds);
		
		// Get time zone offset from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		
		// Adjust hours
		int adjustedHours = hours + offset;
		if (adjustedHours < 0) {
			adjustedHours = adjustedHours + 24;
			} else if (adjustedHours > 24) {
				adjustedHours = adjustedHours - 24;
			} else {
				adjustedHours = adjustedHours;
			}
		// Print adjusted time
		System.out.println(adjustedHours + ":" + minutes + ":" + seconds);
		}
	}
