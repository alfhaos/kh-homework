package com.oop.emp.controller;

import java.util.Scanner;

import com.oop.emp.model.dto.Employee;

public class EmployeeManger {
	
	Scanner sc = new Scanner(System.in);
	private static final int max = 3;
	public Employee[] eArr = new Employee[max];
	int cnt = 0;
	int avg,salaryavg;
	
	
	
	public void printEmployees(int i) {
		for(int n = 0 ; n < i ; n++) {
			Employee ep = eArr[n];
			System.out.printf("ear[%d] : "+ep.empInformation()+"\n",n);
		}
	}
	
	public void printAnnualSalary() {
		for(Employee ep : eArr) {
			avg = (int) ((ep.getSalary() + (ep.getSalary() * ep.getBounsPoint())) * 12);
			salaryavg += avg;
			System.out.println(ep.getEmpName() + "의 연봉 : " + avg);
		}
	}
	public void  printAnnualSalaryAvg() {
		salaryavg /= 3;
		System.out.println("직원들의 연봉의 평균 : " + salaryavg);
	}

}
