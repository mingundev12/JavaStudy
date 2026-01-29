package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import dto.*;

public class LoanDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Scanner sc;
	private MemberDTO member;
	private final int LOAN_BOOK_CAP = 3;

	public LoanDAO(Connection conn, Scanner sc, MemberDTO member) {
		this.sc = sc;
		this.member = member;
		this.conn = conn;

	}

	public void selectMenu() throws Exception {
		if (member == null) {
			System.out.println("로그인 상태가 아닙니다!");
			return;
		}
		System.out.println("-도서 대출 반납 파트-");
		while (true) {
			System.out.println("메뉴 선택 : 1(도서 대출), 2(도서 반납), 3(회원별 대출 현황 조회), 4(종료)");

			String menu_ = sc.nextLine();

			switch (menu_) {
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
			default:
			}
		}
	}

	private void loanBook() throws Exception {
		System.out.println("도서 대출");

		System.out.println("대출할 책 제목 : ");
		String title = sc.nextLine();
		int bookId = 0;
		String sql = "select * from books where title = '" + title + "'";

		pstmt = conn.prepareStatement(sql);

		rs = pstmt.executeQuery();
		while (rs.next()) {
			bookId = rs.getInt("id");
		}

//			도서 대출 현황 체크
		Boolean isTrue = true && ableToLoanMore();

		if (isTrue) {

			sql = "insert into loans (id, member_id, book_id, is_loan, loan_date) values";
			sql += "(null, '" + member.getId() + "','" + bookId + "','1',now())";

			pstmt = conn.prepareStatement(sql);

			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("처리 성공");
			} else {
				System.out.println("처리 실패");
			}
		} else {
			System.out.println("대출가능한 상태가 아닙니다!");
		}

	}

	private void returnBook() throws Exception {
		System.out.println("도서 반납");

		System.out.println("반납할 책 제목 : ");
		String title = sc.nextLine();

		int bookId = 0;
		String sql = "select * from books where title = '" + title + "'";
		pstmt = conn.prepareStatement(sql);

		rs = pstmt.executeQuery();
		while (rs.next()) {
			bookId = rs.getInt("id");
		}

//			도서 대출 현황 체크
		Boolean isTrue = true;

		if (isTrue) {

			sql = "insert into loans (id, member_id, book_id, is_loan, loan_date) values";
			sql += "(null, '" + member.getId() + "','" + bookId + "','-1',now())";

			pstmt = conn.prepareStatement(sql);

			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("처리 성공");
			} else {
				System.out.println("처리 실패");
			}
		} else {
			System.out.println("반납가능한 상태가 아닙니다!");
		}

	}

	private void showLoanList() throws Exception {
		System.out.println("회원별 대출 현황 조회");

		List<Map<String, Object>> loanList = getLoanList();

		for (Map<String, Object> map : loanList) {
			LoanDTO loan = (LoanDTO) map.get("loan");
			BookDTO book = (BookDTO) map.get("book");
			MemberDTO member = (MemberDTO) map.get("member");

			String str = "";

			str += "번호 = " + loan.getId() + ", ";
			str += "책제목 = " + book.getTitle() + ", ";
			str += "회원명 = " + member.getName() + ", ";
			str += "상태 = " + (loan.getIsLoan() == 1 ? "대출" : "반납") + ", ";
			str += "일자 = " + loan.getLoanDate();

			System.out.println(str);
		}
	}

	private List<Map<String, Object>> getLoanList() throws Exception {
		List<Map<String, Object>> loanList = new ArrayList<>();

		String sql = "select * from loans join books on loans.book_id = books.id "
				+ "join members on loans.member_id = members.id where member_id = '" + member.getId() + "'";
		pstmt = conn.prepareStatement(sql);

		rs = pstmt.executeQuery();
		while (rs.next()) {
			LoanDTO loan = new LoanDTO(rs.getInt("id"), rs.getInt("book_id"), rs.getInt("member_id"),
					rs.getInt("is_loan"), rs.getDate("loan_date"));
			BookDTO book = new BookDTO(rs.getInt("book_id"), rs.getString("title"), rs.getString("author"),
					rs.getString("publisher"));
			MemberDTO member = new MemberDTO(rs.getInt("member_id"), rs.getString("name"), rs.getString("birth"),
					rs.getString("phone"), rs.getString("email"), rs.getString("password"));
			Map<String, Object> map = new HashMap<>();
			map.put("loan", loan);
			map.put("book", book);
			map.put("member", member);

			loanList.add(map);
		}

		return loanList;

	}

	private boolean ableToLoanMore() throws Exception {
		List<Map<String, Object>> loanList = getLoanList();
		int count = 0;

		for (Map<String, Object> map : loanList) {
			LoanDTO loan = (LoanDTO) map.get("loan");
			count += loan.getIsLoan();
		}
		
		System.out.println(member.getName() + " 님은 " + (LOAN_BOOK_CAP - count) + "권 추가 대출 가능합니다.");

		return count < LOAN_BOOK_CAP;
	}

}
