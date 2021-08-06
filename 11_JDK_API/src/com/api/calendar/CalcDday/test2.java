package com.api.calendar.CalcDday;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year,month,day;
		
		
		System.out.println("년도 입력 : ");
		year = sc.nextInt();
		
		System.out.println("월 입력 : ");
		month = sc.nextInt();
		
		System.out.println("일 입력 : ");
		day = sc.nextInt();
		
		Calendar Dday = new GregorianCalendar(year,month-1,day);
		Calendar today = Calendar.getInstance();
		
		double diff = Dday.getTimeInMillis() -  today.getTimeInMillis();
		
		diff = diff / 1000 / 60 / 60 / 24;
		System.out.println(diff);
		if(diff >= 1) {
			System.out.printf("%.0f일 남았습니다\n",Math.ceil(diff));
		}
		else if(Math.ceil(diff)*-1 == 0 ) {
			System.out.println("D-DAY입니다.");
		}
		else {
			System.out.printf("%.0f일 지났습니다\n",Math.ceil(diff)*-1);
		}
		
		
	}

}
