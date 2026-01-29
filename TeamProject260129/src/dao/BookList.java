package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookList {

	public static void list(Connection conn) {
//		String dbUrl= "jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul";
//	    String dbUsr= "library";
//	    String dbPwd= "1234";
//	    
//	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    
	    try {
//	    	Class.forName("com.mysql.cj.jdbc.Driver");
//	    	conn = DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
	    	//-------------------------------------------------------
	    	String sql = "select * from books order by id desc";
 	    	pstmt = conn.prepareStatement(sql);
 	        rs = pstmt.executeQuery();
 	        while(rs.next()) {
 	        	int id = rs.getInt("id");
 	        	String title = rs.getString("title");
 	        	String author = rs.getString("author");
 	        	String publisher = rs.getString("publisher");
 	        	
 	        	System.out.printf("%s \t %s \t %s \t %s\n", id, title, author, publisher);
 	        }
 	        System.out.printf("----------------------------");
	    	//-------------------------------------------------------
		
	    }catch(Exception e) {
	    	System.out.println("드라이버 로딩 실패 또는 데이터베이스 접속 실패..");
	    }finally {
	    	try {
	    		if(rs!= null) { rs.close();}
	    		if(pstmt!= null) { pstmt.close();}
//	    		if(conn!= null) {conn.close();}
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    }
//	    System.out.println("---프로그램 종료---");
	}

}