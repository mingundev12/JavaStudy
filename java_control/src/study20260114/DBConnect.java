package study20260114;

import java.sql.*;

public class DBConnect {
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	
	
	public DBConnect() {
		connect(); // method to connect to DB
	}


	private void connect() {
//		execute DB Driver -> connect
//		login account
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "mingundev";
			String password = "1234";
			String url = "jdbc:mysql://localhost:3306/mingundev";
			
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println("접속 실패");
		}
	}

	public GameMember[] findAll() {
		GameMember[] gameMembers = new GameMember[10];
		
//		Make Query Script
		String sql = "select * from game_member";
		try {
//		Send Query Script
			st = conn.createStatement();
//		Recieve Result
			rs = st.executeQuery(sql);
			System.out.println("질의 완료");
			
			int i = 0;
			while(rs.next()) {
				GameMember data = new GameMember(
						rs.getString("name"), rs.getString("birth"),
						rs.getString("nick_name"), rs.getInt("level")
						);
				
				gameMembers[i] = data;
				i++;
			}
			System.out.println("객체생성 완료");
			
//		Save Result to Class Object Array
			
		} catch (Exception e) {
			System.out.println("질의 실패 및 객체생성 실패");
		}
		
		return gameMembers;
	}
	
	public Item[] findItem() {
		Item[] items = new Item[10];
		
		String sql = "SELECT * FROM ITEM";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			int i = 0;
			
			while (rs.next()) {
				Item item = new Item(
						rs.getString("ITEM_NAME"), rs.getInt("ITEM_PRICE"),
						rs.getString("ITEM_MAIN_IMAGE"), rs.getInt("ITEM_STOCK")
						);
				
				items[i] = item;
				i++;
			}
		} catch (Exception e) {
			System.out.println("데이터 생성 실패");
			e.printStackTrace();
		}
		
		return items;
	}
}
