package InheritanceAssignment6Que2;

public class Hosteller extends Student {
	
	double hostelFee;
	
	public Hosteller() {
		
	}

	public Hosteller(double hostelFee) {
		super();
		this.hostelFee = hostelFee;
	}

	public double getHostelFee() {
		return hostelFee;
	}

	public void setHostelFee(double hostelFee) {
		this.hostelFee = hostelFee;
	}
	
	
	@Override
	void displayDetails(){
		
		System.out.println("Student ID : "+ studId);
		
		System.out.println("Studemnt name : "+studName);	
		
		//System.out.println("Exam Fee : "+examFee);	
		
		System.out.println("Hostel Fee : "+ hostelFee);	
		
		//System.out.println(" total fees to be paid : "+ (hostelFee + fee));
	}
	
	@Override
	double payFee(double fee){
		
		return  (getHostelFee() - fee);
		

	}
}
