package InheritanceAssignment6Que2;

public class DayScholar extends Student {
	
	Student s1=new Student();
	
	double transportFee = 10000;
	
	DayScholar(){
		
	}

	public DayScholar(Student s1, double transportFee) {
		super();
		this.transportFee = transportFee;
	}

	public double getTransportFee() {
		return transportFee;
	}

	public void setTransportFee(double transportFee) {
		this.transportFee = transportFee;
	}
	
	@Override
	void displayDetails() {

		System.out.println("Student ID : "+ studId);
		
		System.out.println("Studemnt name : "+studName);	
		
		System.out.println("Exam Fee : "+examFee);	
		
		System.out.println("Transport Fee : "+transportFee);	
		
		//System.out.println(" total fees to be paid : "+ (transportFee - fee));
	}
	
	@Override
	double payFee(double fee){
		
		return  (getTransportFee() - fee);

	}
	

}
