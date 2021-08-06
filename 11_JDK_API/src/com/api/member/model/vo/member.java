package com.api.member.model.vo;

import java.util.Calendar;

public class member {
	
		
		private int memberNo;
		private String memberName;
		private int height,weight;
		
		private Calendar birth;
	
	
	
	
	public member() {
			super();
			// TODO Auto-generated constructor stub
		}




	public String informaiton() {
		return  memberNo + " , " + memberName + " , " + height + " , " + weight
				+ " , " + birth.get(Calendar.YEAR)+"년 "  +(birth.get(Calendar.MONTH))+"월 " + birth.get(Calendar.DAY_OF_MONTH) +"일"; 
		
	}




	public member(int memberNo, String memberName, int height, int weight, Calendar birth) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.height = height;
		this.weight = weight;
		this.birth = birth;
	}
	
	public void printCalendar(Calendar cal) {
		int yyyy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH)+1;
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		
		int i = cal.get(Calendar.DAY_OF_WEEK); // 일(1) ~ 토(7)
		char[] daysOfWeek = {'일','월','화','수','목','금','토'};
		
		int AM = cal.get(Calendar.AM_PM);
		int hh = cal.get(Calendar.HOUR);
		
		int m = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일(%c요일) %s %d시 %d분 %d초\n",yyyy,mm,dd,daysOfWeek[i-1]
				,AM == 0 ? "오전":"오후",hh,m,ss);
		
	}

}
