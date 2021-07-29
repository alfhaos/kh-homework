package com.oop.method.static_;

public class StaticMethod {
	
	
	static String hm = "";
	public static  String toUpper(String a) {
		a = a.toUpperCase();
		return a;
		}
	
	public static String setChar(String target,int num, char a) {
		
		for(int i = 0 ; i < target.length() ; i ++){
			if(i == num) {
				hm += a;
			}
			else {
			hm += target.charAt(i);
			}
		}
		return hm;
		
	}
	
	public static int  getAlphabetLength(String a) {
		int count = 0;
		
		for(int i = 0 ; i < a.length() ; i++) {
			if((a.charAt(i) >= 65 && a.charAt(i) <= 90) || (a.charAt(i) >= 97 && a.charAt(i) <= 122)) {
				count++;
			}
			
		}
		return count;
	}
	
	public static String concat(String a , String b) {
	
		return a+b;
		
	}
	

}
