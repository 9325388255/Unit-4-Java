package E2Que1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Loan l1 = new Loan();
	       
		Employee pE = new PermanentEmployee();
		
		Employee tE = new TemporaryEmployee();
		
		l1.calculateLoanAmount(pE);
		
		l1.calculateLoanAmount(tE);
		
		l1.calculateLoanAmount(null);	    
		}
		
	}


