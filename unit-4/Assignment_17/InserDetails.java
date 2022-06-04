package Assignment17_SqlJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class InserDetails {
	
	public static void main(String[] args) {
 
while(true){
	 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter EmpID :");
	int eid= sc.nextInt();
	
	System.out.println("Enter name :");
	String name= sc.next();
	
	System.out.println("Enter address :");
	String address = sc.next();
	
	System.out.println("Enter Salary :");
	int sal= sc.nextInt();

	System.out.println("do you want to add more (Y/N)");
	String c = sc.next();
	
		
		//step 2 is optional from java 1.7 but use as a beginner
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//step 3
		
		String url = "jdbc:mysql://localhost:3306/db1";
		
		try (Connection conn= DriverManager.getConnection(url,"root", "@Krutika123")){
			
			
			PreparedStatement ps= conn.prepareStatement("insert into employee values(?,?,?,?)");
			
			
			ps.setInt(1, eid);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setInt(4, sal);
			
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				System.out.println("record inserted...");
			else
				System.out.println("not inserted...");		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(c.equals("n") || c.equals("N")) {
			break;
		}
	}
	}
}
