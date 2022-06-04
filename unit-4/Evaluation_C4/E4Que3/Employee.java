package E4Que3;

public class Employee extends Address {
	
	int empId = 451;
	String empName = "Krutika";
	//address: Address // Employee Has Address
	String email = "krutika@gmail.com";
	String password = "@Krut90ui";
	
	void funX() {
		
		Address a = new Employee();
		System.out.println(a);
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email
				+ ", state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
}
;