package Assignment5;

public class Employee {		
		
		private int employeeId;
		private String employeeName;
		private double salary;
		private int PFPercentage;
		private double netSalary;
		
		//create constructor 1st.0 argumnent 2nd parameterized	
		
		public Employee() {
			
		}
		
		public Employee(int employeeId, String employeeName, double salary, int pFPercentage, double netSalary) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.salary = salary;
			PFPercentage = pFPercentage;
			this.netSalary = netSalary;
		}

		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public int getPFPercentage() {
			return PFPercentage;
		}

		public void setPFPercentage(int pFPercentage) {
			PFPercentage = pFPercentage;
		}

		public double getNetSalary() {
			return netSalary;
		}

		public void setNetSalary(double netSalary) {
			this.netSalary = netSalary;
		}
}
