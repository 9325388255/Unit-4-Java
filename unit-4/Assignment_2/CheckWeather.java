package Assignment2;

public class CheckWeather {
	
	public static void main(String[] args) {
		boolean isSnowing = false;
		boolean isRaining = false;
		double temperature = 60.0;
		
		if(isSnowing ==true || isRaining==true || temperature<50) {
			System.out.println("Let's stay home.");
		}
		else {
			System.out.println("Let's go out!");
		}
	}

}
