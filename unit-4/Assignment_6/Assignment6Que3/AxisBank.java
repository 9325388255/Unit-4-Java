package InheritanceAssignmentQue3;

public class AxisBank extends Bank {
	
	double rateOfInterest;
	
	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public AxisBank(){
		 
	 }
	 
	 public AxisBank(double rateOfInterest) {
		super();
		this.rateOfInterest = rateOfInterest;
	}



	void getCreditCard(){
		 System.out.println("Get the Credit Card from the Axis bank");
	 }
	
	@Override
	 public void displayDetails(){
			
		System.out.println("Brach Name is:" + branchName );
		System.out.println("Ifsc Code is:" + ifscCode );
		System.out.println("Rate Of Intrest is:" +rateOfInterest);
		
		getCreditCard();
	}

}
