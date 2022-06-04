package Assignment5;

import java.util.Scanner;

public class AccountDetails {
	
public Account getAccountDetails() {
		
		Account a1 = new Account();
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter account id:");

		int accountID = sc1.nextInt();

		System.out.println("Account Type:");

		String accountType = sc1.next();

        System.out.println("Enter Balance Amount:");

		int balance = sc1.nextInt();
		
		if(balance <= 0) {
			System.out.println("Balance should be positive");
			System.out.println("Enter balance Amount:");
			balance = sc1.nextInt();
		}
		
		a1.setAccountId(accountID);
		a1.setAccountType(accountType);
		a1.setBalance(balance);
		
		return a1;		
		
	}
	
	public int getWithdrawAmount() 
	{
		Scanner sc2 = new Scanner(System.in);

		System.out.println("Enter amount to be withdrawn:");	

		int withDrawAmount = sc2.nextInt();

			if(withDrawAmount<=0) {

				System.out.println("Amount should be positive");

				System.out.println("Enter amount to be withdrawn:");

				 withDrawAmount=sc2.nextInt();
			}

			sc2.close();

			return withDrawAmount;
	}
	
	public static void main(String[] args) {
		
		AccountDetails ad = new AccountDetails();

		Account ac = ad.getAccountDetails();

		int withDrawAmount1= ad.getWithdrawAmount();

		ac.withdraw(withDrawAmount1);		
	}

}
