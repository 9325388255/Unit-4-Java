package com.masai.usecases;
import java.util.List;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.masai.model.Employee;

public class GetAllEmployees {

	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		System.out.println("Displaying Employee Records");

		List<Employee> employees = dao.getAllEmployees();

		if(employees.size() == 0) {
			System.out.println("No Employee Exists");
		}
		else
			employees.stream().forEach(e -> System.out.println(e));
	}
}
