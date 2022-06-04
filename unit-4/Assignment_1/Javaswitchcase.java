package Assignment1;

public class Javaswitchcase {
	
	//non static method/function
	void aboutCity(String city) {
		
		switch(city)
		{
		case "Mumbai":
		System.out.println("Financial city");
		break;
		case "Kolkata":
		System.out.println("City of Joy");
		break;
		case "Delhi":
		System.out.println("Capital of the country");
		break;
		case "Bangalore":
		System.out.println("Cyber City");
		break;
		default:
		System.out.println("May be Other Indian City");
		break;
		}
	}
	
	//executing & calling function
	public static void main(String[] args) {		
	
		Javaswitchcase x = new Javaswitchcase();
		x.aboutCity("Pune");		
	}
}
