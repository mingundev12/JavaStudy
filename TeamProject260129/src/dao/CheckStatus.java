package dao;

import java.sql.*;

public class CheckStatus {

    public static int getLoanStatusByTitle(Connection conn, String title) {
       
        String sql = "SELECT B.id, L.is_loan " +
                     "FROM Books B " +
                     "LEFT JOIN Loans L ON B.id = L.book_id " +
                     "WHERE B.title = ? " +
                     "ORDER BY L.id DESC LIMIT 1"; 

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, title);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int bookId = rs.getInt("id");
                    
                    if (rs.getObject("is_loan") == null) {
//                        System.out.println("[" + title + "] - 대출 이력이 없습니다.");
                        return 0;
                    }

                    int isLoan = rs.getInt("is_loan");

                    if (isLoan == 1) {
//                        System.out.println("[" + title + "] - 현재 대출 중입니다.");
                        return 1;  
                    } else {
//                        System.out.println("[" + title + "] - 반납된 도서입니다.");
                        return -1; 
                    }
                } else {
//                    System.out.println("❌ 해당 제목의 책을 찾을 수 없습니다.");
                    return 2; 
                }
            }
        } catch (SQLException e) {
//            e.printStackTrace();
            return 2;
        }
    }
}