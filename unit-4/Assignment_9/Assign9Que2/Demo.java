package Assign9Que2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Customer c = new Customer();
		
		System.out.println("Enter username");
		String username = sc.next();
			if(Pattern.matches("[a-zA-Z]{3,8}", username))
			    {
					c.setUsername(username);
				}
			else
			    {
			    	 System.out.println("Invalid username, enter only alphabet and length between 3 to 8 character");
			    }
		
		System.out.println("Enter password");
		String password = sc.next();
			if(Pattern.matches("[a-zA-Z0-9]{3,9}", password))
				{
				c.setPassword(password);
				}
			else
		    	{
		    		System.out.println("Invalid Password,valid password includes a-z,A-Z,0-9 and length between 3 to 8");
		    	}


		
		System.out.println("Enter mobileNumber");
		String mobile = sc.next();
			if(Pattern.matches("[6789][0-9]{9}", mobile))
				 {
					c.setMobileNumber(mobile);
				 }
			 else
	    		 {
	    			 System.out.println("enter valid mobile number, start with 6,7,8,9 and length must be 10 digits");
	    		 }
		
		System.out.println("Enter email");
		String mail = sc.next();
			if(Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", mail))
			 	{
				c.setEmail(mail);
			 	}		
			 else
				 {
					System.out.println("Enter valid mail"); 
				 } 			    	

	    			    	System.out.println("Your Provided Details----------");
	    			    	System.out.println("Username: "+c.getUsername());
	    			    	System.out.println("Mobile No: "+c.getMobileNumber());
	    			    	System.out.println("Password: "+c.getPassword());
	    			    	System.out.println("Email: "+c.getEmail());

	}

	}




