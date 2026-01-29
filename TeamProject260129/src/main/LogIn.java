package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import dto.MemberDTO;

public class LogIn {

	public MemberDTO login(Connection conn, Scanner sc) throws Exception{
		System.out.print("이메일 입력 : ");
		String email = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = sc.nextLine();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// -------------------------------------------------
		String sql = "select * from members where email = ?"; 								
		pstmt = conn.prepareStatement(sql);			
		pstmt.setString(1, email);			
		rs = pstmt.executeQuery(); // 0, 1
		if(rs.next()) {
			MemberDTO member = new MemberDTO(
					rs.getInt("id"), rs.getString("name"),
					rs.getString("birth"), rs.getString("phone"),
					rs.getString("email"), rs.getString("password")
					);
			if (member.getPassword().equals(password)) {	
				System.out.println("로그인 성공!");
				return member;
			} else {
				System.out.println("이메일 또는 비밀번호를 잘못 입력되었습니다.");
				return null;
			}			
		}
		// -------------------------------------------------			
		if (rs != null) { rs.close(); }
		if (pstmt != null) { pstmt.close(); }
//				if (conn != null) { conn.close(); }			
//		System.out.println("-- 프로그램 종료 --");
		return null;
	}

}
