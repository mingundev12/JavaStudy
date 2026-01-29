package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MemberInsert {
	public static void insert(Connection conn, Scanner sc) {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
				
//		String dbUrl = "jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul";
//		String dbUsr = "library";
//		String dbPwd = "1234";
//		
//		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
				
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// -------------------------------------------------
			String sql = ""; 
			sql += "insert into members (id, name, birth, phone, email, password) values";
			sql += "(null, ?, ?, ?, ?, ? )";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, birth);
			pstmt.setString(3, phone);
			pstmt.setString(4, email);
			pstmt.setString(5, password);
			int result = pstmt.executeUpdate(); // 0,1
			if(result > 0) {
				System.out.println("등록성공.");
			} else {
				System.out.println("등록실패.");
			}
			// -------------------------------------------------			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("데이터 베이스 접속 실패 또는 로딩 실패ㅠ");
		} finally {
			try {
				if (rs != null) { rs.close(); }
				if (pstmt != null) { pstmt.close(); }
//				if (conn != null) { conn.close(); }			
				} catch(Exception e) {
					e.printStackTrace();								
			}
		}
		
	}
}
