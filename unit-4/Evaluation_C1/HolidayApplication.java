package Evolution1;

public class HolidayApplication {

	
	public static void main(String[] args) {
		
		int dayofweek=7;
		boolean holiday=false;
		
		if((dayofweek==1 || dayofweek==2 || dayofweek==3 || dayofweek==4 || dayofweek==5)&& holiday == false) {
			System.out.println("Wake up at 7:00");
		}
		else if((dayofweek==1 || dayofweek==2 || dayofweek==3 || dayofweek==4 || dayofweek==5)&& holiday == true) {
			System.out.println("Sleep in!");
		}
		else
		{
			System.out.println("Sleep in!");
		}
	}

}
