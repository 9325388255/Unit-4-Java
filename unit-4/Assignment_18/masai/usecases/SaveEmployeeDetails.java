package com.masai.usecases;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.masai.model.Employee;

public class SaveEmployeeDetails {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			EmployeeDao dao = new EmployeeDaoImpl();

				Employee employee = new Employee();
				System.out.println("Enter Employee Record to add");
				System.out.println("Enter Employee ID");
				employee.setEid(sc.nextInt());

				System.out.println("Enter Employee Name");
				employee.setName(sc.next());

				System.out.println("Enter Employee Address");
				employee.setAddress(sc.next());

				System.out.println("Enter Employee Salary");
				employee.setSalary(sc.nextInt());

				String message = dao.saveEmployeeDetails(employee);

				System.out.println(message);
		}
	}
}
