package main;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	
	private Connection conn;
	
	public DBConnector() throws Exception{
		
		String dbDrv = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul";
		String dbUsr = "library";
		String dbPwd = "1234";

		Class.forName(dbDrv);
		conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
		
	}
	
	public Connection getConnection() {
		return conn;
	}
}
