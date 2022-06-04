package Assignment5;

public class Account {
	
	private int accountId;
	private String accountType;
	private int balance;
	
	Account(){
		
	}

	public Account(int accountId, String accountType, int balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}	
	
	 public boolean withdraw(int amt) 
	 {
		 if(balance >= amt ) {
			 
			 balance -= amt;
			 
			 System.out.println("Balance amount after withdraw:" + balance);
			 return true;
			 
		 }
		 else
			 System.out.println("Sorry!!! No enough balance");
			 return false;
	 }
}
