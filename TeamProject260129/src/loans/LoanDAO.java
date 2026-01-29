package loans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import members.MemberDTO;

public class LoanDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Scanner sc;
	private MemberDTO memberLogIn;
	
	public LoanDAO(Scanner sc, MemberDTO member) {
		this.sc = sc;
		this.memberLogIn = member;
		
		memberLogIn.setId(1);
		
		String dbDrv = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul";
		String dbUsr = "library";
		String dbPwd = "1234";

		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void selectMenu() {
		while (true) {
			System.out.println("메뉴 선택 : 1(도서 대출), 2(도서 반납), 3(회원별 대출 현황 조회), 4(종료)");
			
			String menu_ = sc.nextLine();
			
			switch(menu_) {
			case "1":
				loanBook();
				break;
			case "2":
				returnBook();
				break;
			case "3":
				showLoanList();
				break;
			case "4":
				System.out.println("종료");
				return;
			default :
			}
		}
	}
	
	public void loanBook() {
		System.out.println("도서 대출");
		
//		System.out.println("대출할 회원 이름 : ");
//		String member_name = sc.nextLine();
		System.out.println("대출할 책 제목 : ");
		String title = sc.nextLine();
		
		LoanDTO loan = new LoanDTO();
		loan.setMemberId(memberLogIn.getId());
		String sql = "select * from books where title = '" + title + "'";
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				loan.setBookId(rs.getInt("id"));
			}
			
			sql = "insert into loans (id, member_id, book_id, is_loan, loan_date) values";
			sql += "(null, '" + loan.getMemberId() + "','" + loan.getBookId() + "','1',now())";
			
			pstmt = conn.prepareStatement(sql);
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("처리 성공");
			} else {
				System.out.println("처리 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public void returnBook() {
		System.out.println("도서 반납");
		
//		System.out.println("대출할 회원 이름 : ");
//		String member_name = sc.nextLine();
		System.out.println("반납할 책 제목 : ");
		String title = sc.nextLine();
		
		LoanDTO loan = new LoanDTO();
		loan.setMemberId(1);
		String sql = "select * from books where title = '" + title + "'";
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				loan.setBookId(rs.getInt("id"));
			}
			
			sql = "insert into loans (id, member_id, book_id, is_loan, loan_date) values";
			sql += "(null, '" + loan.getMemberId() + "','" + loan.getBookId() + "','-1',now())";
			
			pstmt = conn.prepareStatement(sql);
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("처리 성공");
			} else {
				System.out.println("처리 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void showLoanList() {
		System.out.println("회원별 대출 현황 조회");
		
		List<LoanDTO> loanList = new ArrayList<>();
		String sql = "select * from loans where member_id = '" + memberLogIn.getId() + "'";
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				loanList.add(new LoanDTO(
						rs.getInt("id"), rs.getInt("member_id"), rs.getInt("book_id"), rs.getInt("is_loan"),
						rs.getDate("loan_date")
						));
			}
			
			for(LoanDTO loan : loanList) {
				System.out.println(loan);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
}
