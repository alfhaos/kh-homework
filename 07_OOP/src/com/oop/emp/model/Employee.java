package com.oop.emp.model;

import java.util.Scanner;

public class Employee {

	
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bounsPoint;
	private String phone;
	private String address;
	String buffer;
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getJob() {
		return job;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getGender() {
		return gender;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setBounsPoint(double bounsPoint) {
		this.bounsPoint = bounsPoint;
	}
	public double getBounsPoint() {
		return bounsPoint;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void empInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사번 : ");
		setEmpNo(sc.nextInt());
		System.out.print("이름 : ");
		setEmpName(sc.next());
		System.out.print("소속부서 : ");
		setDept(sc.next());
		System.out.print("직급 : ");
		setJob(sc.next());
		System.out.print("나이 : ");
		setAge(sc.nextInt());
		System.out.print("성별 : ");
		setGender(sc.next().charAt(0));
		System.out.print("급여 : ");
		setSalary(sc.nextInt());
		System.out.print("보너스포인트 : ");
		setBounsPoint(sc.nextDouble());
		System.out.print("핸드폰 : ");
		setPhone(sc.next());
		System.out.print("주소 : ");
		buffer = sc.nextLine();
		setAddress(sc.nextLine());
		
	}
	public void empOutput() {
		System.out.println("사번 : " + empNo);
		System.out.println("이름 : " + empName);
		System.out.println("소속부서 : " + dept);
		System.out.println("직급 : " + job);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("급여 : " + salary);
		System.out.println("보너스포인트 : " + bounsPoint);
		System.out.println("핸드폰 : " + phone);
		System.out.println("주소 : " + address);
	}
	public void delete() {
		setEmpName(null);
		setEmpNo(0);
		setDept(null);
		setJob(null);
		setAge(0);
		setGender(' ');
		setSalary(0);
		setBounsPoint(0);
		setPhone(null);
		setAddress(null);
	}
	public int end() {
		return 0;
	}
}
