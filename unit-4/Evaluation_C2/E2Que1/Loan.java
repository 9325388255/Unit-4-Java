package E2Que1;

public class Loan {
	
	public double calculateLoanAmount(Employee employeeObj) {
	    double loan=0;
	    if(employeeObj instanceof PermanentEmployee)
	    {
	        loan=0.15*(employeeObj.getSalary());
	        return loan;
	    }
	    if(employeeObj instanceof TemporaryEmployee)
	    {
	        loan=0.1*(employeeObj.getSalary());
	        return loan;
	    }
	    else
	    {
	        return 0;
	    }
	  }

}
