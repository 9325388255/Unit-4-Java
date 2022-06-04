package InheritanceAssignmentQue3;

import java.util.Scanner;

public class Demo {
	
	
//	public static Bank getBank(String bank) {
//		
//		return String;
//		
//	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//Modify Room NO
		System.out.println("Enter Bank Name: ");		
		String ans1=sc.next();
		if(ans1.equals("AXIS")) {
			System.out.println("Axis Bank Details: ");
			
			System.out.println("Enter Branch: ");		
			String name=sc.next();
			
			System.out.println("Enter IFSC Code: ");		
			String code=sc.next();
			
			System.out.println("Enter Rate Of Intrest: ");		
			double  int_rate=sc.nextDouble();
			
			AxisBank b1 = new AxisBank();
			b1.setBranchName(name);
			b1.setIfscCode(code);
			b1.setRateOfInterest(int_rate);
			b1.displayDetails();
		}
		else if(ans1.equals("ICICI")) 
		{
			System.out.println("ICICI Bank Details: ");
			
			System.out.println("Enter Branch: ");		
			String name1=sc.next();
			
			System.out.println("Enter IFSC Code: ");		
			String code1=sc.next();
			
			System.out.println("Enter Rate Of Intrest: ");		
			double  int_rate1=sc.nextDouble();
		
			
			ICICIBank b2 = new ICICIBank();
			b2.setBranchName(name1);
			b2.setIfscCode(code1);
			b2.setRateOfInterest(int_rate1);
			b2.displayDetails();
		}
		else {
			System.out.println("null");
		}	
		
	}

}
