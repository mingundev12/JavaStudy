package com.plane.test.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection() throws Exception{
		String dbDrv = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://codevlab.kr:3306/plane";
		String dbUsr = "plane";
		String dbPsw = "p#2602";
		
		Class.forName(dbDrv);
		Connection conn = DriverManager.getConnection(dbUrl, dbUsr, dbPsw);
		
		return conn;
	}
}
