package Assignment1;

public class SumOfNaturalNumbers {
	
	// function/method logic
	void sum(int n) {
		
		int sum = 0;  
		
		for(int i = 1; i <= n; i++)  
		{  
		
		sum = sum + i;  
		}  
		 
		System.out.println("sum of first "+ n +" natural numbers ="+sum);  
	}
	
	
	//call for execute function
	public static void main(String[] args) {
		 
		SumOfNaturalNumbers x = new SumOfNaturalNumbers();
		
		x.sum(10);
		
	}		

}
