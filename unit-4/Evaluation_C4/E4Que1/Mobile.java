package E4Que1;

import java.util.List;
import java.util.Scanner;

public class Mobile {
	
	public String addMobile(String company, String model) {
		return model;
		//this method will take a string as a company name and its model as an //argument.
		//ex: "apple", "Iphone13"
		//add the company as key and its model as an element of ArrayList in the above //mobiles HashMap.
		//if the company name already exists then their model should be added to the //existing list.
		//This method should return a message "Mobile added successfully" after //adding a mobile.
		}
	
	public List<String> getModels(String company)throws InvlidMobileException{
		return null;
		//This method return the list of all the models of the supplied company
		//if we supply any invalid company name then it should throw a checked exception
		}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	}
}


