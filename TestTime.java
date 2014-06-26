
public class TestTime {
	public static void main(String[] args) {
		Time time1 = new Time();
		System.out.println("The current time is: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
		
		Time time2 = new Time(555550000);
		System.out.println("The current time is: " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
		
		time2.setTime(600000);
		System.out.println("The current time is: " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
	}

}
