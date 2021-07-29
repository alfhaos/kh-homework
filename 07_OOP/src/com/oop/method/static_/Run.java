package com.oop.method.static_;

public class Run {

	public static void main(String[] args) {
		String a = "abcde",b;
		int num;
		a = StaticMethod.toUpper(a);
		System.out.println("변환된 입력값 : " + a);
		
		a = StaticMethod.setChar(a, 1, 'a');
		System.out.println("인덱스 문자 변경 : " + a);
		
		num = StaticMethod.getAlphabetLength(a);
		System.out.println("영문자 갯수 : " + num);
		
		b = StaticMethod.concat("hello", "world");
		System.out.println("하나로 합쳐진 문자열 : " + b);
		
	}

}
