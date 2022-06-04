package UseCase;

import java.util.Scanner;
import com.masai.dao.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class deleteEmployee {
	
	public static void main(String[] args) {
		
		EmployeeDao emp = new EmployeeDaoImpl();
		Employee e1 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int id = sc.nextInt();
		
		boolean f= emp.deleteEmployee(id);
		
		if(f)
			System.out.println("Employee deleated..");
		else
			System.out.println("Employee Not Exist...");
	
		}
}
