package exam30;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	private Connection conn;
  	private PreparedStatement pstmt;
  	private ResultSet rs;
  	
  	public StudentDAO() throws Exception {
  		connect();
	}

	private void connect() throws Exception {
		String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
		String dbUsr = "javaUser";
		String dbPwd = "1234";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
	}
	
//	public void setInsert(StudentDTO student) throws Exception {
//		String sql = "";
//		sql += "insert into student (id_number, name, ssn, phone, address, created_date) values";
//		sql += "(null, ?, ?, ?, ?, now())";
//		
//		pstmt = conn.prepareStatement(sql);
//		pstmt.setString(1, student.getName());
//		pstmt.setString(2, student.getSsn());
//		pstmt.setString(3, student.getPhone());
//		pstmt.setString(4, student.getAddress());
//		
//		int result = pstmt.executeUpdate();
//		
//		if (result > 0) {
//			System.out.println("등록 성공");
//		} else {
//			System.out.println("등록 실패");
//		}
//	}
	
	public void executeQuery(String command, String sql) throws Exception {
		pstmt = conn.prepareStatement(command + sql);
		
		if (!command.toLowerCase().equals("select")) {
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println("처리 성공");
			} else {
				System.out.println("처리 실패");
			}
		} else {
			rs = pstmt.executeQuery();
		}
	}

	public List<StudentDTO> getStudentList() throws Exception {
		List<StudentDTO> list = new ArrayList<>();
		
		while (rs.next()) {
			list.add(new StudentDTO(
					rs.getInt("id_number"),
					rs.getString("name"),
					rs.getString("ssn"),
					rs.getString("phone"),
					rs.getString("address"),
					rs.getDate("created_date")
					));
		}
		
		return list;
	}
}
