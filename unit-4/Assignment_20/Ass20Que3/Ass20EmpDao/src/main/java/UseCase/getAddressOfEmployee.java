package UseCase;

import java.util.Scanner;

import com.masai.dao.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class getAddressOfEmployee {
	
	public static void main(String[] args) {
		
		EmployeeDao emp = new EmployeeDaoImpl();
		Employee e1 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int id = sc.nextInt();
		
		String f= emp.getAddressOfEmployee(id);
		System.out.println(f);
	}
}
