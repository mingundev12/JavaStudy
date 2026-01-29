package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MemberUpdate {
	public static void update(Connection conn, Scanner sc) {
		
		System.out.print("바꿀 회원 아이디 : ");
		String id_ = sc.nextLine();
		int id = Integer.parseInt(id_);
		System.out.print("새로운 전화번호 : ");
		String phone = sc.nextLine();		
		System.out.print("수정할 이메일 : ");
		String email = sc.nextLine();
		System.out.print("새로운 비밀번호  : ");
		String password = sc.nextLine();
		
//		String dbUrl = "jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul";
//		String dbUsr = "library";
//		String dbPwd = "1234";
		
//		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 예외처리
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// -------------------------------------------------
			String sql = ""; 
			sql += "update members set phone = ?, email = ?, password = ? where id = ?";
			// update member set name = '홍이동', phone = '0000' where id = ?;			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, email);
			pstmt.setString(3, password);		
			pstmt.setInt(4, id);		
			int result = pstmt.executeUpdate(); // 0, 1
			if(result > 0) {
				System.out.println("수정성공.");
			} else {
				System.out.println("수정실패.");
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
