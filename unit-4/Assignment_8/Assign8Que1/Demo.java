package Assign8Que1;

import java.util.Scanner;

public class Demo {
	
	
	public  Hotel provideFood(int amount)
	{		
		Hotel h1 = null;
		
		if(amount>1000)
		{
			h1 = new TajHotel();
	
		}
		else if(amount>200 && amount<1000)
		{
			
			h1 = new RoadSideHotel();
			
		}
		
			return h1;
		
}
	
	public static void main(String[] args) {
		
		
		Demo d1 = new Demo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter  amount :");
		
		int amount = sc.nextInt();
		
		Hotel h =  d1.provideFood(amount);
		
		//Object obj = d1.provideFood(amount);
		
		if(h != null)
		{
			h.chickenBiryani();
			h.masalaDosa();
			
			if(h instanceof TajHotel)
			{
				TajHotel h1 = (TajHotel)h;
				
				h1.welcomeDrink();
			}
		}
		else
		{
			System.out.println("Please Enter a valid amount ");
		
		}
	
	}


}
