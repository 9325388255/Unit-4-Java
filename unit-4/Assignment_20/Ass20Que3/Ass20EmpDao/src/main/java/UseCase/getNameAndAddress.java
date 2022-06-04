package UseCase;

import java.util.Scanner;

import com.masai.dao.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class getNameAndAddress {
	
	public static void main(String[] args) {
		
		EmployeeDao emp = new EmployeeDaoImpl();
		Employee e1 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int id = sc.nextInt();
		
		String [] f= emp.getNameAndAddress(id);
		
		for(String x : f) {
			System.out.println(x);
		};
		//f.forEach(a -> System.out.println(a));
	}
	
	

}
