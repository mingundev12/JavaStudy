package study20260113;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBConnect {
	private Connection conn; // DB 연결 유지
	private Statement st; // DB에 query 문 전달 및 결과 받기
	private ResultSet rs; // DB의 결과를 저장
	
	public DBConnect() {
		connect();
	}
	
	private void connect() {
//		 DB 접속
//		jar 는 java 압축 파일이기 때문에 직접 객체를 만드는 것을 할 수는 없다
//		존재하지 않는 파일을 열기가 실행될 수도 있기 때문에 예외처리를 해주어야 한다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "mingundev";
			String password = "1234";
			String url = "jdbc:mysql://localhost:3306/mingundev";
			
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("접속완료");
			
		} catch (Exception e) {
//			 try 에서 오류가 발생했을 때, 컴퓨터가 프로그램을 즉시 종료시키지 않고
//			오류를 회피하면서 프로그램 실행이 속행된다.
			System.out.println("접속실패");
			e.printStackTrace(); // 오류의 원인 출력
		}
	}
	
//	product 테이블의 데이터 가져오기
	public ArrayList<Product> selectData() {
		
		ArrayList<Product> products = new ArrayList<>();
//		쿼리문 작성하기
		String sql = "select * from product"; // product 테이블의 모든 데이터 조회
		
		try {
//		쿼리문 보내기
			st = conn.createStatement(); // Statement 생성
//		결과 받기
			rs = st.executeQuery(sql); // Query 문 보내고 받은 결과를 ResultSet 에 저장
			System.out.println("데이터 조회 완료");
		} catch (Exception e) {
			System.out.println("쿼리문 실패");
			e.printStackTrace();
		}
		
//		데이터들을 product 객체에 저장하기
		try {
			while (rs.next()) {
				Product temp = new Product(
						rs.getString("item_name"),
						rs.getInt("price"),
						rs.getInt("stock"),
						rs.getString("description")
						);
				products.add(temp);
			}
			System.out.println("객체생성 완료");
		} catch (Exception e) {
			System.out.println("객체생성 실패");
			e.printStackTrace();
		}
		
		return products;
	}
}
