package com.api.member.run;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import com.api.member.model.vo.member;

public class Run {
	
	public static void main(String[] args) {
		int[] no = new int[3];
		String[] name = new String[3];
		int[] height = new int[3];
		int[] weight = new int[3];
		String[] birth = new String[3];
		Calendar[] cl = new Calendar[3];
		member[] mb = new member[3];
		
		
		String info = "1,김연아,165,47,19900905|"
				+ "2,양세형,167,60,19850818"
				+ "|3,김래원,182,80,19810319";
		
		String[] arr = info.split("[|]");
		
		for(int i = 0 ; i < arr.length; i++) {
			
			StringTokenizer tokenizer = new StringTokenizer(arr[i],",");
		
		
		
			while(tokenizer.hasMoreTokens()) {
				no[i]= Integer.parseInt(tokenizer.nextToken());
				name[i]= tokenizer.nextToken();
				height[i] = Integer.parseInt(tokenizer.nextToken());
				weight[i] = Integer.parseInt(tokenizer.nextToken());
				birth[i] = tokenizer.nextToken();
				
				cl[i] = new GregorianCalendar(Integer.parseInt(birth[i].substring(0,4)),Integer.parseInt(birth[i].substring(4,6))
						,Integer.parseInt(birth[i].substring(6,8)));
				
				mb[i] = new member(no[i],name[i],height[i],weight[i],cl[i]);
				
				System.out.println(mb[i].informaiton());
				
				}
			
			}
		
		

	}

}
