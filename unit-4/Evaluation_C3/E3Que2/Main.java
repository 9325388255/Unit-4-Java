package E3Que2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String special = ",;:.?!" ;
		
		System.out.println("Enter Student's Article: ");
		
		String input = sc.nextLine();
		
		int uCount = 0;
		int wCount=1;
		String output="";
		 
      
		for(int i=0; i<input.length(); i++) {
			
			if(input.charAt(i)==',' || input.charAt(i)==';' || input.charAt(i)==':' || input.charAt(i)=='.' || input.charAt(i)=='?' 
					|| input.charAt(i)=='!') {
				 uCount++;
			}
			if(input.charAt(i)==' ') {
				wCount++;
			}		
	}
	System.out.println("Number of words: "+wCount);
	System.out.println("Number of unique words: "+uCount);
	
	
	String[] ip1 = input.split(" ");
	int count = 0;
	for(String i:ip1) {
		
		if(i != "," && i != ";" && i != ":" && i != "." && i != "?" && i != "!") {
			
			count++;
			
			System.out.println(count+". "+i);
			
		}
		
	}
	}
}
