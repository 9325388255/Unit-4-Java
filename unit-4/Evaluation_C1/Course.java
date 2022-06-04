package Evolution1;

public class Course {
	
	int courseId;
	String courseName;
	int courseFee;


	void displayCourseDetails(int courseId,String courseName,int courseFee)
	{
		System.out.println(courseId);
		System.out.println(courseName);
		System.out.println(courseFee);
	}	
	
	public static void main(String[] args) {

	String username = "Admin";
	String password = "1234";

	authenticate(username,password);

	String user1 = "Krutika";
	String pass1 = "1234";

	authenticate(user1,pass1);
	}
		static void authenticate(String username, String password)
		{
	
			if(username=="Admin"&&password=="1234")
			{
				Course check = new Course();
			
				check.courseId = 28;
				check.courseName = "Javascript";
				check.courseFee = 1999;
				check.displayCourseDetails(check.courseId,check.courseName,check.courseFee = 1993);
			}
			else
			{
				System.out.println("Invalid Username or password");
			}
	
		}

}
