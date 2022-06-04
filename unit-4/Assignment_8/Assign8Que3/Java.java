package Assign8Que3;

import java.util.Scanner;

public class Java {
	
static void display( String name , String... mobile){
		
		
		String[] outdatedModels = {"note4","note5","note6","note7"};
		
		System.out.println("Mobile Company Name " + name);
	
	if(mobile.length>0)
	{
		
	
		for(int i = 0; i<mobile.length; i++)
		 {
			if(mobile[i].equals(outdatedModels[0]) ||mobile[i].equals(outdatedModels[1])||mobile[i].equals(outdatedModels[2])||mobile[i].equals(outdatedModels[3]))
				{
					System.out.println(mobile[i] +"_OUTDATED");
				}
				else
				{
					System.out.println(mobile[i]);
					
				}
			
		 }
	}
	
	}

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  mobile Company name :");
		
	    String name = sc.next();
	  
	    System.out.println("Enter how many no. of Models required :");
	    
	    int length = sc.nextInt();//how many search required
	    
	    String[] modeles = new  String[length];//array create according to no
	    
	    int count = 1;
	    for(int j = 0; j<length; j++) //length mobile usse can pass any no of models
	    {
	    	System.out.println("Enter  mobile Model no:" + count++  + " out of" + (modeles.length));  //Enter  mobile Model no:1 out of5 (if select 5 lenth)
	    	String name1 = sc.next(); 
	    	
	    	modeles[j] = name1;
	    }
	    		
	    display( name , modeles); //check outdated or not and print
		
		sc.close();
		

		
	}

}
