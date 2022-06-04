package InheritanceAssignmentQue3;

public class Bank {
	

	String branchName;
	String ifscCode;
	
	public Bank(){
		
	}

	public Bank(String branchName, String ifscCode) {
		super();
		this.branchName = branchName;
		this.ifscCode = ifscCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
   public void displayDetails() {
		
		System.out.println("Brach Name is:" + branchName );
		System.out.println("Ifsc Code is:" + ifscCode );
	}

}
