package com.masai.usecases;

import java.util.Scanner;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;

public class DeleteEmployee {
	
	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			EmployeeDao dao = new EmployeeDaoImpl();
			
			System.out.println("Enter Employee ID to delete record");
			int eid = sc.nextInt();

			try {
				String message = dao.deleteEmployee(eid);
				System.out.println(message);
			} catch (EmployeeException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
