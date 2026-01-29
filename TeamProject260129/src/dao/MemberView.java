package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MemberView {
	public static void view(Connection conn, Scanner sc) {
		System.out.print("상세보기 할 회원번호 : ");
		int id = sc.nextInt();
		
		
//		String dbUrl = "jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul";
//		String dbUsr = "library";
//		String dbPwd = "1234";
		
//		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// -------------------------------------------------
			String sql = "select * from members where id = ?"; 								
			pstmt = conn.prepareStatement(sql);			
			pstmt.setInt(1, id);		
			rs = pstmt.executeQuery(); // 0, 1
			if(rs.next()) {
				id = rs.getInt("id");
				// String id = rs.getString("id");
				String name = rs.getString("name");
				String birth = rs.getString("birth");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				String password = rs.getString("password");
				System.out.printf("%s \t %s \t %s \t %s \t %s \t %s\n", id, name, birth, phone, email, password);
			} else {
				System.out.println("등록된 회원이 없습니다.");
			}
			// -------------------------------------------------			
		} catch(Exception e) {
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
