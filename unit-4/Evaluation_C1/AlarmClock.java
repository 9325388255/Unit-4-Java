package Evolution1;

public class AlarmClock {
	
	void AlarmClockApp(int n , boolean h) {
		
		if((n == 0 || n == 1 || n==2 || n==3 || n==4)&& h==true) {
			System.out.println("10:00");
		}
		else if((n==5 || n==6) && h==true) {
			System.out.println("off");
		}
		else if((n == 0 || n == 1 || n==2 || n==3 || n==4)&& h==false) {
			System.out.println("7:00");
		}
		else if((n==5 || n==6) && h==false) {
			System.out.println("10:00");
		}
		else {
			System.out.println("error");
		}
	}
	
	
	public static void main(String[] args) {
		 AlarmClock test =  new AlarmClock();
		 
		 test.AlarmClockApp(1 , true);
	}	

}
