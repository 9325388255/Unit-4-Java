package Assignment1;

public class FactorsOfNumber { 
	
	//function or method
	void findFactorsOfNumber(int N){
		
		 if(N>=2 && N <=100) {
        	 for (int i = 1; i <= N; i++) {

                 // if number is divided by i
                 // i is the factor
                 if (N % i == 0) {
                   System.out.print( i + ", ");
                 }
               }
        }
        else {
        	System.out.print("Invalid number");
        }   
		
	}

	//main method call function to execute code
    public static void main(String[] args) {
    	
    	FactorsOfNumber x = new FactorsOfNumber();
    	x.findFactorsOfNumber(12);          	
    }
}
