package dao;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dto.BookDTO;

public class Search {

	public static void checkLoanAndOverdueStatus(Connection conn) throws Exception{
	        System.out.println("\n======= DB 실시간 대출 및 연체 현황 =======");
	        System.out.println("도서ID\t| 도서명\t\t| 상태\t| 연체여부");
	        System.out.println("--------------------------------------------------");

	        List<BookDTO> bookList = getBookList(conn);
	        
	        
	        for(BookDTO book : bookList) {
//	        	System.out.println(book);
		        String sql = "SELECT * " +
		                     "FROM Books B " +
		                     "LEFT JOIN Loans L ON B.id = L.book_id " +
		                     "where B.id = '" + book.getId() + "' order by L.id desc limit 1";
	
		        try (PreparedStatement pstmt = conn.prepareStatement(sql);
		             ResultSet rs = pstmt.executeQuery()) {
	
		            while (rs.next()) {
		                
		                int id = rs.getInt("id"); 
		                String title = rs.getString("title");
		                
		                int isLoanVal = rs.getInt("is_loan");
		                boolean isBorrowed = (isLoanVal == 1);
		                
		                Date loanDate = rs.getDate("loan_date");
	
		                String status = isBorrowed ? "대출 중" : "대출 가능";
		                String overdueStatus = "-";
	
		                if (isBorrowed && loanDate != null) {
		                    
		                    LocalDate dueDate = loanDate.toLocalDate().plusDays(7);
		                    if (dueDate.isBefore(LocalDate.now())) {
		                        overdueStatus = "연체 중 (기한: " + dueDate + ")";
		                    } else {
		                        overdueStatus = "정상 (기한: " + dueDate + ")";
		                    }
		                }
	
		                System.out.printf("%d\t| %-15s\t| %s\t| %s\n", id, title, status, overdueStatus);
		            }
		        } catch (SQLException e) {
		            System.out.println("조회 중 오류 발생: " + e.getMessage());
		        }
	        }
	    }

	private static List<BookDTO> getBookList(Connection conn) {
		List<BookDTO> bookList = new ArrayList<>();
		
		PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    
	    try {
	    	//-------------------------------------------------------
	    	String sql = "select * from books order by id desc";
 	    	pstmt = conn.prepareStatement(sql);
 	        rs = pstmt.executeQuery();
 	        while(rs.next()) {
 	        	int id = rs.getInt("id");
 	        	String title = rs.getString("title");
 	        	String author = rs.getString("author");
 	        	String publisher = rs.getString("publisher");
 	        	
 	        	bookList.add(new BookDTO(
 	        			id, title, author, publisher
 	        			));
 	        }
        }catch(Exception e) {
	    	System.out.println("드라이버 로딩 실패 또는 데이터베이스 접속 실패..");
        }
		return bookList;
	}
}