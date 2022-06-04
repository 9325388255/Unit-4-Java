package InheritanceAssignment6Que2;

import java.util.Scanner;

public class RunClass {
	
	public static void main(String[] args) {
		
		System.out.println("Transport Fee Details");
		DayScholar d1 = new DayScholar();
		
		Scanner sc1 = new Scanner(System.in);	
		
		System.out.println("Enter student id :");
		int id = sc1.nextInt();
		
		System.out.println("Enter student name :");
		String name = sc1.next();
		
		System.out.println("Enter transport Fee :");
		double tf = sc1.nextDouble();
		d1.setTransportFee(tf);

		System.out.println("Enter the fees You are paying now:");
		double fee = sc1.nextDouble();
		d1.payFee(fee);
		
		double remFee = d1.payFee(fee);
		  
		System.out.println("Remaining Fee to be paid=" + remFee );
		
		//sc1.close();
		System.out.println("===============================================");
		System.out.println("Hostel Fee Details");
		
		Hosteller h1 = new Hosteller();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student id :");
		int id1 = sc.nextInt();
		
		System.out.println("Enter student name :");
		String name1 = sc.next();
		
		System.out.println("Enter Hostel Fee :");
		double hf = sc.nextDouble();
		h1.setHostelFee(hf);

		System.out.println("Enter the fees You are paying now:");
		double fee1 = sc.nextDouble();
		h1.payFee(fee1);
		
		double remFee1 = h1.payFee(fee1);
		  
		System.out.println("Remaining Fee to be paid=" + remFee1 );
		
		sc.close();
		
	}

}
