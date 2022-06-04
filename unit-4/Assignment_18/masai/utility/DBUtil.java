package com.masai.utility;

import java.sql.*;

public class DBUtil {
public static Connection provideConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
		Connection conn = null;

		String url = "jdbc:mysql://localhost:3306/db1";

		try {
			conn = DriverManager.getConnection(url, "root", "@Krutika123");
		}
		catch(SQLException sqle) {
			System.out.println(sqle.getMessage());
		}

		return conn;
	}
}