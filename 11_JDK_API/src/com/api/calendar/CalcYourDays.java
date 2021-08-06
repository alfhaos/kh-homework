package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalcYourDays {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year,month,day;
		
		
		System.out.println("년도 입력 : ");
		year = sc.nextInt();
		
		System.out.println("월 입력 : ");
		month = sc.nextInt();
		
		System.out.println("일 입력 : ");
		day = sc.nextInt();
		
		
		
		
		Calendar birth = new GregorianCalendar(year,month-1,day);
		
		Calendar today = Calendar.getInstance();
		
		
		double diff = today.getTimeInMillis()-  birth.getTimeInMillis();
		
		diff = diff / 1000 / 60 / 60 / 24;
		System.out.println(diff);
		
		
		System.out.printf("태어난지 %.0f일 되었습니다\n",Math.ceil(diff));
	}
	
	

}
