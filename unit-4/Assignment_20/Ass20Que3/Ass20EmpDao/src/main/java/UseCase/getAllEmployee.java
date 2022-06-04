package UseCase;

import java.util.List;
import com.masai.dao.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class getAllEmployee {
	
	public static void main(String[] args) {
		
		EmployeeDao emp = new EmployeeDaoImpl();
		Employee e1 = new Employee();
		
		List <Employee> l1 = emp.getAllEmployee();
		
		l1.forEach(a -> System.out.println(a));
	}
}
