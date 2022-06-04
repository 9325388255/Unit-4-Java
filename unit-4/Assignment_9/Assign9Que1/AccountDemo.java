package Assign9Que1;

import java.util.Scanner;

public class AccountDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Account a = new Account(12345);
		System.out.println("Enter Your Account Number");
		String accountNumber = sc.nextLine();
		
		System.out.println("Deposit Your Amount:");
		int amount = Integer.parseInt(sc.nextLine());
		a.deposit(amount);

		try
		{
		    System.out.println("Enter Amount to Withdraw:");
		    int withdrawAmount = Integer.parseInt(sc.nextLine());
		    a.withdraw(withdrawAmount);
		    System.out.println("---------------------------------------");
		    System.out.println("Withdrawal Successful");
		    System.out.println("Amount after Withdrawal: "+ (amount - withdrawAmount));

		}
		catch(Exception e)
		{
			System.out.println("-----------------------");
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}


