package InheritanceAssignmentQue3;

public class ICICIBank extends Bank {
	
	double rateOfInterest;
	
	public ICICIBank() {
		
	}

	public ICICIBank(double rateOfInterest) {
		super();
		this.rateOfInterest = rateOfInterest;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	

	@Override
	 public void displayDetails() {
			
			System.out.println("Brach Name is:" + branchName );
			System.out.println("Ifsc Code is:" + ifscCode );
			System.out.println("Rate Of Intrest is:" +rateOfInterest  );
	}
	
}
