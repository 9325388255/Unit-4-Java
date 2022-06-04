package InheritanceAssignment6Que2;

public class Student {
	
	int studId; 
	String studName; 
	double examFee;
	
	public Student() {
		
	}
	public Student(int studId, String studName, double examFee) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public double getExamFee() {
		return examFee;
	}
	public void setExamFee(double examFee) {
		this.examFee = examFee;
	} 	
	
	
	void displayDetails() {
		
		System.out.println("Student ID : "+ studId);
		
		System.out.println("Studemnt name : "+studName);	
		
		System.out.println("Exam Fee : "+examFee);	
					
	}
	
	double payFee(double fee) {
		return fee;
	}

}
