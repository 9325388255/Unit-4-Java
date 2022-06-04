package com.masai.usecases;
import java.util.Scanner;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;

public class GetEmployeeById {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			EmployeeDao dao = new EmployeeDaoImpl();
			System.out.println("Enter Employee ID to search record");
			int eid = sc.nextInt();

			try {
			Employee employee = dao.getEmployeeById(eid);
			System.out.println(employee);
			} catch (EmployeeException e) {
			System.out.println(e.getMessage());
			}
		}
	}
}