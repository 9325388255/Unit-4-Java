package E2Que1;

public class TemporaryEmployee extends Employee{
	
	private int hoursWorked;
	private int hourlyWages;
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	TemporaryEmployee(){
		
	};
	
	TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages){
		
	}

	@Override
	void calculateSalary() {
		
		double salary = hoursWorked * hourlyWages;
		
		setSalary(salary);
	}
	
}
