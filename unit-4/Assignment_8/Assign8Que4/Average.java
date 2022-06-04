package Assign8Que4;

import java.util.Scanner;

public class Average {
	
	static void calculateAverage(int[] age){
		
		int sum = 0;
		
		for(int i = 0; i<age.length; i++) 
		 {
			sum = sum + age[i];
			
		 }
		
		System.out.println("The average age is" + (double)sum/age.length);
	}

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total no.of employees :");
		
		int noOfEmployee = sc.nextInt();
		
		if(noOfEmployee<2)//min 2 employee required
		{
			System.out.println("Please enter a valid employee count");
		}
		else
		{
		 int[] age = new  int[noOfEmployee];//no-- age.length

		 System.out.println("Enter the age for  "+ noOfEmployee + " employees");

			 int count = 0;
		    for(int j = 0;j<age.length;j++)
		    {
		    	
		    	int age1 = sc.nextInt();
		    	
		    	if(age1>=28 && age1<=40)//age bet 28 to 40
		    	{
		    		age[j] = age1;
		  	
		    	}
		    	else
		    	{
		    		count++;
		    		System.out.println("Employee age should be minimum of 28 years and maximum of 40 years");
		    		break;
		    	}
		    }
	    if(count>=1)
	    {
	    	System.out.println("Invalid age encountered!, please provide age between 28 to 40");
	    }
	    else
	    calculateAverage(age);		
		sc.close();
		}
		
	}

}
