package main;

import java.sql.Connection;
import java.util.Scanner;

import dao.*;
import dto.*;

public class MainMethod {

	public static void main(String[] args) {
		
		try {
		
		Connection conn = new DBConnector().getConnection();
		Scanner sc = new Scanner(System.in);
		MemberDTO member = null;
		
		System.out.println("===도서 대출관리 프로그램===");
//		로그인 화면
		
			while(!conn.isClosed()) {
				System.out.println("메뉴선택 : 1(도서 대출/반납), 2(도서 관리), 3(회원 관리), 4(조회/통계), 5(로그인/로그아웃), 6(종료)");
				String menu_ = sc.nextLine();
				
				switch(menu_) {
				case "1":
					LoanDAO dao = new LoanDAO(conn, sc, member);
					dao.selectMenu();
					break;
				case "2":
					System.out.println("-도서 관리 파트-");
					break;
				case "3":
					System.out.println("-회원 관리 파트-");
					break;
				case "4":
					System.out.println("-조회 통계 파트-");
					break;
				case "5":
					if(member == null) {
						System.out.println("-로그인-");
						member = new LogIn().login(conn, sc);
					} else {
						System.out.println("-로그아웃-");
						member = null;
					}
					break;
				case "6":
					System.out.println("===프로그램 종료===");
					if(conn != null) conn.close();
					break;
				default :
					System.out.println("메뉴를 다시 선택해주세요!");
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("서버 접속에 실패하였습니다.");
		}
		
	}

}
