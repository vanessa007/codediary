import java.util.*;
public class UseGregorianCalendarClass {
	
	public static void main(String[] args) {
		
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal.get(GregorianCalendar.YEAR) + " " + cal.get(GregorianCalendar.MONTH) + " " + cal.get(GregorianCalendar.DAY_OF_MONTH));
		
		cal.setTimeInMillis(1234567898765L);
		System.out.println(cal.get(GregorianCalendar.YEAR) + " " + cal.get(GregorianCalendar.MONTH) + " " + cal.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
