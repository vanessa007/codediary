
public class CurrentMinute {
	public static void main(String[] args) {
		long totalMillis = System.currentTimeMillis();
		long totalSeconds = totalMillis / 1000;
		int totalMinutes = (int) totalSeconds / 60;
		int currentMinutes = (int) totalSeconds % 60;
		System.out.println(currentMinutes);	
	}
}
