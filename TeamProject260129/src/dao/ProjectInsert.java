package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProjectInsert {

	public static void insert(Connection conn, Scanner sc) {
		
		System.out.print("책 제목: ");
		String title = sc.nextLine();
		System.out.print("책 저자: ");
		String author = sc.nextLine();
		System.out.print("책 출판사: ");
		String publisher = sc.nextLine();
		
		
//		String dbUrl= "jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul";
//	    String dbUsr= "library";
//	    String dbPwd= "1234";
	    
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    
	    try {
//	    	Class.forName("com.mysql.cj.jdbc.Driver");
//	    	conn = DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
	    	//-------------------------------------------------------
	    	String sql=""; 
	    	sql += "insert into books (id,title,author,publisher) values";
	    	sql += "(null, ?, ?, ?)";
	    	pstmt = conn.prepareStatement(sql);
	    	pstmt.setString(1, title);
	    	pstmt.setString(2, author);
	    	pstmt.setString(3, publisher);
	        int result = pstmt.executeUpdate(); //0,1
	        if (result > 0) {
	        	System.out.println("등록 성공");
	        }else {
	        	System.out.println("등록 실패");
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