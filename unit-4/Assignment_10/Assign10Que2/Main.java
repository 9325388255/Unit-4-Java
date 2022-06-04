package Assign10Que2;

import java.util.Scanner;

public class Main extends EmployeeBonous {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Please enter your joining in DD/MM/YYYY");
				String dateOfJoining = sc.next();
				System.out.println("Your Employee Bonus is " + new EmployeeBonous().calculatebonus(dateOfJoining));
			}
			catch(InvalidAge iae) {
				System.out.println(iae.getMessage());
			}
			finally {
				sc.close();
			}
		}
}
