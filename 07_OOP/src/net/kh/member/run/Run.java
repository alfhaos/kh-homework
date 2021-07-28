package net.kh.member.run;

import net.kh.member.model.Member;

public class Run {

	public static void main(String[] args) {

		Member m1 = new Member();
		m1.setage(25);
		m1.setEmail("alfhaos@naver.com");
		m1.setGender('M');
		m1.setMemberid("khstudy");
		m1.setMemberName("홍길동");
		m1.setMemberPwd("123456789");
		m1.setPhone("010123456789");
		
		System.out.println("회원의 나이 : " + m1.getage());
		System.out.println("회원의 이메일 : " + m1.getemail());
		System.out.println("회원의 성별 : " + m1.getgender());
		System.out.println("회원의 아이디 : " + m1.getMemberid());
		System.out.println("회원의 이름 : " + m1.getMemberName());
		System.out.println("회원의 비밀번호 : " + m1.getMemberPwd());
		System.out.println("회원의 번호 : " + m1.getPhone());
	}

}
