package exam30;

public class DBConStr {

	private String dbDrv;
	private String dbUrl;
	private String dbUsr;
	private String dbPwd;
	
	public DBConStr() {
		dbDrv = "com.mysql.cj.jdbc.Driver";
		dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
		dbUsr = "javaUser";
		dbPwd = "1234";
	}

	public String getDbDrv() {
		return dbDrv;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public String getDbUsr() {
		return dbUsr;
	}

	public String getDbPwd() {
		return dbPwd;
	}
}
