package calendar;

import java.util.Calendar;

public class Calendar1 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get( Calendar.YEAR );
		System.out.println(year);
		
		// 1월 - 0 ... 12월 - 11
		int month = c.get( Calendar.MONTH );
		System.out.println(month);
		
		// 일 - 1 ... 토 - 7
		int week = c.get( Calendar.DAY_OF_WEEK );
		System.out.println(week);
		
		
	}
}
