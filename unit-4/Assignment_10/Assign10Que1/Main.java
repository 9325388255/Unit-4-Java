package Assign10Que1;
	
	import java.util.Scanner;
	import java.time.*;
	import java.time.format.DateTimeFormatter;
	import java.time.temporal.ChronoUnit;

	public class Main {

		long calculateAge(String userDob) throws InvalidDateFormat{
			long age = 0;
			try {
				LocalDate dob = LocalDate.parse(userDob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				LocalDate today = LocalDate.now();
				if(dob.isAfter(today)) {
					System.out.println("Date should not be in the Future");
				}
				else {
					age = ChronoUnit.YEARS.between(dob, today);
				}
				return age;
			}
			catch(Exception e) {
				throw new InvalidDateFormat("Invalid Date Pattern Provided. Please give DOB in required pattern only.");
			}
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Please enter your Date of Birth in DD/MM/YYYY format");
				String userDob = sc.next();
				long userAge = new Main().calculateAge(userDob);

				if(userAge!=0)
					System.out.println("Your age is " + userAge + " years");
			}
			catch(InvalidDateFormat idf) {
				System.out.println(idf.getMessage());
			}
			finally {
				sc.close();
			}
		}

}
