package net.kh.member.model;

public class Member {
	
	private String memberid;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public void setMemberid(String memberid) {
		this.memberid = memberid;
		
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
		
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
		
	}
	public String getMemberName() {
		return memberName;
	}
	
	public void setage(int age) {
		this.age = age;
		
	}
	public int getage() {
		return age;
	}
	public void setGender(char gender) {
		this.gender = gender;
		
	}
	public char getgender() {
		return gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
		
	}
	public String getPhone() {
		return phone;
	}
	public void setEmail(String email) {
		this.email = email;
		
	}
	public String getemail() {
		return email;
	}

}
