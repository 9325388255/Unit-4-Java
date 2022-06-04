package E3Que4;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Que4{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Date of birth in dd-MM-yyyy format");
		String dob = sc.next();
		
		try {
			
			LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
			LocalDate today = LocalDate.now();
			
			Period age = Period.between(d1, today);
			
			if(d1.isAfter(today)) {
				System.out.println("Date of birth should not be in future");
			}
			else if(age.getYears() >=18) {
				
				if((age.getDays()==0) && (age.getMonths()==0)) {
					System.out.println("Happy Birthday, You are eligible to cast your vote.");
				}
				else {
					System.out.println("You are eligible to cast your vote");
				}
			}
			else {
				System.out.println("You are not eligible to cast your vote");
			}
		}
		catch(Exception e) {
			System.out.println("please pass the date in the proper format");
		}	
	}

}
