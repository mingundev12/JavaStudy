package exam08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

//회원등록프로그램
public class MemberInsert {

	public static void main(String[] args) {
		


		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.println("id : " + id);
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		
		sc.close();
		
		String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
		String dbUsr = "javaUser";
		String dbPwd = "1234";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
//		예외처리
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			
			// ------------------------------------------------
			String sql = "";
			sql += "insert into member (no, id, password, name, phone, createdDate) values";
			sql += "(null, ?, ?, ?, ?, now())";
			
			pstmt = conn.prepareStatement(sql);
//			DB에서의 index 는 1부터 시작한다.
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			pstmt.setString(3, name);
			pstmt.setString(4, phone);
			
			int result = pstmt.executeUpdate(); // 0 or 1
			// ------------------------------------------------
			if (result > 0) {
				System.out.println("등록성공.");
			} else {
				System.out.println("등록실패.");
			}
			
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 또는 접속 실패");
		} finally {
			try {
				if (rs != null) { rs.close(); }
				if (pstmt != null) { pstmt.close(); }
				if (conn != null) { conn.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		System.out.println("--- 프로그램 종료 ---");
	}

}
