
public class Time {
	
	// Data field
	private int hour;
	private int minute;
	private long second;
	
	// Constructors
	
	public Time() {
		long totalMillis = System.currentTimeMillis();
		long totalSeconds = (long) (totalMillis / 1000);
		int totalMinutes = (int) (totalSeconds / 60);
		second = totalSeconds % 60;
		hour = (int) (totalMinutes / 60);
		minute = totalMinutes % 60;
	}
	
	public Time(long totalMillis) {
		long totalSeconds = (long) (totalMillis / 1000);
		int totalMinutes = (int) (totalSeconds / 60);
		second = totalSeconds % 60;
		hour = (int) (totalMinutes / 60);
		minute = totalMinutes % 60;
	}
	
	public Time(int hour, int minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// Getters
	
	public long getSecond() {
		return second;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getHour() {
		return hour;
	}
	
	// Setter
	
	public void setTime(long totalMillis) {
		long totalSeconds = (long) (totalMillis / 1000);
		int totalMinutes = (int) (totalSeconds / 60);
		second = totalSeconds % 60;
		hour = (int) (totalMinutes / 60);
		minute = totalMinutes % 60;
	}

}
