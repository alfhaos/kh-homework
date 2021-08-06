package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodayTest {
	
	public static void main(String[] args) {
		
		Calendar day = new GregorianCalendar(2019,8,5);
		TodayTest study = new TodayTest();
		study.printCalendar(day);
		
	}

	
	public void printCalendar(Calendar cal) {
		int yyyy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH);
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		
		int i = cal.get(Calendar.DAY_OF_WEEK); // 일(1) ~ 토(7)
		char[] daysOfWeek = {'일','월','화','수','목','금','토'};
		
		int AM = cal.get(Calendar.AM_PM);
		int hh = cal.get(Calendar.HOUR);
		
		int m = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		
		System.out.printf("오늘은 %d년 %d월 %d일 %c요일",yyyy,mm,dd,daysOfWeek[i-1]);
		
	}
}
