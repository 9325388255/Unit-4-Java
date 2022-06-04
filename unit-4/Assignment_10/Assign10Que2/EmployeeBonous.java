package Assign10Que2;

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EmployeeBonous {
	double bonus;
	
	double calculatebonus(String dateOfJoining) throws InvalidAge{
		
		try {
			LocalDate joiningDate = LocalDate.parse(dateOfJoining, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			LocalDate today = LocalDate.now();
			
			if(joiningDate.isAfter(today)){
				throw new InvalidAge();
			}
			else {
				double experience = ChronoUnit.YEARS.between(joiningDate, today);
				
				if(experience < 1) {
					bonus = 5000;
				}
				else if(experience > 1 && experience < 2 ) {
					bonus = 8000;
				}
				else {
				bonus = 10000;
				}
			}
			return bonus;
		}		
		catch(InvalidAge iae) {
			throw new InvalidAge("Joining Date cannot be in the future");
		}
		catch(Exception e) {
			throw new InvalidAge("Please pass the date in the correct format");
		}
	}
}
	
