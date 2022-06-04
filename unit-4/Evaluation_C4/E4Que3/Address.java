package E4Que3;

import java.io.Serializable;

public class Address implements Serializable{
	
	String state = "Maharastra";
	String city = "Mul";
	String pincode = "441224";
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String state, String city, String pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
}
