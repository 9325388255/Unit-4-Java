package Assign15Que1;

import java.io.Serializable;

//Create the Student bean class with the following fields: roll: Integer name: String address: Address 
// Student Has Address email: String password: String

public class Student extends Address{
	
	int roll = 234;
	String name = "Kruti";
	String email = "krut.wad";
	String password = "krut12345";
	
	void funx(){
		Address a = new Student();
		System.out.println(a);
	}
	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", state=" + state + ", city=" + city + ", pincode=" + pincode +"]";
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.password = password;
	}
}
