package Ass11Que3;

public class Employee implements Comparable<Employee>{
	
	 int empId;
	 String empName;
	 double salary;
	 
	 public Employee() {
		// TODO Auto-generated constructor stub
	}
	 
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.salary > o.salary)
			return +1;
			else if(this.salary < o.salary)
			return -1;
			else
			return 0;
	} 	
	
	@Override
	public String toString(){
		
		return "Employee Details: empId = " + empId +"empName = " + empName + "Salary = " +salary;
	}
}
