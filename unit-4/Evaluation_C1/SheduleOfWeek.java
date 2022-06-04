package Evolution1;

public class SheduleOfWeek {
	
	public static void main(String[] args) {
		int dayOfWeek = 1;		
		
		switch(dayOfWeek)
		{
			case 1:
			System.out.println("Gym in the morning.");
			break;
			case 2:
			System.out.println("Class after work.");
			break;
			case 3:
			System.out.println("Meetings all day.");
			break;
			case 4:
			System.out.println("Work from home.");
			break;
			case 5:
			System.out.println("Game night after work." );
			break;
			default:
			System.out.println("Free!" );
			break;
		}
	}

}
