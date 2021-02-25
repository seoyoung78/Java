package ch11.exam08;

import java.util.Calendar;

public class Example2 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // MONTH : 0 ~ 11
		int date = now.get(Calendar.DAY_OF_MONTH); // 한달 중에 몇일
		int day = now.get(Calendar.DAY_OF_WEEK); // 일주일 중에 무슨 요일, 일요일이 1
		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);
		System.out.println(amPm);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
	}

}
