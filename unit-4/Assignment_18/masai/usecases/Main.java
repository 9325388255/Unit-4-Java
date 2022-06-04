package com.masai.usecases;
import java.util.*;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;

public class Main {

	Scanner sc = new Scanner(System.in);

	EmployeeDao dao = new EmployeeDaoImpl();

	void addEmployeeDriver() {
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

	void searchEmployeeDriver() {
		System.out.println("Enter Employee ID to search record");
		int eid = sc.nextInt();

		try {
			Employee employee = dao.getEmployeeById(eid);
			System.out.println(employee);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}

	void displayEmployeeDriver() {
		System.out.println("Displaying Employee Records");

		List<Employee> employees = dao.getAllEmployees();

		if(employees.size() == 0) {
			System.out.println("No Employee Exists");
		}
		else
			employees.stream().forEach(e -> System.out.println(e));
	}

	void deleteEmployeeDriver() {
		System.out.println("Enter Employee ID to delete record");
		int eid = sc.nextInt();

		try {
			String message = dao.deleteEmployee(eid);
			System.out.println(message);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}

	void mainDriverMethod() {
		while(true) {
			System.out.println();
			System.out.println("1. Add Employee Record");
			System.out.println("2. Search Employee");
			System.out.println("3. Display All Employee Records");
			System.out.println("4. Delete Employee Record");
			System.out.println("5. Exit");
			System.out.println("\nSelect your choice");

			int choice = sc.nextInt();

			if(choice==1) addEmployeeDriver();
			else if(choice==2) searchEmployeeDriver();
			else if(choice==3) displayEmployeeDriver();
			else if(choice==4) deleteEmployeeDriver();
			else if(choice==5) {
				System.out.println("Thank you.");
				System.exit(0);
			}
			else {
				System.out.println("Enter valid choice");
			}
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.mainDriverMethod();
	}

}