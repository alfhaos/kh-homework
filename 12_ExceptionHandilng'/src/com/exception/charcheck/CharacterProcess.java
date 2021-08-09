package com.exception.charcheck;

import java.util.StringTokenizer;

public class CharacterProcess {

	public CharacterProcess() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int countAlpha(String s) {
		int count = 0;
		
		
		try {
			StringTokenizer tokenizer = new StringTokenizer(s," ");
			if(tokenizer.countTokens() > 1) {
				throw new CharCheckException();
			}
			
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				count++;
				}
			}
		System.out.println("영문자 갯수 : " + count);
					
			
		}
		catch(CharCheckException e){
			System.out.println("체크할 문자열 안에 공백 포함할 수 없습니다.");
		}
		return count;
		
	}
	
	
}
