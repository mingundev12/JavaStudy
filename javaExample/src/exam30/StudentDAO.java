package exam30;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	private String dbDrv;
	private String dbUrl;
	private String dbUsr;
	private String dbPwd;

	private Connection conn;
  	private PreparedStatement pstmt;
  	private ResultSet rs;
  	
  	public StudentDAO() throws Exception {
  		DBConStr conStr = new DBConStr();
  		dbDrv = conStr.getDbDrv();
  		dbUrl = conStr.getDbUrl();
  		dbUsr = conStr.getDbUsr();
  		dbPwd = conStr.getDbPwd();
  		
  		connect();
		System.out.println("- DB 접속 완료 -");
	}

	private void connect() throws Exception {
		Class.forName(dbDrv);
		conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
	}
	
	public void execute(String command, String sql) throws Exception {
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

	public List<StudentDTO> getList() throws Exception {
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

	public void dbClose() throws Exception {
		if(conn != null) { conn.close(); }
		if(pstmt != null) { pstmt.close(); }
		if(rs != null) { rs.close(); }
		System.out.println("- DB 접속 종료 -");
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
}
