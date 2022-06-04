package com.masai.usecases;

import java.sql.Connection;

import com.masai.utility.DBUtil;

public class ConnectionTest {
	

	public static void main(String[] args) {
		
		
		Connection conn= DBUtil.provideConnection();

		
		System.out.println("connected"+conn);		
	}

}
