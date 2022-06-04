package Assignment5;

import java.util.Scanner;

public class EmployeeMain {
	
	public static  void  calculateNetSalary(int pfpercentage, double salary) //pf% + salry pass krni hi pdegi
	 {
		Employee calSalary = new Employee(); //obj create 
		   
		  double  netSal =  (salary-(salary*pfpercentage/100));
		
		  calSalary.setNetSalary(netSal);
		
		double newNetSal = calSalary.getNetSalary();
		  
		  System.out.println("Net Salary:" + newNetSal);
	 }
	 
	
	 public static Employee getEmployeeDetails() 
	 {
		 
		 Employee Empdetails = new Employee();
		 
		 int id = Empdetails.getEmployeeId();
		 
		 String name = Empdetails.getEmployeeName();
		 
		 double salary = Empdetails.getSalary();
		 
		 int PFPercentage = Empdetails.getPFPercentage();
		 
		 double netSalary = Empdetails.getNetSalary();
		   
		 Empdetails.setSalary(netSalary);
		 
		 Employee details1 = new Employee(id, name, salary, PFPercentage, netSalary);
		 
		return details1;
		 
	 }
	
	 public static void main(String[] args){
		 
		 Employee Student1 = new Employee();		 
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Enter Id: "); 
		 
		 int EmpID = scanner.nextInt();
		 
		 Student1.setEmployeeId(EmpID);
		 
       System.out.println("Enter Name: "); 
		 
		 String name = scanner.next();
		 
		 Student1.setEmployeeName(name);
		 
       System.out.println("Salary: "); 
		 
		 double salary1 = scanner.nextFloat();
		 
		 Student1.setSalary(salary1);
		 
      System.out.println(" Enter PF percentage: "); 
		 
		 int pfPer = scanner.nextInt();
		 
		 Student1.setPFPercentage(pfPer);		
		 
		 System.out.println("id is :" + Student1.getEmployeeId());
		 System.out.println("name is :" + Student1.getEmployeeName());
		 System.out.println("Salary is :" + Student1.getSalary());
		 System.out.println("Pf % is :" + Student1.getPFPercentage());
		 EmployeeMain.calculateNetSalary(Student1.getPFPercentage(),Student1.getSalary());
		 
		scanner.close(); 
	 }	
}
