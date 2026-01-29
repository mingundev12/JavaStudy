package loans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoanDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public LoanDAO() {
		
		String dbDrv = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
		String dbUsr = "library";
		String dbPwd = "1234";

		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
