package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProjectDelete {

	public static void delete(Connection conn, Scanner sc) {
		
		System.out.println("삭제할 책 제목: ");
		String title = sc.nextLine();
//		int id = sc.nextInt();
		
//		String dbUrl= "jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul";
//	    String dbUsr= "library";
//	    String dbPwd= "1234";
	    
//	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    
	    try {
//	    	Class.forName("com.mysql.cj.jdbc.Driver");
//	    	conn = DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
	    	//-------------------------------------------------------
	    	String sql="delete from books where title =?"; 
	    	pstmt = conn.prepareStatement(sql);
	    	pstmt.setString(1, title);
	        int result = pstmt.executeUpdate(); //0,1
	        if (result > 0) {
	        	System.out.println("삭제 성공 - " + result);
	        }else {
	        	System.out.println("삭제 실패 - " + result);
	        }
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
