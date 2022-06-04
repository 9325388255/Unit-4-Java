package E2Que1;

public class PermanentEmployee extends Employee {
	
	private double basicPay;	
	
	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	PermanentEmployee(){
		
	}

	PermanentEmployee(int employeeId, String employeeName, double basicPay){
		
	};
	

	@Override
	void calculateSalary() {
		
//		salary = basicPay – PF amount; this value to the salary attribute.
//		Here PF Amount = basicPay * 0.12;
		
		double PFamount = basicPay * 0.12;
		
		double salary = basicPay - PFamount;
		
		setSalary(salary);
		
	}

}
