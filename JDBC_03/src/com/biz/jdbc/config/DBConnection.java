package com.biz.jdbc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection dbConn = null;
	static {
		
		// OracleDriver의 full path
		String jdbcDriver = "oracle.jdbc.driver.OracleDriver" ;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String userName = "user5";
		String password = "1234" ;
		
		try {
			Class.forName(jdbcDriver);
			dbConn = DriverManager.getConnection(url,userName,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
