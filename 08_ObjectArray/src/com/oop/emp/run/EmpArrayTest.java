package com.oop.emp.run;

import com.oop.emp.controller.EmployeeManger;
import com.oop.emp.model.dto.Employee;

public class EmpArrayTest {
	
	
	
	public static void main(String[] args) {
		
		EmployeeManger em = new EmployeeManger();
		Employee e1 = new Employee();
		Employee e2 = new Employee(201503, "박길동",29, 'M',
			 "010-1234-5678", "경기도 의정부시");
		Employee e3 = new Employee(201004,"김철수","개발부"
				,34,"과장",'M',4500000,0.15,"010-2143-9876","서울시 노원구 노원동 123");
		
		em.eArr[0] = e1;
		em.eArr[1] = e2;
		em.eArr[2] = e3;
		
		em.printEmployees(3);
		System.out.println("-------------------------------------------------------");
		
		e1.setEmpNo(201305);
		e1.setEmpName("이영희");
		e1.setJob("총무부");
		e1.setDept("대리");
		e1.setAge(28);
		e1.setGender('F');
		e1.setSalary(3750000);
		e1.setBounsPoint(0.1);
		e1.setPhone("010-9512-7534");
		e1.setAddress("경기도 동두천");
		
		em.eArr[0] = e1;
		
		e2.setJob("기획부");
		e2.setDept("사원");
		e2.setSalary(2900000);
		e2.setBounsPoint(0.05);
		
		em.eArr[1] = e2;
		em.printEmployees(2);
		System.out.println("-------------------------------------------------------");
		em.printAnnualSalary();
		System.out.println("-------------------------------------------------------");
		em.printAnnualSalaryAvg();
	}

}
