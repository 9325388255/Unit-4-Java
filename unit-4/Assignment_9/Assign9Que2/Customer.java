package Assign9Que2;

public class Customer {
	
	String username; 
	String password;
	String mobileNumber;
	String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Customer() {
		
	};
	public Customer(String username, String password, String mobileNumber, String email) {
		super();
		this.username = username;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	
	

}
