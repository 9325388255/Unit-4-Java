package Assign9Que1;

public class Account {
	
	int accountNumber;
	double balance;

	public Account() {
		super();
	}

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	void deposit(double amount) {
		balance += amount;
	}

	double withdraw(double amount) throws InsufficientFundsException{
		if(balance > amount) {
			balance -= amount;
		}
		else {
			throw new InsufficientFundsException("Insufficient Balance in your account.");
		}
		return balance;
	}
}
