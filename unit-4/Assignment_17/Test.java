package Assignment17_SqlJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id whose salary want to check");
		int eid= sc.nextInt();
		
		System.out.println("Enter EmpID :");
		int eid1= sc.nextInt();
		
		System.out.println("Enter name :");
		String name1= sc.next();
		
		System.out.println("Enter Salary :");
		int sal1= sc.nextInt();
		
		System.out.println("Enter Employee Id whose Details want to know");
		int eid2= sc.nextInt();
				
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db1";
		
		
		try(Connection conn= DriverManager.getConnection(url, "root", "@Krutika123")) {
			
			//Statement st= conn.createStatement();
				
			PreparedStatement ps= conn.prepareStatement("select * from employee where eid =?");
			ps.setInt(1, eid);
			
			PreparedStatement ps1= conn.prepareStatement("select * from employee");
			
			PreparedStatement ps2= conn.prepareStatement("update employee set salary = salary + 500");			
			
			ResultSet rs= ps.executeQuery();
			ResultSet rs1= ps1.executeQuery();
			int x= ps2.executeUpdate();
			
			
			PreparedStatement ps3= conn.prepareStatement("insert into employee values(?,?,?,?)");
			
			ps3.setInt(1, eid1);
			ps3.setString(2, name1);
			ps3.setString(3, null);
			ps3.setInt(4, sal1);
			int x2= ps3.executeUpdate();
			
			PreparedStatement ps4= conn.prepareStatement("select * from employee where eid =?");
			ps4.setInt(1, eid2);
			ResultSet rs4= ps4.executeQuery();
			
			
			PreparedStatement ps5= conn.prepareStatement("select * from employee where salary < 80000");
			ResultSet rs5= ps5.executeQuery();
			
			
			
			
			System.out.println("---------------ANS 1---------------------");
			if(rs.next()) {
				
				int e= rs.getInt("eid");
				int s= rs.getInt("salary");
				
				System.out.println("Salary is :"+s);
				System.out.println("=================================================================================");
				
			}
			else
				System.out.println("Student does not exist..");
			
			System.out.println("---------------ANS 2---------------------");
			System.out.println("Employee Details");
			System.out.println("=================================================================================");
			
			while(rs1.next()) {
				int e1 = rs1.getInt("eid");
				int s1= rs1.getInt("salary");
				String n1= rs1.getString("name");
				String a1 = rs1.getString("address");
				
				System.out.println("Eid is :"+e1);
				System.out.println("Name is :"+n1);
				System.out.println("Address is :"+a1);
				System.out.println("Salary is :"+s1);
				System.out.println("============================");
			}
			
			System.out.println("---------------ANS 3---------------------");
			if(x>0) {
				System.out.println(" bonous Rs 500 added...");
			}
			
			System.out.println("---------------ANS 4---------------------");
			if(x2 > 0)
				System.out.println("record inserted...");
			else
				System.out.println("not inserted...");	
			
			System.out.println("---------------ANS 5---------------------");
			
			if(rs4.next()) {
				int e4 = rs4.getInt("eid");
				int s4= rs4.getInt("salary");
				String n4= rs4.getString("name");
				String a4 = rs4.getString("address");
				
				System.out.println("Eid is :"+e4);
				System.out.println("Name is :"+n4);
				System.out.println("Address is :"+a4);
				System.out.println("Salary is :"+s4);
				System.out.println("============================");
			}

			System.out.println("---------------ANS 6---------------------");
			while(rs5.next()) {
				int e5 = rs5.getInt("eid");
				int s5= rs5.getInt("salary");
				String n5= rs5.getString("name");
				String a5 = rs5.getString("address");
				
				System.out.println("Eid is :"+e5);
				System.out.println("Name is :"+n5);
				System.out.println("Address is :"+a5);
				System.out.println("Salary is :"+s5);
				System.out.println("============================");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
