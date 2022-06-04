package UseCase;

import java.util.Scanner;

import com.masai.dao.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class giveBonusToEmployee {
	
	public static void main(String[] args) {
		
		EmployeeDao emp = new EmployeeDaoImpl();
		Employee e1 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Employee bonus");
		int bonus = sc.nextInt();
		
		String k = emp.giveBonusToEmployee(id, bonus);
		System.out.println(k);
		
	}
}
