package UseCase;

import java.util.Scanner;

import com.masai.dao.Employee;
import com.masai.dao.EmployeeDaoImpl;

public class CreateEmployee {
	
	public static void main(String[] args) {
		
		EmployeeDaoImpl emp = new EmployeeDaoImpl();
		Employee e1 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String n = sc.next();
		System.out.println("Enter Address:");
		String a = sc.next();
		System.out.println("Enter Salary:");
		int s = sc.nextInt();
		
		e1.setName(n);
		e1.setAddress(a);
		e1.setSalary(s);
				
		boolean f= emp.createEmployee(e1);
		
		if(f)
			System.out.println("Account created..");
		else
			System.out.println("Not created...");
	}

}
