package Assignment2;

public class StudenObj2 {
		int roll;	
		String name;	
		int marks;		
		
		void displayStudentDetails(int roll,String name,int marks)	{	
			System.out.println("Roll no is : "+ roll);	
						
			System.out.println("Name is : " + name);		
						
			System.out.println("Marks is : " + marks);		
					
		}	
		
		public static void main(String[] args){		
		StudenObj2 data =  new StudenObj2();		
		data.roll = 451;	
		data.name = "Krutika";	
		data.marks = 100;			
		data.displayStudentDetails(data.roll,data.name,data.marks);	//call function	
		System.out.println("-----------------------");		
		data.roll = 892;	
		data.name = "Nilesh";	
		data.marks = 70;		
		data.displayStudentDetails(data.roll,data.name,data.marks);		
		data = null;		
		data.displayStudentDetails(data.roll,data.name,data.marks);	
		//System.out.println("Garbage done");
}

}
