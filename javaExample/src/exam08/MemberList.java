package exam08;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberList {

	public static void main(String[] args) {
//		DB작업 : driver 로딩 -> 접속 -> 데이터 주고받기 -> 종료

		String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
		String dbUsr = "javaUser";
		String dbPwd = "1234";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		System.out.println("---------------------------------------------------");
		System.out.printf("%s\t%s \t %s \t %s \t\t %s \n", "순번", "아이디", "이름", "전화번호", "가입일시");
		System.out.println("---------------------------------------------------");
//		예외처리
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// ------------------------------------------------
			String sql = "select * from member order by no desc";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int no = rs.getInt("no");
				String id = rs.getString("id");
				String password = rs.getString("password");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				Date createdDate = rs.getDate("createdDate");
				
				System.out.printf("%s\t%s \t %s \t %s \t %s \n", no, id, name, phone, createdDate);
			}
			System.out.println("---------------------------------------------------");
			
			// ------------------------------------------------
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
	}

}
